package pageObjects;

import commons.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageUIs.BasePageUI;
import pageUIs.RentPageUI;

import java.util.List;

public class RentPageObject extends BasePage {
    WebDriver driver;
    public RentPageObject(WebDriver driver) {
        this.driver = driver;
    }

    // HR_TC002_RentOutAHeroSuccessfullyWithMaxBattles
    @Step("Given Stella logs in her account ")
    public void HR_TC002_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC002_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HR_TC002_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HR_TC002_STEPS_04() {}
    @Step("And this hero has number of remaining battles")
    public void HR_TC002_STEPS_05() {}
    @Step("And she clicks on Rent out button")
    public void HR_TC002_STEPS_06() {}
    @Step("And she inputs Battle for rent the same as the number of remaining battles")
    public void HR_TC002_STEPS_07() {}
    @Step("And she inputs renting price <Renting Price> {0}")
    public void HR_TC002_STEPS_08(String rentPrice) {}
    @Step("And she checks the confirm checkbox")
    public void HR_TC002_STEPS_09() {}
    @Step("And she clicks on Put up for rent button")
    public void HR_TC002_STEPS_10() {}
    @Step("When she signs with her wallet to complete transaction")
    public void HR_TC002_STEPS_11() {}
    @Step("Then Complete popup displays ")
    public void HR_TC002_STEPS_12() {}
    @Step("And Cancel Renting button displays in this Hero details page")
    public void HR_TC002_STEPS_13() {}
    @Step("And this hero displays with 'For Rent' label in the Heroes Inventory")
    public void HR_TC002_STEPS_14() {}
    @Step("And this hero displays in the Rent Marketplace with the correct information")
    public void HR_TC002_STEPS_15() {}

    // HR_TC003_RentOutAHeroSuccessfullyWithValidNumberOfBattles
    @Step("Given Stella logs in her account ")
    public void HR_TC003_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC003_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HR_TC003_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HR_TC003_STEPS_04() {}
    @Step("And this hero has number of remaining battles")
    public void HR_TC003_STEPS_05() {}
    @Step("And she clicks on Rent out button")
    public void HR_TC003_STEPS_06() {}
    @Step("And she inputs Battle for rent that is in a range from 50 to the number of remaining battles")
    public void HR_TC003_STEPS_07() {}
    @Step("And she inputs renting price <Renting Price> {0}")
    public void HR_TC003_STEPS_08(String rentPrice) {}
    @Step("And she checks the confirm checkbox")
    public void HR_TC003_STEPS_09() {}
    @Step("And she clicks on Put up for rent button")
    public void HR_TC003_STEPS_10() {}
    @Step("When she signs with her wallet to complete transaction")
    public void HR_TC003_STEPS_11() {}
    @Step("Then Complete popup displays ")
    public void HR_TC003_STEPS_12() {}
    @Step("And Cancel Renting button displays in this Hero details page")
    public void HR_TC003_STEPS_13() {}
    @Step("And this hero displays with 'For Rent' label in the Heroes Inventory")
    public void HR_TC003_STEPS_14() {}
    @Step("And this hero displays in the Rent Marketplace with the correct information")
    public void HR_TC003_STEPS_15() {}

    // HR_TC005_CanNotRentOutAHeroWhenBattleForRentIsGreaterThanTheNumberOfRemainingBattles
    @Step("Given Stella logs in her account ")
    public void HR_TC005_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC005_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HR_TC005_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HR_TC005_STEPS_04() {}
    @Step("And this hero has number of remaining battles")
    public void HR_TC005_STEPS_05() {}
    @Step("And she clicks on Rent out button")
    public void HR_TC005_STEPS_06() {}
    @Step("And she inputs renting price <Renting Price> {0}")
    public void HR_TC005_STEPS_07(String rentPrice) {}
    @Step("When she inputs Battle for rent <Battle For Rent> {1} is greater than the number of remaining battles {0}")
    public void HR_TC005_STEPS_08(String battlesCurrent, String battleForRent) {}
    @Step("Then an error message displays on the Rent out hero popup with 'Maximum battles for rent:'")
    public void HR_TC005_STEPS_09() {}
    @Step("And the Put up for rent button is disabled")
    public void HR_TC005_STEPS_10() {}

    // HR_TC006_CanNotRentOutAHeroWhenPriceForRentIsLessThanTheMinPriceAllowed
    @Step("Given Stella logs in her account ")
    public void HR_TC006_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC006_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HR_TC006_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HR_TC006_STEPS_04() {}
    @Step("And this hero has number of remaining battles")
    public void HR_TC006_STEPS_05() {}
    @Step("And she clicks on Rent out button")
    public void HR_TC006_STEPS_06() {}
    @Step("When she inputs renting price <Renting Price> {0} that is less than the min renting price <Min Renting Price> 50")
    public void HR_TC006_STEPS_07(String rentPrice) {}
    @Step("Then an error message displays on the Rent out hero popup with 'Minimum renting price: 50'")
    public void HR_TC006_STEPS_08() {}

    // HR_TC007_CanNotRentOutAHeroWhenUncheckingTheConfirmCheckBox
    @Step("Given Stella logs in her account ")
    public void HR_TC007_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC007_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HR_TC007_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HR_TC007_STEPS_04() {}
    @Step("And she clicks on Rent out button")
    public void HR_TC007_STEPS_05() {}
    @Step("And she inputs Battle for rent <Battle For Rent> {0}")
    public void HR_TC007_STEPS_06(String battlesForRent) {}
    @Step("When she inputs renting price <Renting Price> {0}")
    public void HR_TC007_STEPS_07(String rentPrice) {}
    @Step("Then the Put up for rent button is disabled")
    public void HR_TC007_STEPS_08() {}
    @Step("And she can not continue to rent out a hero")
    public void HR_TC007_STEPS_09() {}
    // HR_TC008_VerifyTheTransactionFeeCalculatedCorrectly
    @Step("Given Stella logs in her account ")
    public void HR_TC008_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC008_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HR_TC008_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HR_TC008_STEPS_04() {}
    @Step("And she clicks on Rent out button")
    public void HR_TC008_STEPS_05() {}
    @Step("When she inputs renting price <Renting Price> {0}")
    public void HR_TC008_STEPS_06(String rentPrice) {}
    @Step("Then the Transaction fee is calculated correctly to be 4.15 % of renting price")
    public void HR_TC008_STEPS_07() {}
    @Step("And the total of THC that owner receives displays correctly in the Rent Out Hero popup")
    public void HR_TC008_STEPS_08() {}

    // HR_TC010_CancelRentOutTransaction
    @Step("Given Stella logs in her account ")
    public void HR_TC010_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC010_STEPS_02() {}
    @Step("And her Inventory has at least a hero that is ready for sales")
    public void HR_TC010_STEPS_03() {}
    @Step("And she selects a hero that is ready for sales")
    public void HR_TC010_STEPS_04() {}
    @Step("And she clicks on Rent out button")
    public void HR_TC010_STEPS_05() {}
    @Step("And she inputs Battle for rent <Battle For Rent> {0}")
    public void HR_TC010_STEPS_06(String battlesCurrent) {}
    @Step("When she inputs renting price <Renting Price> {0}")
    public void HR_TC010_STEPS_07(String rentPrice) {}
    @Step("And she checks the confirm checkbox")
    public void HR_TC010_STEPS_08() {}
    @Step("And she clicks on Put up for rent button")
    public void HR_TC010_STEPS_09() {}
    @Step("When she cancels the transaction")
    public void HR_TC010_STEPS_10() {}
    @Step("Then an error message displays in the Rent Out Hero popup: 'Transaction has been canceled'")
    public void HR_TC010_STEPS_11() {}
    // HR_TC010_CancelRentOutTransaction
    @Step("Given Stella logs in her account ")
    public void HR_TC013_STEPS_01() {}
    @Step("And she navigate to Hero Inventory")
    public void HR_TC013_STEPS_02() {}

    @Step("And her Inventory has at least a hero that has \"For Rent\" status")
    public void HR_TC013_STEPS_03() {}
    @Step("And she selects a hero that has \"For Rent\" status")
    public void HR_TC013_STEPS_04() {}
    @Step("And she clicks on Cancel renting button in the Hero details page")
    public void HR_TC013_STEPS_05() {}
    @Step("When she clicks on Cancel button in the Cancel Renting popup")
    public void HR_TC013_STEPS_06() {}
    @Step("Then she back to this Hero details page")
    public void HR_TC013_STEPS_07() {}
    @Step("And this hero is still ready for rent ")
    public void HR_TC013_STEPS_08() {}

    public void clickCheckBoxRent() {
        waitForElementClickable(driver, RentPageUI.THC_CHECKBOX);
        clickToElement(driver, RentPageUI.THC_CHECKBOX);
    }

    public void clickPutUpForRentButton() {
        waitForElementClickable(driver, RentPageUI.PUT_UP_FOR_RENT_BUTTON);
        clickToElement(driver, RentPageUI.PUT_UP_FOR_RENT_BUTTON);
    }

    public void checkPutUpForRentButtonDisable() {
        boolean isPutUpForRentButtonDisable = isElementEnabled(driver, RentPageUI.PUT_UP_FOR_RENT_BUTTON);
        Assert.assertFalse(isPutUpForRentButtonDisable);
    }

    public void checkRentHeroExistPageRent(String pathHeroRent) {
        List<WebElement> text = getElements(driver, RentPageUI.PRICE_ITEM_HERO);
        int index = 0;
        int i;
        System.out.println(text.size());
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 17 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            sleepInSecond(1);
            waitForElementClickable(driver, RentPageUI.FIRST_HERO_ITEM, String.valueOf(index + 1));
            clickToElement(driver, RentPageUI.FIRST_HERO_ITEM, String.valueOf(index + 1));

            String uri = getPageUri(driver);
            String[] parts = uri.split("/");
            if (parts.length > 0) {
                String pathCurrent = parts[parts.length - 1];
                System.out.println("-----compare path: " + i + "---"+ pathCurrent);

                boolean cancelRenting = isElementUndisplayed(driver, BasePageUI.CANCEL_RENTING_BUTTON);
//                System.out.println(i + ": tìm xem trùng path và có button cancel trong page rent: " + cancelRenting);
                if (pathHeroRent.equals(pathCurrent) && !cancelRenting) {
                    break;
                }

//                sleepInSecond(1);
                waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                clickToElement(driver, BasePageUI.GO_BACK_LINK);
                index++;
            }
        }
    }

    public void inputPriceForRent(String rentPrice) {
        waitForElementVisible(driver, RentPageUI.THC_TEXTBOX);
        sendKeyToElement(driver, RentPageUI.THC_TEXTBOX, rentPrice);
    }

    public void inputBattlesForRent(String battlesForRent) {
        waitForElementVisible(driver, RentPageUI.BATTLES_FOR_RENT_TEXTBOX);
        sendKeyToElement(driver, RentPageUI.BATTLES_FOR_RENT_TEXTBOX, battlesForRent);
    }

    public void getTextBattlesForRent(String battlesForRent) {
        String battlesForRentCurrent = getElementAttribute(driver, RentPageUI.BATTLES_FOR_RENT_TEXTBOX, "value");
        Assert.assertEquals(battlesForRentCurrent, battlesForRent);
    }

    public void verifyTextErrorMessagePopupRentOutHero(String battlesCurrent) {
        waitForElementVisible(driver, BasePageUI.MESSAGE_ERROR_RENT_OUT_HERO_TEXT);
        String text = getElementText(driver, BasePageUI.MESSAGE_ERROR_RENT_OUT_HERO_TEXT);
        Assert.assertEquals(text, "Maximum battles for rent: " + battlesCurrent);
    }

    public void verifyTextErrorMessagePopupRentOutHero() {
        waitForElementVisible(driver, BasePageUI.MESSAGE_ERROR_RENT_OUT_HERO_TEXT);
        String text = getElementText(driver, BasePageUI.MESSAGE_ERROR_RENT_OUT_HERO_TEXT);
        Assert.assertEquals(text, "Minimum renting price: 50");
    }

    public void feeTHCRentOutHero() {
        waitForElementVisible(driver, BasePageUI.MESSAGE_RENT_OUT_HERO_TEXT);
        String text = getElementText(driver, BasePageUI.MESSAGE_RENT_OUT_HERO_TEXT);
        Assert.assertEquals(text, "You will receive 95.85 THC after subtracting a 4.15% fee");
    }

    public void clicTo() {
        waitForElementClickable(driver, RentPageUI.BATTLES_FOR_RENT_TEXTBOX);
        clickToElement(driver, RentPageUI.BATTLES_FOR_RENT_TEXTBOX);
    }

    public void clickToUserNameButton() {
        waitForElementVisible(driver, RentPageUI.BATTLES_FOR_RENT_TEXTBOX);
        sendKeyToElement(driver, RentPageUI.BATTLES_FOR_RENT_TEXTBOX, "fahdfahds");
    }
}
