package hero_trading;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class HR_TC001_SellAHeroSuccessfully extends BaseTest {
    WebDriver driver;
    BasePageObject basePage;
    MetamaskPageObject metamaskPage;
    SellPageObject sellPage;
    InventoryPageObject inventoryPage;
    RentPageObject rentPageObject;
    @Parameters({ "browser", "url" })
    @BeforeClass
    public void beforeClass(String browserName, String appUrl) {
        log.info("---------------------------------Pre-Condition: Open browser and navigate---------------------------------");
        driver = getBrowserDriver(browserName, appUrl);
    }

    @Test
    public void HR_TC001_SellAHeroSuccesfully() {
        log.info("----------HT_TC001_STEPS_01");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_01();

        log.info("Step : switchToMetamaskWeb");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
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

        log.info("----------HT_TC001_STEPS_02");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_02();

        log.info("Step : clickToAvatarProfile");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToAvatarProfile();

        log.info("Step : getTextYourBalance");
        String THC_CURRENT = sellPage.getTextYourBalance();
        System.out.println("THC_CURRENT: " + THC_CURRENT);

        log.info("Step : clickToProfileInventory");
        basePage.clickToProfileInventory();

        log.info("----------HT_TC001_STEPS_03");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_03();

        log.info("----------HT_TC001_STEPS_04");
        sellPage.HT_TC001_STEPS_04();

        log.info("Step : clickTotHeroItemSelectSell");
        inventoryPage =  PageGeneratorManager.getPageGenerator().getInventoryPage(driver);
        inventoryPage.clickTotHeroItemSelectSell();

        log.info("Step : getPathPageUriHero");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        String path = basePage.getPathPageUriHero();
        System.out.println("------------current path: " + path);

        log.info("----------HT_TC001_STEPS_05");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_05();

        log.info("Step : clickToSellButton");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToSellButton();

        String priceSell = "100";
        log.info("----------HT_TC001_STEPS_06");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_06(priceSell);

        log.info("Step : inputSellTextBox");
        sellPage.inputSellTextBox(priceSell);

        log.info("Step : getTextServiceFee");
        String FEE_THC = sellPage.getTextServiceFee();
        System.out.println("FEE_THC: " + FEE_THC);

        log.info("----------HT_TC001_STEPS_07");
        sellPage.HT_TC001_STEPS_07();

        log.info("Step : clickToSellNowButton");
        sellPage.clickToSellNowButton();

        log.info("Step : switchPopupMetamask");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
        metamaskPage.switchPopupMetamask();

        log.info("----------HT_TC001_STEPS_08");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_08();

        log.info("Step : clickConfirmButtonPopup");
        metamaskPage = PageGeneratorManager.getPageGenerator().getMetamaskPage(driver);
        metamaskPage.clickConfirmButtonPopup();

        log.info("Step : switchToMarketplaceWeb");
        metamaskPage.switchToMarketplaceWeb();

        log.info("----------HT_TC001_STEPS_09");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_09();

        log.info("Step : verifyTextMessagePopup");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.verifyTextMessagePopup();

        log.info("Step : clickToIUnderstandButton");
        basePage.clickToIUnderstandButton();

        log.info("----------HT_TC001_STEPS_10");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_10();

        log.info("Step : checkStatusSell");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.checkStatusSell();

        log.info("Step : clickToMenu");
        basePage.clickToMenu("Buy");

//        log.info("Step : clickToCloseIcon");
//        basePage.clickToCloseIcon();

        log.info("----------HT_TC001_STEPS_11");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_11();

        log.info("----------HT_TC001_STEPS_12");
        sellPage.HT_TC001_STEPS_12();

        log.info("Step : checkSellHeroExistPageBuy");
        sellPage.checkSellHeroExistPageBuy(path);

        log.info("Step : priceSellHero");
        sellPage.checkPriceSellDisplayedExistPageBuy(priceSell);

        log.info("Step : clickToAvatarProfile");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToAvatarProfile();

        log.info("Step : clickToProfileInventory");
        basePage.clickToProfileInventory();

        log.info("----------HT_TC001_STEPS_13");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_13();

        log.info("----------HT_TC001_STEPS_14");
        sellPage.HT_TC001_STEPS_14();

        log.info("Step : checkSellHeroExistPageInventory");
        inventoryPage =  PageGeneratorManager.getPageGenerator().getInventoryPage(driver);
        inventoryPage.checkSellHeroExistPageInventory(path);

        log.info("Step : clickToAvatarProfile");
        basePage = PageGeneratorManager.getPageGenerator().getBasePage(driver);
        basePage.clickToAvatarProfile();

        log.info("----------HT_TC001_STEPS_15");
        sellPage = PageGeneratorManager.getPageGenerator().getSellPage(driver);
        sellPage.HT_TC001_STEPS_15();

        log.info("Step : getTextBalanceAfterBuy");
        sellPage.getTextBalanceAfterBuy(THC_CURRENT);
    }



    @AfterClass(alwaysRun = true)
    public void afterClass() {
        log.info("---------------------------------Post-Condition: Close browser---------------------------------");
        closeBrowserAndDriver();
    }
}
