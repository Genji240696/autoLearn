package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageUIs.BasePageUI;

public class BasePageObject extends BasePage {
    WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickConnectWalletButtonWeb() {
        waitForElementClickable(driver, BasePageUI.connectWalletButton);
        clickToElement(driver, BasePageUI.connectWalletButton);
    }

    public void clickLoginWithMetaMaskButtonWeb() {
        waitForElementClickable(driver, BasePageUI.loginWithMetaMaskButton);
        clickToElement(driver, BasePageUI.loginWithMetaMaskButton);
    }

    public void clickAcceptAndSignButtonWeb() {
        waitForElementClickable(driver, BasePageUI.acceptAndSignButton);
        clickToElement(driver, BasePageUI.acceptAndSignButton);
    }

    public void clickCloseIcon() {
        waitForElementClickable(driver, BasePageUI.closeButton);
        clickToElement(driver, BasePageUI.closeButton);
    }

    public void clickToMenu(String text) {
        waitForElementClickable(driver, BasePageUI.MENU_GENERAL, text);
        clickToElement(driver, BasePageUI.MENU_GENERAL, text);
    }

    public void clickToCheckoutButton() {
        waitForElementClickable(driver, BasePageUI.checkoutButton);
        clickToElement(driver, BasePageUI.checkoutButton);
    }

    public void clickToCloseIcon() {
        boolean isElement = isElementDisplayed(driver, BasePageUI.closeIcon);
        if (isElement) {
            waitForElementClickable(driver, BasePageUI.closeIcon);
            clickToElement(driver, BasePageUI.closeIcon);
        } else {
            System.out.println("not find element");
        }
    }

    public void clickToCloseButton() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        waitForElementClickable(driver, BasePageUI.closePopupButton);
        clickToElement(driver, BasePageUI.closePopupButton);
    }

    public void clickToAvatarProfile() {
        waitForElementClickable(driver, BasePageUI.avatarIcon);
        clickToElement(driver, BasePageUI.avatarIcon);
    }

    public void clickToProfileInventory() {
        waitForElementClickable(driver, BasePageUI.inventoryButton);
        clickToElement(driver, BasePageUI.inventoryButton);
        sleepInSecond(3);
        refreshToPage(driver);
        sleepInSecond(3);
    }

    public String getTextToBalance() {
        waitForElementVisible(driver, BasePageUI.BALANCE_THC_TEXT);
        return getElementText(driver, BasePageUI.BALANCE_THC_TEXT);
    }

    public String getPathPageUriHero() {
        String uri = getPageUri(driver);
        String[] parts = uri.split("/"); // Tách chuỗi thành các phần tử bằng dấu gạch chéo ngược ("/")

        if (parts.length > 0) {
            return parts[parts.length - 1]; // Lấy phần tử cuối cùng trong mảng
        }
        return null;
    }

    public void clickToBuyButton() {
        waitForElementClickable(driver, BasePageUI.BUY_BUTTON);
        clickToElement(driver, BasePageUI.BUY_BUTTON);
    }

    public String getTextOwnerByMe() {
        waitForElementVisible(driver, BasePageUI.OWNER_BY_MY_TEXT);
        return getElementText(driver, BasePageUI.OWNER_BY_MY_TEXT);
    }

    public void clickToSellButton() {
        waitForElementClickable(driver, BasePageUI.SELL_BUTTON);
        clickToElement(driver, BasePageUI.SELL_BUTTON);
    }

    public void clickToRentButton() {
        waitForElementClickable(driver, BasePageUI.RENT_OUT_BUTTON);
        clickToElement(driver, BasePageUI.RENT_OUT_BUTTON);
    }

    public void verifyTextMessagePopup() {
        waitForElementVisible(driver, BasePageUI.MESSAGE_SELL_TEXT);
        String text = getElementText(driver, BasePageUI.MESSAGE_SELL_TEXT);
        Assert.assertEquals(text, "YOUR REQUEST WILL BE HANDLED SOON!");
    }

    public void verifyTextErrorMessagePopup() {
        waitForElementVisible(driver, BasePageUI.MESSAGE_ERROR_TEXT);
        String text = getElementText(driver, BasePageUI.MESSAGE_ERROR_TEXT);
        Assert.assertEquals(text, "Transaction has been canceled");
    }

    public void verifyTextErrorMessagePopupCheckOut() {
        waitForElementVisible(driver, BasePageUI.MESSAGE_ERROR_CHECKOUT_TEXT);
        String text = getElementText(driver, BasePageUI.MESSAGE_ERROR_CHECKOUT_TEXT);
        Assert.assertEquals(text, "Your balance is not enough funds. Please deposit more and submit again");
    }

    public void verifyTextErrorMessage(String text) {
        waitForElementVisible(driver, BasePageUI.ERROR_MESSAGE_TEXT);
        String textActual = getElementText(driver, BasePageUI.ERROR_MESSAGE_TEXT);
        Assert.assertEquals(textActual, text);
    }

    public void clickToIUnderstandButton() {
        waitForElementClickable(driver, BasePageUI.I_UNDERSTAND_BUTTON);
        clickToElement(driver, BasePageUI.I_UNDERSTAND_BUTTON);
    }

    public void clickToIGotItButton() {
        waitForElementClickable(driver, BasePageUI.I_GOT_IT);
        clickToElement(driver, BasePageUI.I_GOT_IT);
    }

    public String getTextBattles() {
        String number = getElementText(driver, BasePageUI.gTHC_BATTLES);
        String battles = number.substring(2);
        return battles;
    }

    public void checkStatusSell() {
        for (int i = 0; i < 3; i++) {
            if (isElementUndisplayed(driver, BasePageUI.STOP_SELLING_BUTTON)) {
                refreshToPage(driver);
            } else {
                waitForElementVisible(driver, BasePageUI.STOP_SELLING_BUTTON);
            }
        }
    }

    public void checkStatusRent() {
        for (int i = 0; i < 3; i++) {
            if (isElementUndisplayed(driver, BasePageUI.CANCEL_RENTING_BUTTON)) {
                refreshToPage(driver);
            } else {
                isElementDisplayed(driver, BasePageUI.CANCEL_RENTING_BUTTON);
            }
        }
    }

    public void clickToStopSellingButton() {
        waitForElementVisible(driver, BasePageUI.STOP_SELLING_BUTTON);
        clickToElement(driver, BasePageUI.STOP_SELLING_BUTTON);
    }

    public void clickToStopSellingButtonPopup() {
        waitForElementVisible(driver, BasePageUI.STOP_SELLING_POPUP_BUTTON);
        clickToElement(driver, BasePageUI.STOP_SELLING_POPUP_BUTTON);
    }


    public void clickToCancelRentingButton() {
        waitForElementVisible(driver, BasePageUI.CANCEL_RENTING_BUTTON);
        clickToElement(driver, BasePageUI.CANCEL_RENTING_BUTTON);
    }

    public void clickToCancelRentingButtonPopup() {
        waitForElementVisible(driver, BasePageUI.STOP_RENTING_POPUP_BUTTON);
        clickToElement(driver, BasePageUI.STOP_RENTING_POPUP_BUTTON);
    }

    public void checkDisplayedRentOutAndSell() {
        for (int i = 0; i < 3; i++) {
            if (isElementUndisplayed(driver, BasePageUI.RENT_OUT_BUTTON) && isElementUndisplayed(driver, BasePageUI.SELL_BUTTON)) {
                refreshToPage(driver);
            } else {
                isElementDisplayed(driver, BasePageUI.RENT_OUT_BUTTON);
                isElementDisplayed(driver, BasePageUI.SELL_BUTTON);
            }
        }

    }

    public void clickTocCancelButton() {
        waitForElementVisible(driver, BasePageUI.CANCEL_BUTTON);
        clickToElement(driver, BasePageUI.CANCEL_BUTTON);
    }

    public void checkStatusBuy() {
        waitForElementVisible(driver, BasePageUI.BUY_BUTTON);
        isElementDisplayed(driver, BasePageUI.BUY_BUTTON);
    }
}
