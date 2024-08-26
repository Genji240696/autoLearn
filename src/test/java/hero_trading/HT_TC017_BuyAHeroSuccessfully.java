package hero_trading;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class HT_TC017_BuyAHeroSuccessfully extends BaseTest {
    WebDriver driver;
    BasePageObject basePage;
    MetamaskPageObject metamaskPage;
    BuyPageObject buyPage;
    InventoryPageObject inventoryPage;
    @Parameters({ "browser", "url" })
    @BeforeClass
    public void beforeClass(String browserName, String appUrl) {
        log.info("---------------------------------Pre-Condition: Open browser and navigate---------------------------------");
        driver = getBrowserDriver(browserName, appUrl);
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
    }

    @Test
    public void HT_TC017_BuyAHeroSuccessfully() {
        log.info("----------HT_TC001_STEPS_01");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_01();

        log.info("Step : switchToMetamaskWeb");
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
//
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

        log.info("Step : clickToAvatarProfile");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToAvatarProfile();

        log.info("Step : getTextToBalance");
        String totalBalanceTHC = basePage.getTextToBalance();

        log.info("----------HT_TC017_STEPS_02");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_02(totalBalanceTHC);

        log.info("----------HT_TC017_STEPS_03");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_03();

        log.info("clickToMenu");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToMenu("Buy");

        log.info("Step : clickToCloseIcon");
        basePage.clickToCloseIcon();

        log.info("Step : clickToSortDropList");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.clickToSortDropList("Cheapest Price per Remaining gTHC battles");

        log.info("----------HT_TC001_STEPS_04");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_04();

        log.info("----------HT_TC001_STEPS_05");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_05();

        log.info("Step : clickTotHeroItem");
        Double priceBuyHeroRandomCurrent = randomPrices();
        System.out.println("priceBuyHeroRandomCurrent: " + priceBuyHeroRandomCurrent);
        Double PRICE_BUY_HERO = buyPage.clickTotHeroItem(100.00);
        System.out.println("priceBuyHero: " + PRICE_BUY_HERO);

        log.info("Step : getPathPageUriHero");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        String path = basePage.getPathPageUriHero();
        System.out.println("PATH: " + path);

        log.info("----------HT_TC001_STEPS_06");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_06();

        log.info("Step : clickToBuyButton");
        basePage.clickToBuyButton();

        log.info("----------HT_TC001_STEPS_07");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_07();

        log.info("Step : clickToCheckoutButton");
        basePage.clickToCheckoutButton();

        log.info("Step : switchPopupMetamask");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
        metamaskPage.switchPopupMetamask();

        log.info("----------HT_TC001_STEPS_08");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_08();

        log.info("Step : clickConfirmButtonPopup");
        metamaskPage.clickConfirmButtonPopup();

        log.info("----------HT_TC001_STEPS_09");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_09();

        log.info("----------HT_TC001_STEPS_10");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_10();

        log.info("Step : switchToMarketplaceWeb");
        metamaskPage.switchToMarketplaceWeb();

        log.info("Step : clickToCloseButton");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToCloseButton();

        log.info("----------HT_TC001_STEPS_11");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_11();

        log.info("----------HT_TC001_STEPS_12");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_12();

        log.info("----------HT_TC001_STEPS_13");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_13();

        log.info("----------HT_TC001_STEPS_14");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_14();

        log.info("----------HT_TC001_STEPS_15");
        buyPage = PageGeneratorManager.getPageGenerator().getBuyPage(driver);
        buyPage.HT_TC017_STEPS_15();

        log.info("Step : clickToAvatarProfile");
        basePage.clickToAvatarProfile();

        log.info("Step : clickToProfileInventory");
        basePage.clickToProfileInventory();

        log.info("Step : getTextToPathHero");
        inventoryPage =  PageGeneratorManager.getPageGenerator().getInventoryPage(driver);
        inventoryPage.getTextToPathHero(path);

        log.info("Step : getTextOwnerByMe");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        String textOwner = basePage.getTextOwnerByMe();
        Assert.assertEquals(textOwner, "Owner by me");

        log.info("Step : clickToAvatarProfile");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToAvatarProfile();

        log.info("Step : clickToAvatarProfile");
        basePage.clickToAvatarProfile();

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        log.info("---------------------------------Post-Condition: Close browser---------------------------------");
        closeBrowserAndDriver();
    }
}
