package pageObjects;

import commons.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageUIs.BasePageUI;
import pageUIs.BuyPageUI;

import java.util.List;

public class BuyPageObject extends BasePage {
    WebDriver driver;
    public BuyPageObject(WebDriver driver) {
        this.driver = driver;
    }

    // HT_TC017_BuyAHeroSuccessfully
    @Step("Given Stella logs in her account")
    public void HT_TC017_STEPS_01() {}
    @Step("And the Thetan Coin in her wallet is <Total THC> {0}")
    public void HT_TC017_STEPS_02(String totalBalanceTHC) {}
    @Step("And she navigates to Heroes Marketplace ")
    public void HT_TC017_STEPS_03() {}
    @Step("And there is at least a hero in the Heroes Marketplace")
    public void HT_TC017_STEPS_04() {}
    @Step("And she selects a hero in the Heroes Marketplace that has price <Price>")
    public void HT_TC017_STEPS_05() {}
    @Step("And the hero price is less than the total THC in her wallet")
    public void HT_TC017_STEPS_06() {}
    @Step("And she clicks on Purchase button in the Hero details page")
    public void HT_TC017_STEPS_07() {}
    @Step("And she clicks on Checkout button on the Checkout popup")
    public void HT_TC017_STEPS_08() {}
    @Step("When she confirms the buy transaction in her wallet")
    public void HT_TC017_STEPS_09() {}
    @Step("Then a Complete popup displays")
    public void HT_TC017_STEPS_10() {}
    @Step("And this hero is removed from the Heroes Marketplace")
    public void HT_TC017_STEPS_11() {}
    @Step("And this hero displays in her Heroes Inventory with correct information")
    public void HT_TC017_STEPS_12() {}
    @Step("And Rent out button and Sell button display in this Hero details page ")
    public void HT_TC017_STEPS_13() {}
    @Step("And the Thetan Coin in her wallet is deducted an amount as the price")
    public void HT_TC017_STEPS_14() {}
    @Step("And a transaction fee is deducted from her wallet")
    public void HT_TC017_STEPS_15() {}

    // HT_TC018_BuyAHeroUnsuccessfullyBecauseOfNotEnoughBalance
    @Step("Given Stella logs in her account")
    public void HT_TC018_STEPS_01() {}
    @Step("And the Thetan Coin in her wallet is <Total THC>")
    public void HT_TC018_STEPS_02() {}
    @Step("And she navigates to Heroes Marketplace")
    public void HT_TC018_STEPS_03() {}
    @Step("And there is at least a hero in the Heroes Marketplace")
    public void HT_TC018_STEPS_04() {}
    @Step("And she selects a hero in the Heroes Marketplace that has price <Price>")
    public void HT_TC018_STEPS_05() {}
    @Step("And the hero price is greater than the total THC in her wallet")
    public void HT_TC018_STEPS_06() {}
    @Step("When she clicks on Purchase button in the Hero details page ")
    public void HT_TC018_STEPS_07() {}
    @Step("Then Checkout popup displays")
    public void HT_TC018_STEPS_08() {}
    @Step("And an error message 'Your balance is not enough funds. Please deposit more and submit again' displays in the Checkout popup")
    public void HT_TC018_STEPS_09() {}

    // HT_TC019_BuyAHeroUnsuccessfullyBecauseOfNotEnoughBNBForGasFee
    @Step("Given Stella logs in her account")
    public void HT_TC019_STEPS_01() {}
    @Step("And the Thetan Coin in her wallet is <Total THC> {0}")
    public void HT_TC019_STEPS_02(String total_THC) {}
    @Step("And the BNB balance in her wallet is 0")
    public void HT_TC019_STEPS_03() {}
    @Step("And she navigates to Heroes Marketplace ")
    public void HT_TC019_STEPS_04() {}
    @Step("And there is at least a hero in the Heroes Marketplace")
    public void HT_TC019_STEPS_05() {}
    @Step("And she selects a hero in the Heroes Marketplace that has price <Price>")
    public void HT_TC019_STEPS_06() {}
    @Step("And she clicks on Purchase button in the Hero details page")
    public void HT_TC019_STEPS_07() {}
    @Step("When she clicks on Checkout button on the Checkout popup")
    public void HT_TC019_STEPS_08() {}
    @Step("Then she can not confirm the buy transaction ")
    public void HT_TC019_STEPS_09() {}
    @Step("And this hero is not bought")
    public void HT_TC019_STEPS_10() {}
    @Step("And this hero still displays in the Marketplace for selling")
    public void HT_TC019_STEPS_11() {}

    public void clickToSortDropList(String text) {
        selectItemInCustomDropdown(driver, BuyPageUI.PARENT_SORT_DROPDOWN_LIST, BuyPageUI.CHILD_SORT_DROPDOWN_LIST, text);
    }

    public Double clickTotHeroItem(Double priceBuyHeroRandomCurrent) {
        List<WebElement> text = getElements(driver, BuyPageUI.PRICE_ITEM_HERO);
        int index = 0;
        int i;
        double price = 0;
        for (i = 0; i <= text.size(); i++) {
            System.out.println(i);
            if ( (i+1) % 17 == 0 ) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementVisible(driver, BuyPageUI.SELECT_PRICE_ITEM_HERO, String.valueOf(index + 1));
            String input = getElementText(driver, BuyPageUI.SELECT_PRICE_ITEM_HERO, String.valueOf(index + 1));

            String[] parts = input.split("\\s+");

            if (parts.length > 0) {
                price = Double.parseDouble(parts[0].replaceAll(",", ""));
                System.out.println("--------price: " + i + " -------- " + price);

                waitForElementClickable(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(i + 1));
                clickToElement(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(i + 1));

                boolean buyButton = isElementUndisplayed(driver, BasePageUI.BUY_BUTTON);
                if (price >= priceBuyHeroRandomCurrent && !buyButton) {
                    System.out.println("--------Buy Hero--------" + getElementText(driver, BasePageUI.BUY_BUTTON));
                    break;
                }

//                sleepInSecond(2);
                waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                clickToElement(driver, BasePageUI.GO_BACK_LINK);
                index++;
            }
        }
        return price;
    }

    public void clickTotHeroItemSelectAHeroGreaterTotalTHC(String total_THC) {
        List<WebElement> text = getElements(driver, BuyPageUI.PRICE_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            System.out.println(i);
            if ( (i+1) % 17 == 0 ) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementVisible(driver, BuyPageUI.SELECT_PRICE_ITEM_HERO, String.valueOf(index + 1));
            String input = getElementText(driver, BuyPageUI.SELECT_PRICE_ITEM_HERO, String.valueOf(index + 1));

            String[] parts = input.split("\\s+");
            String[] number = total_THC.split("\\s+");

            if (parts.length > 0) {
                Double price_THC_Hero = Double.parseDouble(parts[0].replaceAll(",", ""));
                Double price_THC_Total = Double.parseDouble(number[0].replaceAll(",", ""));
//                System.out.println("--------price: " + i + " -------- " + price);

                waitForElementClickable(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(i + 1));
                clickToElement(driver, BuyPageUI.FIRST_HERO_ITEM, String.valueOf(i + 1));

                boolean buyButton = isElementUndisplayed(driver, BasePageUI.BUY_BUTTON);
                if (price_THC_Hero > price_THC_Total && !buyButton) {
                    System.out.println("--------textBuy--------" + getElementText(driver, BasePageUI.BUY_BUTTON));
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
