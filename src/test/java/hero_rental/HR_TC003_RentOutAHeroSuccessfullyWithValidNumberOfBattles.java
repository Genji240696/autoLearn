package hero_rental;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class HR_TC003_RentOutAHeroSuccessfullyWithValidNumberOfBattles extends BaseTest {
    WebDriver driver;
    BasePageObject basePage;
    MetamaskPageObject metamaskPage;
    RentPageObject rentPage;
    InventoryPageObject inventoryPage;
    @Parameters({ "browser", "url" })
    @BeforeClass
    public void beforeClass(String browserName, String appUrl) {
        log.info("---------------------------------Pre-Condition: Open browser and navigate---------------------------------");
        driver = getBrowserDriver(browserName, appUrl);
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
    }

    @Test
    public void HR_TC003_RentOutAHeroSuccessfullyWithValidNumberOfBattles() {
        log.info("----------HR_TC003_STEPS_01");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_01();

        log.info("switchToMetamaskWeb");
        metamaskPage.switchToMetamaskWeb();

        log.info("Step : clickToImportAntExistingWalletButtonWeb");
        metamaskPage.clickToImportAntExistingWalletButtonWeb();

        log.info("Step : clickIAgreeButtonWeb");
        metamaskPage.clickIAgreeButtonWeb();

        log.info("Step : inputMetamaskTextWeb");
        metamaskPage.inputMetamaskTextWeb();

        log.info("Step : clickConfirmSecretRecoveryPhraseButtonWeb");
        metamaskPage.clickConfirmSecretRecoveryPhraseButtonWeb();

        log.info("Step : inputNewPasswordTextboxWeb");
        metamaskPage.inputNewPasswordTextboxWeb();

        log.info("Step : inputConfirmPasswordTextboxWeb");
        metamaskPage.inputConfirmPasswordTextboxWeb();

        log.info("Step : clickTermsCheckboxWeb");
        metamaskPage.clickTermsCheckboxWeb();

        log.info("Step : clickImportMyWalletButtonWeb");
        metamaskPage.clickImportMyWalletButtonWeb();

        log.info("Step : clickGotItButtonWeb");
        metamaskPage.clickGotItButtonWeb();

        log.info("Step : clickNextButtonWeb");
        metamaskPage.clickNextButtonWeb();

        log.info("Step : clickDoneButtonWeb");
        metamaskPage.clickDoneButtonWeb();

        log.info("Step : switchToMarketplaceWeb");
        metamaskPage.switchToMarketplaceWeb();

        log.info("Step : clickConnectWalletButtonWeb");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickConnectWalletButtonWeb();

        log.info("Step : clickLoginWithMetaMaskButtonWeb");
        basePage.clickLoginWithMetaMaskButtonWeb();

        log.info("Step : switchPopupMetamask");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
        metamaskPage.switchPopupMetamask();

        log.info("Step : clickNextButtonPopup");
        metamaskPage.clickNextButtonPopup();

        log.info("Step : clickConnectButtonPopup");
        metamaskPage.clickConnectButtonPopup();

        log.info("Step : clickApproveButtonPopup");
        metamaskPage.clickApproveButtonPopup();

        log.info("Step : clickSwitchNetworkButtonPopup");
        metamaskPage.clickSwitchNetworkButtonPopup();

        log.info("Step : switchToMarketplaceWeb");
        metamaskPage.switchToMarketplaceWeb();

        log.info("Step : clickAcceptAndSignButtonWeb");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickAcceptAndSignButtonWeb();

        log.info("Step : switchPopupMetamask");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
        metamaskPage.switchPopupMetamask();

        log.info("Step : clickSignButtonPopup");
        metamaskPage.clickSignButtonPopup();

        log.info("Step : switchToMarketplaceWeb");
        metamaskPage.switchToMarketplaceWeb();

        log.info("Step : clickCloseIcon");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickCloseIcon();

        log.info("Step : clickCloseIcon");
        basePage.clickCloseIcon();

        log.info("Step : switchToMetamaskWeb");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
        metamaskPage.switchToMetamaskWeb();

        log.info("Step : clickImportTokensLinkWeb");
        metamaskPage.clickImportTokensLinkWeb();

        log.info("Step : inputTokenContractAddressTextboxWeb");
        metamaskPage.inputTokenContractAddressTextboxWeb("0x21f9b2137d4e1b83d09ea373be773a986c0e3f90");

        log.info("Step : clickToAddCustomTokenButtonWeb");
        metamaskPage.clickToAddCustomTokenButtonWeb();

        log.info("Step : clickImportTokensButtonWeb");
        metamaskPage.clickImportTokensButtonWeb();

        log.info("Step : clickBackIconButtonWeb");
        metamaskPage.clickBackIconButtonWeb();

        log.info("Step : clickToAssetsButtonWeb");
        metamaskPage.clickToAssetsButtonWeb();

//        log.info("Step : clickImportTokensLinkWeb");
//        metamaskPage.clickImportTokensLinkWeb();
//
//        log.info("Step : inputTokenContractAddressTextboxWeb");
//        metamaskPage.inputTokenContractAddressTextboxWeb("0x948deddc3d3cf03017fd4e42cc9ac874402d0bb9");
//
//        log.info("Step : clickToAddCustomTokenButtonWeb");
//        metamaskPage.clickToAddCustomTokenButtonWeb();
//
//        log.info("Step : clickImportTokensButtonWeb");
//        metamaskPage.clickImportTokensButtonWeb();
//
//        log.info("Step : clickBackIconButtonWeb");
//        metamaskPage.clickBackIconButtonWeb();
//
//        log.info("Step : clickToAssetsButtonWeb");
//        metamaskPage.clickToAssetsButtonWeb();

//        log.info("Step : clickImportTokensLinkWeb");
//        metamaskPage.clickImportTokensLinkWeb();
//
//        log.info("Step : inputTokenContractAddressTextboxWeb");
//        metamaskPage.inputTokenContractAddressTextboxWeb("0x15c9e651b5971feb66e19fe9e897be6bdc3e841a");
//
//        log.info("Step : clickToAddCustomTokenButtonWeb");
//        metamaskPage.clickToAddCustomTokenButtonWeb();
//
//        log.info("Step : clickImportTokensButtonWeb");
//        metamaskPage.clickImportTokensButtonWeb();
//
//        log.info("Step : clickBackIconButtonWeb");
//        metamaskPage.clickBackIconButtonWeb();
//
//        log.info("Step : clickToAssetsButtonWeb");
//        metamaskPage.clickToAssetsButtonWeb();

        log.info("Step : switchToMarketplaceWeb");
        metamaskPage.switchToMarketplaceWeb();

        //--------------------------------------------------------------------------------------
        log.info("----------HR_TC003_STEPS_02");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_02();

        log.info("Step : clickToAvatarProfile");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToAvatarProfile();

        log.info("Step : clickToProfileInventory");
        basePage.clickToProfileInventory();

        log.info("----------HR_TC003_STEPS_03");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_03();

        log.info("----------HR_TC003_STEPS_04");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_04();

        log.info("----------HR_TC003_STEPS_05");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_05();

        log.info("Step : clickTotHeroItemSelectRent");
        inventoryPage =  PageGeneratorManager.getPageGenerator().getInventoryPage(driver);
        inventoryPage.clickTotHeroItemSelectRent();

//        log.info("Step : getTextBattles");
//        String battles = basePage.getTextBattles();

        log.info("getPathPageUriHero");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        String path = basePage.getPathPageUriHero();
        System.out.println("---------------------current path: " + path);

        log.info("----------HR_TC003_STEPS_06");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_06();

        log.info("Step : clickToRentButton");
        basePage.clickToRentButton();

        log.info("----------HR_TC003_STEPS_07");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_07();

        log.info("Step : getTextBattlesForRent");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.getTextBattlesForRent("50");

        String rentPrice = "100";
        log.info("----------HR_TC003_STEPS_08");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_08(rentPrice);

        log.info("Step : inputRentTextBox");
        rentPage.inputPriceForRent(rentPrice);

        log.info("Step : inputBattlesForRent");
        String battlesForRent = "50";
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.inputBattlesForRent(battlesForRent);

        log.info("Step : getTextBattlesForRent");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.getTextBattlesForRent(battlesForRent);

        log.info("----------HR_TC003_STEPS_09");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_09();

        log.info("Step : clickCheckBoxRent");
        rentPage.clickCheckBoxRent();

        log.info("----------HR_TC003_STEPS_10");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_10();

        log.info("Step : clickPutUpForRentButton");
        rentPage.clickPutUpForRentButton();

        log.info("Step : switchPopupMetamask");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
        metamaskPage.switchPopupMetamask();

        log.info("----------HR_TC003_STEPS_11");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_11();

        log.info("Step : clickConfirmButtonPopup");
        metamaskPage.clickConfirmButtonPopup();

        log.info("Step : switchToMarketplaceWeb");
        metamaskPage.switchToMarketplaceWeb();

        log.info("----------HR_TC003_STEPS_12");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_12();

        log.info("Step : clickToIGotItButton");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToIGotItButton();

        log.info("----------HR_TC003_STEPS_13");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_13();

        log.info("Step : checkStatusRent");
        basePage.checkStatusRent();

        log.info("Step : clickToMenu");
        basePage.clickToMenu("Rent");

        log.info("Step : clickToCloseIcon");
        basePage.clickToCloseIcon();

        log.info("----------HR_TC003_STEPS_14");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_14();

        log.info("Step : checkRentHeroExistPageRent");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.checkRentHeroExistPageRent(path);

        log.info("Step : clickToAvatarProfile");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToAvatarProfile();

        log.info("Step : clickToProfileInventory");
        basePage.clickToProfileInventory();

        log.info("----------HR_TC003_STEPS_15");
        rentPage = PageGeneratorManager.getPageGenerator().getRentPage(driver);
        rentPage.HR_TC003_STEPS_15();

        log.info("Step : checkRentHeroExistPageInventory");
        inventoryPage =  PageGeneratorManager.getPageGenerator().getInventoryPage(driver);
        inventoryPage.checkRentHeroExistPageInventory(path);

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        log.info("---------------------------------Post-Condition: Close browser---------------------------------");
        closeBrowserAndDriver();
    }
}
