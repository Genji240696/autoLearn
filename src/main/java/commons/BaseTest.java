package commons;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	private WebDriver driver;

	// log4j
	// init log
	protected final Log log;

	// log4j
	// constructor
	protected BaseTest() {
		log = LogFactory.getLog(getClass());
	}

	private enum BROWSER {
		CHROME, FIREFOX, EDGE_CHROMIUM, SAFARI, COC_COC;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	protected WebDriver getBrowserDriver(String browserName) {
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		if (browser == BROWSER.FIREFOX) {
//			System.setProperty("webdriver.gecko.driver",
//					GlobalConstants.PROJECT_PATH + getDirectorySlash("browserDrivers") + "geckodriver.exe");

			WebDriverManager.firefoxdriver().setup();

//			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
//			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
//					GlobalConstants.PROJECT_PATH + getDirectorySlash("browserLogs") + "LogFirefox.log");

			driver = new FirefoxDriver();
		} else if (browser == BROWSER.CHROME) {
//			System.setProperty("webdriver.chrome.driver",
//					GlobalConstants.PROJECT_PATH + getDirectorySlash("browserDrivers") + "chromedriver.exe");

			WebDriverManager.chromedriver().setup();
//			WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();

			driver = new ChromeDriver();
		} else if (browser == BROWSER.EDGE_CHROMIUM) {
//			System.setProperty("webdriver.edge.driver",
//					GlobalConstants.PROJECT_PATH + getDirectorySlash("browserDrivers") + "msedgedriver.exe");

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		} else if (browser == BROWSER.SAFARI) {
			driver = new SafariDriver();
		} else if (browser == BROWSER.COC_COC) {
			WebDriverManager.chromedriver().driverVersion("112.0.130").setup();

			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");

			driver = new ChromeDriver(options);
		} else {
			throw new RuntimeException("Please enter correct browser name");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(GlobalConstants.TESTING_APP_URL);
		return driver;
	}

	protected WebDriver getBrowserDriver(String browserName, String appUrl) {
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		if (browser == BROWSER.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
//			FirefoxOptions options = new FirefoxOptions();
//			FirefoxProfile profile = new FirefoxProfile();
//			options.addArguments("--remote-allow-origins=*");
//			options.setAcceptInsecureCerts(true);
//			profile.addExtension(new File("extension/nkbihfbeogaeaoehlefnkodbefgpgknn.crx"));
//			options.setProfile(profile);
//			driver = new FirefoxDriver(options);
			driver = new FirefoxDriver();
		} else if (browser == BROWSER.CHROME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--allow-file-access-from-files");
			options.addExtensions(new File("extension/nkbihfbeogaeaoehlefnkodbefgpgknn.crx"));
			options.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(options);
//			driver = new  ChromeDriver();
		} else if (browser == BROWSER.EDGE_CHROMIUM) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		} else if (browser == BROWSER.SAFARI) {
			driver = new SafariDriver();

		} else if (browser == BROWSER.COC_COC) {
			WebDriverManager.chromiumdriver().driverVersion("112.0.130").setup();

			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");

			driver = new ChromeDriver(options);
		} else {
			throw new RuntimeException("Please enter correct browser name");
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
	}

	private String getDirectorySlash(String folderName) {
		if (isMac() || isUnix() || isSolaris()) {
			folderName = "/" + folderName + "/";
		} else if (isWindows()) {
			folderName = "\\" + folderName + "\\";
		} else {
			folderName = null;
		}
		return folderName;
	}

	private boolean isWindows() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("win") >= 0);
	}

	private boolean isMac() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("mac") >= 0);
	}

	private boolean isUnix() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("nix") >= 0
				|| GlobalConstants.OS_NAME.toLowerCase().indexOf("nux") >= 0);
	}

	private boolean isSolaris() {
		return (GlobalConstants.OS_NAME.toLowerCase().indexOf("sunos") >= 0);
	}

	@BeforeTest
	public void deleteAllFilesInReportNGScreenshot() {
		log.info("---------- START delete file in folder ----------");
		deleteAllFileInFolder();
		delete_Allure_Report();
		delete_Allure_Results();
		log.info("---------- END delete file in folder ----------");
	}

	public void deleteAllFileInFolder() {
		try {
			String pathFolderDownload = GlobalConstants.PROJECT_PATH + "/ReportNGScreenshots";
			File file = new File(pathFolderDownload);
			File[] listOfFiles = file.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
//					System.out.println(listOfFiles[i].getName());
					new File(listOfFiles[i].toString()).delete();
				}
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public void delete_Allure_Results() {
		try {
			String pathFolderDownload = GlobalConstants.PROJECT_PATH + "/allure-results";
			File file = new File(pathFolderDownload);
			File[] listOfFiles = file.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
//					System.out.println(listOfFiles[i].getName());
					new File(listOfFiles[i].toString()).delete();
				}
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public void delete_Allure_Report() {
		try {
			String pathFolderDownload = GlobalConstants.PROJECT_PATH + "/allure-report";
			File file = new File(pathFolderDownload);
			File[] listOfFiles = file.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
//					System.out.println(listOfFiles[i].getName());
					new File(listOfFiles[i].toString()).delete();
				}
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	protected void closeBrowserAndDriver() {
		String cmd = "";
		try {
			String osName = System.getProperty("os.name").toLowerCase();
			log.info("OS name = " + osName);

			String driverInstanceName = driver.toString().toLowerCase();
			log.info("Driver instance name = " + driverInstanceName);

			if (driverInstanceName.contains("chrome")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
				} else {
					cmd = "pkill chromedriver";
				}
			} else if (driverInstanceName.contains("internetexplorer")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
				}
			} else if (driverInstanceName.contains("firefox")) {
				if (osName.contains("windows")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
				} else {
					cmd = "pkill geckodriver";
				}
			} else if (driverInstanceName.contains("edge")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq msedgedriver*\"";
				} else {
					cmd = "pkill msedgedriver";
				}
			} else if (driverInstanceName.contains("opera")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq operadriver*\"";
				} else {
					cmd = "pkill operadriver";
				}
			} else if (driverInstanceName.contains("safari")) {
				if (osName.contains("mac")) {
					cmd = "pkill safaridriver";
				}
			}

			if (driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
			}
		} catch (Exception e) {
			log.info(e.getMessage());
		} finally {
			try {
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	protected void showBrowserConsoleLogs(WebDriver driver) {
		if (driver.toString().contains("chrome")) {
			LogEntries logs = driver.manage().logs().get("browser");
			List<LogEntry> logList = logs.getAll();
			for (LogEntry logging : logList) {
				log.info("----------------" + logging.getLevel().toString() + "---------------- \n"
						+ logging.getMessage());
			}
		}
	}

	protected int getRandomNumber(int minimum, int maximum) {
		Random rand = new Random();
		return minimum + rand.nextInt(maximum - minimum);
	}

	protected String getRandomEmail() {
		return "automation" + getRandomNumberByDateTime() + "@live.com";
	}

	// Get random number by date time minute second (no duplicate)
	protected long getRandomNumberByDateTime() {
		return Calendar.getInstance().getTimeInMillis() % 100000;
	}

	protected int generateRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(999);
	}

	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(4);
		return (generatedstring);
	}

	public Double randomPrices() {
		Random rand = new Random();
		Double generatedPrices = 1000.0 + (rand.nextDouble() * (5000.0 - 1000.0));
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		Double formattedPrice = Double.valueOf(decimalFormat.format(generatedPrices));
		return formattedPrice;
	}

	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	@AfterMethod(description = "Capture screenshot if test is failed")
	public void captureScreenshot(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			// 1. Get the test method name
			String testMethodName = result.getName();

			// 2. Get taken time | y-m-d-hr-mm-s
			Calendar calendar = new GregorianCalendar();
			int y = calendar.get(calendar.YEAR);
			int m = calendar.get(calendar.MONTH) + 1;
			int d = calendar.get(calendar.DATE);
			int hr = calendar.get(calendar.HOUR_OF_DAY);
			int mm = calendar.get(calendar.MINUTE);
			int sec = calendar.get(calendar.SECOND);
			String takenTime = y + "-" + m + "-" + d + "-" + hr + "-" + mm + "-" + sec;

			// 3. File location to save
			String fileName = testMethodName + "-" + takenTime + ".png";
			String fileLocation = GlobalConstants.PROJECT_PATH + "/screenshot/" + fileName;

			// 4. Save then attach to Allure report
			File screenshotBase64Data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshotBase64Data, new File(fileLocation));

				Path screenshotContentPath = Paths.get(fileLocation);
				InputStream inputStream = Files.newInputStream(screenshotContentPath);
				Allure.addAttachment(testMethodName, inputStream);
			} catch (Exception e) {
				System.out.println("---------------error---------------");
				e.printStackTrace();
			}
		}
	}
}
