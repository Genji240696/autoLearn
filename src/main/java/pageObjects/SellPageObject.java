package pageObjects;

import commons.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageUIs.BasePageUI;
import pageUIs.BuyPageUI;
import pageUIs.SellPageUI;

import java.util.List;

public class SellPageObject extends BasePage {
    WebDriver driver;

    public SellPageObject(WebDriver driver) {
        this.driver = driver;
    }

    // HR_TC001_SellAHeroSuccesfully
    @Step("Given Stella logs in her account")
    public void HT_TC001_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC001_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HT_TC001_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HT_TC001_STEPS_04() {}
    @Step("And she clicks on Sell button")
    public void HT_TC001_STEPS_05() {}
    @Step("And she inputs the hero price <Price> {0}")
    public void HT_TC001_STEPS_06(String priceSell) {}
    @Step("And she clicks on Sell Now button")
    public void HT_TC001_STEPS_07() {}
    @Step("When she signs with her wallet to complete transaction")
    public void HT_TC001_STEPS_08() {}
    @Step("Then a popup displays with message \"YOUR REQUEST WILL BE HANDLED SOON!\"")
    public void HT_TC001_STEPS_09() {}
    @Step("And this hero has \"Selling\" status")
    public void HT_TC001_STEPS_10() {}
    @Step("And Stop Selling button displays in the Hero details page")
    public void HT_TC001_STEPS_11() {}
    @Step("And Selling price displays correctly in the Hero details page")
    public void HT_TC001_STEPS_12() {}
    @Step("And the \"SELLING\" label displays in the hero at the Hero Inventory")
    public void HT_TC001_STEPS_13() {}
    @Step("And this hero displays in the Heroes Marketplace with the correct information")
    public void HT_TC001_STEPS_14() {}
    @Step("And no transaction fee is deducted from her wallet")
    public void HT_TC001_STEPS_15() {}

    // HR_TC002_SellAHeroThatWasBoughtFromMarketplaceSuccessfully
    @Step("Given Stella logs in her account")
    public void HT_TC002_STEPS_01() {}
    @Step("And she buy an hero in the Marketplace successfully")
    public void HT_TC002_STEPS_02() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC002_STEPS_03() {}
    @Step("And she selects the hero she just bought")
    public void HT_TC002_STEPS_04() {}
    @Step("And she clicks on Sell button")
    public void HT_TC002_STEPS_05() {}
    @Step("And she inputs the hero price <Price> {0}")
    public void HT_TC002_STEPS_06(String priceSell) {}
    @Step("And she clicks on Sell Now button")
    public void HT_TC002_STEPS_07() {}
    @Step("When she signs with her wallet to complete transaction")
    public void HT_TC002_STEPS_08() {}
    @Step("Then a popup displays with message 'YOUR REQUEST WILL BE HANDLED SOON!'")
    public void HT_TC002_STEPS_09() {}
    @Step("And this hero has 'Selling' status")
    public void HT_TC002_STEPS_10() {}
    @Step("And Stop Selling button displays in the Hero details page ")
    public void HT_TC002_STEPS_11() {}
    @Step("And Selling price displays correctly in the Hero details page")
    public void HT_TC002_STEPS_12() {}
    @Step("And the 'SELLING' label displays in the hero at the Hero Inventory")
    public void HT_TC002_STEPS_13() {}
    @Step("And this hero displays in the Heroes Marketplace with the correct information")
    public void HT_TC002_STEPS_14() {}
    @Step("And no transaction fee is deducted from her wallet")
    public void HT_TC002_STEPS_15() {}

    // HR_TC003_SellAHeroThatWasCanceledSellingBefore
    @Step("Given Stella logs in her account")
    public void HT_TC003_STEPS_01() {}
    @Step("And she sell a hero in the Marketplace successfully")
    public void HT_TC003_STEPS_02() {}
    @Step("And she cancel selling this hero successfully")
    public void HT_TC003_STEPS_03() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC003_STEPS_04() {}
    @Step("And she selects the hero that was canceled selling before")
    public void HT_TC003_STEPS_05() {}
    @Step("And she clicks on Sell button")
    public void HT_TC003_STEPS_06() {}
    @Step("And she inputs the hero price <Price> {0}")
    public void HT_TC003_STEPS_07(String priceSell) {}
    @Step("And she clicks on Sell Now button")
    public void HT_TC003_STEPS_08() {}
    @Step("When she signs with her wallet to complete transaction")
    public void HT_TC003_STEPS_09() {}
    @Step("Then a popup displays with message \"YOUR REQUEST WILL BE HANDLED SOON!\"")
    public void HT_TC003_STEPS_10() {}
    @Step("And this hero has \"Selling\" status")
    public void HT_TC003_STEPS_11() {}
    @Step("And Stop Selling button displays in the Hero details page")
    public void HT_TC003_STEPS_12() {}
    @Step("And Selling price displays correctly in the Hero details page")
    public void HT_TC003_STEPS_13() {}
    @Step("And the \"SELLING\" label displays in the hero at the Hero Inventory")
    public void HT_TC003_STEPS_14() {}
    @Step("And this hero displays in the Heroes Marketplace with the correct information")
    public void HT_TC003_STEPS_15() {}
    @Step("And no transaction fee is deducted from her wallet")
    public void HT_TC003_STEPS_16() {}

    // HR_TC004_CancelSellingAHero
    @Step("Given Stella logs in her account")
    public void HT_TC004_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC004_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HT_TC004_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HT_TC004_STEPS_04() {}
    @Step("And she clicks on Sell button")
    public void HT_TC004_STEPS_05() {}
    @Step("And she inputs the hero price <Price> {0}")
    public void HT_TC004_STEPS_06(String priceSell) {}
    @Step("When she clicks on Cancel button")
    public void HT_TC004_STEPS_07() {}
    @Step("Then she back to the Hero details page")
    public void HT_TC004_STEPS_08() {}
    @Step("And this hero is still ready for sales")
    public void HT_TC004_STEPS_09() {}

    // HR_TC005_CanNotSellAHeroWithPriceThatIsLessThanMinPrice
    @Step("Given Stella logs in her account")
    public void HT_TC005_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC005_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HT_TC005_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HT_TC005_STEPS_04() {}
    @Step("And she clicks on Sell button")
    public void HT_TC005_STEPS_05() {}
    @Step("When she inputs the hero price <Price> that is less than the min price <Min Price> {0}")
    public void HT_TC005_STEPS_06(String priceSell) {}
    @Step("Then she sees an error message 'The minimum selling price is 200.000 THC' on the Sell Item popup")
    public void HT_TC005_STEPS_07() {}
    @Step("And the Sell Now button is disabled")
    public void HT_TC005_STEPS_08() {}

    // HR_TC006_CanNotSellAHeroWithPriceThatIsGreaterThanMaxPrice
    @Step("Given Stella logs in her account")
    public void HT_TC006_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC006_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HT_TC006_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HT_TC006_STEPS_04() {}
    @Step("And she clicks on Sell button")
    public void HT_TC006_STEPS_05() {}
    @Step("When she inputs the hero with price <Price> that is greater than the max price <Max Price> {0}")
    public void HT_TC006_STEPS_06(String priceSell) {}
    @Step("Then she sees an error message 'The maximum selling price is 99999.999 THC'")
    public void HT_TC006_STEPS_07() {}
    @Step("And she can not continue to sell this hero")
    public void HT_TC006_STEPS_08() {}

    // HR_TC007_CanNotSellAHeroWhenNotInputPrice
    @Step("Given Stella logs in her account")
    public void HT_TC007_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC007_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HT_TC007_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HT_TC007_STEPS_04() {}
    @Step("And she clicks on Sell button")
    public void HT_TC007_STEPS_05() {}
    @Step("When she does not input the price for selling")
    public void HT_TC007_STEPS_06() {}
    @Step("Then she can not continue to sell this hero because the Sell Now button is disabled")
    public void HT_TC007_STEPS_07() {}

    // HR_TC008_CanNotSellAHeroHavingStatusSelling
    @Step("Given Stella logs in her account")
    public void HT_TC008_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC008_STEPS_02() {}
    @Step("And her Inventory has at least a hero that has 'Selling' status")
    public void HT_TC008_STEPS_03() {}
    @Step("When she selects a hero that has 'Selling' status")
    public void HT_TC009_STEPS_04() {}
    @Step("Then the Sell button does not display in the Hero details page")
    public void HT_TC010_STEPS_05() {}

    // HR_TC013_CancelSellingTransaction
    @Step("Given Stella logs in her account")
    public void HT_TC013_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC013_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HT_TC013_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HT_TC013_STEPS_04() {}
    @Step("And she clicks on Sell button")
    public void HT_TC013_STEPS_05() {}
    @Step("And she inputs the hero price <Price> {0}")
    public void HT_TC013_STEPS_06(String priceSell) {}
    @Step("And she clicks on Sell Now button")
    public void HT_TC013_STEPS_07() {}
    @Step("When she cancel the selling transaction/clicks Reject on metamask")
    public void HT_TC013_STEPS_08() {}
    @Step("Then an error message displays: 'Something went wrong. Please try again'")
    public void HT_TC013_STEPS_09() {}

    // HR_TC014_StopSellingAHeroSuccessfully
    @Step("Given Stella logs in her account ")
    public void HT_TC014_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC014_STEPS_02() {}
    @Step("And her Inventory has at least a hero that has 'Selling' status")
    public void HT_TC014_STEPS_03() {}
    @Step("And she selects a hero that has 'Selling' status")
    public void HT_TC014_STEPS_04() {}
    @Step("And she clicks on Stop selling button in the Hero details page")
    public void HT_TC014_STEPS_05() {}
    @Step("And she clicks on Stop selling button on the Stop selling popup")
    public void HT_TC014_STEPS_06() {}
    @Step("When she confirms the stop selling transaction")
    public void HT_TC014_STEPS_07() {}
    @Step("Then a popup displays with message 'YOUR REQUEST WILL BE HANDLED SOON'")
    public void HT_TC014_STEPS_08() {}
    @Step("And this hero is ready for sales ")
    public void HT_TC014_STEPS_09() {}
    @Step("And the Sell button and Rent out button displays in the Hero details page")
    public void HT_TC014_STEPS_10() {}
    @Step("And this hero does not display in the Heroes Marketplace")
    public void HT_TC014_STEPS_11() {}
    @Step("And a transaction fee is deducted from her wallet")
    public void HT_TC014_STEPS_12() {}

    // HR_TC015_StopSellingAHeroUnsuccessfullyBecauseOfNotEnoughBNBForGasFee
    @Step("Given Stella logs in her account ")
    public void HT_TC015_STEPS_01() {}
    @Step("And the BNB balance in her wallet is 0")
    public void HT_TC015_STEPS_02() {}
    @Step("And she navigate to Hero Inventory")
    public void HT_TC015_STEPS_03() {}
    @Step("And her Inventory has at least a hero that has 'Selling' status")
    public void HT_TC015_STEPS_04() {}
    @Step("And she selects a hero that has 'Selling' status")
    public void HT_TC015_STEPS_05() {}
    @Step("And she clicks on Stop selling button in the Hero details page")
    public void HT_TC015_STEPS_06() {}
    @Step("When she clicks on Stop selling button on the Stop selling popup")
    public void HT_TC015_STEPS_07() {}
    @Step("Then she can not confirm the stop selling transaction ")
    public void HT_TC015_STEPS_08() {}
    @Step("And this hero still displays in the Marketplace for selling")
    public void HT_TC015_STEPS_09() {}


    @Description("{0}")
    public void inputSellTextBox(String price) {
        waitForElementVisible(driver, SellPageUI.THC_TEXTBOX);
        sendKeyToElement(driver, SellPageUI.THC_TEXTBOX, price);
    }

    public String getTextYourBalance() {
        waitForElementVisible(driver, BasePageUI.BALANCE_THC_TEXT);
        String THC_CURRENT = getElementText(driver, BasePageUI.BALANCE_THC_TEXT);
        return THC_CURRENT;
    }

    public String getTextServiceFee() {
        waitForElementVisible(driver, SellPageUI.SERVICE_FEE_TEXTBOX);
        String FEE_THC = getElementText(driver, SellPageUI.SERVICE_FEE_TEXTBOX);
        return FEE_THC;
    }

    public void clickToSellNowButton() {
        waitForElementClickable(driver, SellPageUI.SELL_NOW_BUTTON);
        clickToElement(driver, SellPageUI.SELL_NOW_BUTTON);
    }

    public void checkSellNowButtonDisabled() {
        waitForElementVisible(driver, SellPageUI.SELL_NOW_BUTTON);
        boolean sellNowDisabled = isElementEnabled(driver, SellPageUI.SELL_NOW_BUTTON);
        Assert.assertFalse(sellNowDisabled);
    }

    public void clickToCancelButton() {
        waitForElementClickable(driver, SellPageUI.CANCEL_BUTTON);
        clickToElement(driver, SellPageUI.CANCEL_BUTTON);
    }

    public void checkPriceSellDisplayedExistPageBuy(String price) {
        waitForElementVisible(driver, BasePageUI.AMOUNT_THC);
        String number = getElementText(driver, BasePageUI.AMOUNT_THC);
        String priceCurrent = number.replaceAll("[^0-9]", "");
        Assert.assertEquals(priceCurrent, price);
    }

    public void getTextBalanceAfterBuy(String THC_CURRENT) {
        waitForElementVisible(driver, BasePageUI.BALANCE_THC_TEXT);
        String THC_CURRENT_ACTUAL = getElementText(driver, BasePageUI.BALANCE_THC_TEXT);
        System.out.println();
        System.out.println("-------------------THC_CURRENT_ACTUAL: " + THC_CURRENT_ACTUAL);
        Assert.assertEquals(THC_CURRENT_ACTUAL, THC_CURRENT);
    }

    public void checkSellHeroExistPageBuy(String path) {
        List<WebElement> text = getElements(driver, BuyPageUI.PRICE_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 17 == 0) {
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(index + 1));
            clickToElement(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(index + 1));

            String uri = getPageUri(driver);
            String[] parts = uri.split("/");
            if (parts.length > 0) {
                String pathCurrent = parts[parts.length - 1];

                boolean stopSellingButton = isElementUndisplayed(driver, BasePageUI.STOP_SELLING_BUTTON);
                if (path.equals(pathCurrent) && !stopSellingButton) {
                    break;
                }

//                sleepInSecond(2);
                waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                clickToElement(driver, BasePageUI.GO_BACK_LINK);
                index++;
            }
        }
    }


    public void checkSellHeroNotExistPageBuy(String path) {
        List<WebElement> text = getElements(driver, BuyPageUI.PRICE_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 17 == 0) {
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(index + 1));
            clickToElement(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(index + 1));

            String uri = getPageUri(driver);
            String[] parts = uri.split("/");
            if (parts.length > 0) {
                String pathCurrent = parts[parts.length - 1];

                boolean stopSellingButton = isElementUndisplayed(driver, BasePageUI.STOP_SELLING_BUTTON);
                if (path.equals(pathCurrent) && !stopSellingButton) {
                    // nếu vào được đây là sai
                    Assert.assertTrue(false);
                    break;
                }

//                sleepInSecond(2);
                waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                clickToElement(driver, BasePageUI.GO_BACK_LINK);
                index++;
            }
        }
    }
}
