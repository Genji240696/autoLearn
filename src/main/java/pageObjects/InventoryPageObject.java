package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageUIs.BasePageUI;
import pageUIs.InventoryPageUI;

import java.util.List;

public class InventoryPageObject extends BasePage {
    WebDriver driver;

    public InventoryPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void getTextToPathHero(String path) {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        boolean foundItem = false;
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            String[] parts = getPageUri(driver).split("/");
            String ItemPath = parts[parts.length - 1];

            if (ItemPath.equals(path)) {
                Assert.assertEquals(ItemPath, path);
                foundItem = true;
                break;
            }

            sleepInSecond(1);
            waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
            clickToElement(driver, BasePageUI.GO_BACK_LINK);
            index++;
        }
        Assert.assertTrue(foundItem);
    }

    public void clickTotHeroItemSelectSell() {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            boolean sellButton = isElementUndisplayed(driver, BasePageUI.SELL_BUTTON);
            if (!sellButton) {
                break;
            }

//            sleepInSecond(1);
            waitForElementVisible(driver, BasePageUI.GO_BACK_LINK);
            clickToElement(driver, BasePageUI.GO_BACK_LINK);
            index++;
        }
    }

    public void clickTotSellHeroItemSelectHeroBought(String pathBuy) {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            boolean sellButton = isElementUndisplayed(driver, BasePageUI.SELL_BUTTON);
            String path = getPathPageUriHero();
            if (!sellButton && path.equals(pathBuy)) {
                break;
            }

//            sleepInSecond(1);
            waitForElementVisible(driver, BasePageUI.GO_BACK_LINK);
            clickToElement(driver, BasePageUI.GO_BACK_LINK);
            index++;
        }
    }

    public String getPathPageUriHero() {
        String uri = getPageUri(driver);
        String[] parts = uri.split("/"); // Tách chuỗi thành các phần tử bằng dấu gạch chéo ngược ("/")

        if (parts.length > 0) {
            return parts[parts.length - 1]; // Lấy phần tử cuối cùng trong mảng
        }
        return null;
    }

    public void checkSellHeroExistPageInventory(String path) {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            String uri = getPageUri(driver);
            String[] parts = uri.split("/");
            if (parts.length > 0) {
                String pathCurrent = parts[parts.length - 1];
                System.out.println("compare path: " + i + pathCurrent);

                boolean stopSellingButton = isElementUndisplayed(driver, BasePageUI.STOP_SELLING_BUTTON);
                if (path.equals(pathCurrent) && !stopSellingButton) {
                    waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                    clickToElement(driver, BasePageUI.GO_BACK_LINK);

//                    waitForElementVisible(driver, InventoryPageUI.STATUS_LABEL, String.valueOf(index+1));
//                    String forRent = geElementText(driver, InventoryPageUI.STATUS_LABEL, String.valueOf(index + 1));
//                    Assert.assertEquals(forRent, "SELLING");
                    break;
                }

//                sleepInSecond(1);
                waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                clickToElement(driver, BasePageUI.GO_BACK_LINK);
                index++;
            }
        }
    }

    public void clickTotHeroItemSelectRent() {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        int index = 0;
        int i;
        System.out.println(text.size());
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                System.out.println(i);
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            boolean rentButton = isElementUndisplayed(driver, BasePageUI.RENT_OUT_BUTTON);
            System.out.println(i + ": tìm button rent trong inventory: " + rentButton);
            if (!rentButton) {
                break;
            }

//            sleepInSecond(1);
            waitForElementVisible(driver, BasePageUI.GO_BACK_LINK);
            clickToElement(driver, BasePageUI.GO_BACK_LINK);
            index++;
        }
    }

    public void checkRentHeroExistPageInventory(String path) {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            String uri = getPageUri(driver);
            String[] parts = uri.split("/");
            if (parts.length > 0) {
                String pathCurrent = parts[parts.length - 1];

                boolean cancelRenting = isElementUndisplayed(driver, BasePageUI.CANCEL_RENTING_BUTTON);
                if (path.equals(pathCurrent) && !cancelRenting) {
                    System.out.println("compare path: " + i + "---" + pathCurrent);
                    System.out.println(i + ": tìm xem trùng path và có button cancel trong page rent: " + cancelRenting);

                    waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                    clickToElement(driver, BasePageUI.GO_BACK_LINK);
                    String forRent = geElementText(driver, InventoryPageUI.STATUS_LABEL, String.valueOf(index + 1));
                    Assert.assertEquals(forRent, "FOR RENT");
                    break;
                }

//                sleepInSecond(1);
                waitForElementClickable(driver, BasePageUI.GO_BACK_LINK);
                clickToElement(driver, BasePageUI.GO_BACK_LINK);
                index++;
            }
        }
    }

    public void clickTotHeroItemSelectStatusSelling() {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            boolean stopSelling = isElementUndisplayed(driver, BasePageUI.STOP_SELLING_BUTTON);
            if (!stopSelling) {
                boolean sell = isElementUndisplayed(driver, BasePageUI.SELL_BUTTON);
                Assert.assertTrue(sell);
                break;
            }

//            sleepInSecond(1);
            waitForElementVisible(driver, BasePageUI.GO_BACK_LINK);
            clickToElement(driver, BasePageUI.GO_BACK_LINK);
            index++;
        }
    }

    public void clickTotHeroItemSelectStatusRent() {
        List<WebElement> text = getElements(driver, InventoryPageUI.FIND_ITEM_HERO);
        int index = 0;
        int i;
        for (i = 0; i <= text.size(); i++) {
            if ((i + 1) % 13 == 0) {
                scrollToBottomPage(driver);
                waitForElementClickable(driver, BasePageUI.NEXT_BUTTON);
                clickToElement(driver, BasePageUI.NEXT_BUTTON);
                index = 0;
                i = 0;
            }

            waitForElementClickable(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));
            clickToElement(driver, InventoryPageUI.SELECT_ITEM_HERO, String.valueOf(index + 1));

            boolean cancelRenting = isElementUndisplayed(driver, BasePageUI.CANCEL_RENTING_BUTTON);
            if (!cancelRenting) {
                boolean sell = isElementUndisplayed(driver, BasePageUI.SELL_BUTTON);
                Assert.assertTrue(sell);
                break;
            }

//            sleepInSecond(1);
            waitForElementVisible(driver, BasePageUI.GO_BACK_LINK);
            clickToElement(driver, BasePageUI.GO_BACK_LINK);
            index++;
        }
    }
}
