package pageObjects;

import commons.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageUIs.MetamaskPageUI;

public class MetamaskPageObject extends BasePage {

    WebDriver driver;

    public MetamaskPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToMetamaskWeb() {
        switchToWindowByTitle(driver, MetamaskPageUI.titleMetaMaskWeb);
    }

    public void switchToMarketplaceWeb() {
        switchToWindowByTitle(driver, MetamaskPageUI.titleMarketplaceWeb);
    }

    public void switchPopupMetamask() {
        //chờ popup xuất hiện
        switchToNumberOfwindow(driver, 3);
        // rồi switch qua
        switchToWindowByTitle(driver, MetamaskPageUI.titleMetaMaskPopup);
    }

    public void clickToImportAntExistingWalletButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.importAntExistingWalletButton);
        clickToElement(driver, MetamaskPageUI.importAntExistingWalletButton);
    }

    public void clickIAgreeButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.iAgreeButton);
        clickToElement(driver, MetamaskPageUI.iAgreeButton);
    }

    // lamvanbaoit+1@gmail.com
    public void inputMetamaskTextWebNotBNB() {
        sendKeyToElement(driver, MetamaskPageUI.password_1_Text, "job");
        sendKeyToElement(driver, MetamaskPageUI.password_2_Text, "lend");
        sendKeyToElement(driver, MetamaskPageUI.password_3_Text, "math");
        sendKeyToElement(driver, MetamaskPageUI.password_4_Text, "draft");
        sendKeyToElement(driver, MetamaskPageUI.password_5_Text, "salon");
        sendKeyToElement(driver, MetamaskPageUI.password_6_Text, "devote");
        sendKeyToElement(driver, MetamaskPageUI.password_7_Text, "ribbon");
        sendKeyToElement(driver, MetamaskPageUI.password_8_Text, "hood");
        sendKeyToElement(driver, MetamaskPageUI.password_9_Text, "goat");
        sendKeyToElement(driver, MetamaskPageUI.password_10_Text, "subway");
        sendKeyToElement(driver, MetamaskPageUI.password_11_Text, "problem");
        sendKeyToElement(driver, MetamaskPageUI.password_12_Text, "roof");
    }

    // lamvanbaoit+2@gmail.com
    public void inputMetamaskTextWeb() {
        sendKeyToElement(driver, MetamaskPageUI.password_1_Text, "dress");
        sendKeyToElement(driver, MetamaskPageUI.password_2_Text, "slush");
        sendKeyToElement(driver, MetamaskPageUI.password_3_Text, "gorilla");
        sendKeyToElement(driver, MetamaskPageUI.password_4_Text, "term");
        sendKeyToElement(driver, MetamaskPageUI.password_5_Text, "general");
        sendKeyToElement(driver, MetamaskPageUI.password_6_Text, "range");
        sendKeyToElement(driver, MetamaskPageUI.password_7_Text, "poet");
        sendKeyToElement(driver, MetamaskPageUI.password_8_Text, "abuse");
        sendKeyToElement(driver, MetamaskPageUI.password_9_Text, "aspect");
        sendKeyToElement(driver, MetamaskPageUI.password_10_Text, "assist");
        sendKeyToElement(driver, MetamaskPageUI.password_11_Text, "pledge");
        sendKeyToElement(driver, MetamaskPageUI.password_12_Text, "economy");
    }

    public void clickConfirmSecretRecoveryPhraseButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.confirmSecretRecoveryPhraseButton);
        clickToElement(driver, MetamaskPageUI.confirmSecretRecoveryPhraseButton);
    }

    public void inputNewPasswordTextboxWeb() {
        waitForElementVisible(driver, MetamaskPageUI.newPasswordTextbox);
        sendKeyToElement(driver, MetamaskPageUI.newPasswordTextbox, "0913012320Bao@");
    }

    public void inputConfirmPasswordTextboxWeb() {
        waitForElementVisible(driver, MetamaskPageUI.confirmPasswordTextbox);
        sendKeyToElement(driver, MetamaskPageUI.confirmPasswordTextbox, "0913012320Bao@");
    }

    public void clickTermsCheckboxWeb() {
        waitForElementClickable(driver, MetamaskPageUI.termsCheckbox);
        clickToElement(driver, MetamaskPageUI.termsCheckbox);
    }

    public void clickImportMyWalletButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.importMyWalletButton);
        clickToElement(driver, MetamaskPageUI.importMyWalletButton);
    }

    public void clickGotItButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.gotItButton);
        clickToElement(driver, MetamaskPageUI.gotItButton);
    }

    public void clickNextButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.nextButton);
        clickToElement(driver, MetamaskPageUI.nextButton);
    }

    public void clickDoneButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.doneButton);
        clickToElement(driver, MetamaskPageUI.doneButton);
    }

    public void clickNextButtonPopup() {
        clickToElementByJS(driver, MetamaskPageUI.nextPopupButton);
    }

    public void clickConnectButtonPopup() {
        clickToElementByJS(driver, MetamaskPageUI.connectPopupButton);
    }

    public void clickApproveButtonPopup() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        scrollToBottomPage(driver);
        clickToElementByJS(driver, MetamaskPageUI.approvePopupButton);
    }

    public void clickSwitchNetworkButtonPopup() {
        clickToElementByJS(driver, MetamaskPageUI.switchNetworkPopupButton);
    }

    public void clickSignButtonPopup() {
        clickToElementByJS(driver, MetamaskPageUI.signPopupButton);
    }

    public void clickImportTokensLinkWeb() {
        waitForElementClickable(driver, MetamaskPageUI.importTokensLink);
        clickToElement(driver, MetamaskPageUI.importTokensLink);
    }

    public void inputTokenContractAddressTextboxWeb(String text) {
        waitForElementVisible(driver, MetamaskPageUI.tokenContractAddressText);
        sendKeyToElement(driver, MetamaskPageUI.tokenContractAddressText, text);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickToAddCustomTokenButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.addCustomToken);
        clickToElement(driver, MetamaskPageUI.addCustomToken);
    }

    public void clickImportTokensButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.importTokensButton);
        clickToElement(driver, MetamaskPageUI.importTokensButton);
    }

    public void clickBackIconButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.backIcon);
        clickToElement(driver, MetamaskPageUI.backIcon);
    }

    public void clickToAssetsButtonWeb() {
        waitForElementClickable(driver, MetamaskPageUI.assetsButton);
        clickToElement(driver, MetamaskPageUI.assetsButton);
    }

    public void clickConfirmButtonPopup() {
        clickToElementByJS(driver, MetamaskPageUI.CONFIRM_POPUP_BUTTON);
    }


    public void clickRejectButtonPopup() {
        clickToElementByJS(driver, MetamaskPageUI.REJECT_POPUP_BUTTON);
    }

    public void verifyTextErrorNotHaveEnoughBNB() {
//        scrollToBottomPage(driver);
//        waitForElementVisible(driver, MetamaskPageUI.NOT_HAVE_ENOUGH_BNB);
//        String actual = getElementText(driver, MetamaskPageUI.NOT_HAVE_ENOUGH_BNB);
//        Assert.assertEquals(actual, "You do not have enough BNB in your account to pay for transaction fees on BSC Testnet network. Deposit BNB from another account.");
        boolean disableButton = isElementEnabled(driver, MetamaskPageUI.CONFIRM_POPUP_BUTTON);
        Assert.assertFalse(disableButton);
    }


}
