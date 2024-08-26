package pageUIs;

public class BasePageUI {
    public static final String avatarIcon = "//div[@data-test-id='header.user-avatar']";
    public static final String inventoryButton = "(//div[@data-test-id='header.user-menu']//div)[3]//span[text()='Inventory']";
    public static final String connectWalletButton = "(//span[text()='Connect Wallet'])[2]";
    public static final String loginWithMetaMaskButton = "//span[text()='Login with MetaMask']";
    public static final String acceptAndSignButton = "//button[@data-test-id='login.connect.accept-and-sign']";
    public static final String closeButton = "(//button//img)[5]";
    public static final String MENU_GENERAL = "//div[@data-test-id='header.container']//div[1]//span[text()='%s']";
    public static final String checkoutButton = "//span[text()='Checkout']/parent::button";
    public static final String CANCEL_BUTTON = "//span[text()='Cancel']/parent::button";
    public static final String closeIcon = "//div[@id='app']/div[4]/div/img";
    public static final String closePopupButton = "//span[text()='Close']/parent::button";
    public static final String I_UNDERSTAND_BUTTON = "//span[text()='I understand']//parent::button";
    public static final String BALANCE_THC_TEXT = "//span[text()='Balance']/following-sibling::span[1]";
    public static final String BUY_BUTTON = "//span[text()='Buy']//parent::button";
    public static final String SELL_BUTTON = "//button[@data-test-id='hero-detail.sell-button']";
    public static final String RENT_OUT_BUTTON = "//button[@data-test-id='hero-detail.rent-out-button']/span";
    public static final String GO_BACK_LINK = "(//span[normalize-space()='Go back'])[1]";
    public static final String OWNER_BY_MY_TEXT = "//span[text()='Owner by me']";
    public static final String MESSAGE_SELL_TEXT = "(//div[@data-test-id='hero-detail.sell.request-handle-modal']//div)[2]/span[1]";
    public static final String MESSAGE_ERROR_TEXT = "//span[text()='OOPS!']/following-sibling::div/span";
    public static final String MESSAGE_ERROR_CHECKOUT_TEXT = "//div[@data-test-id='hero-detail.buy.error']/div/div";
    public static final String ERROR_MESSAGE_TEXT = "//span[@data-test-id='hero-detail.sell.minium-error-price']";
    public static final String MESSAGE_ERROR_RENT_OUT_HERO_TEXT = "//div[@data-test-id='hero-detail.rent-out.error']/div/span";
    public static final String MESSAGE_RENT_OUT_HERO_TEXT = "//span[@data-test-id='hero-detail.rent-out.owner-receive']";
    public static final String STOP_SELLING_BUTTON = "//button[@data-test-id='hero-detail.stop-selling-button']/span";
    public static final String STOP_SELLING_POPUP_BUTTON = "(//button[@data-test-id='hero-detail.sell.stop-modal.primary-button']/span)[2]";
    public static final String CANCEL_RENTING_BUTTON = "//button[@data-test-id='hero-detail.cancel-renting-button']/span";
    public static final String STOP_RENTING_POPUP_BUTTON = "//span[text()='Stop renting']";
    public static final String NEXT_BUTTON = "(//button[@type='button'])[2]";
    public static final String I_GOT_IT = "//span[text()='I got it']//parent::button";
    public static final String gTHC_BATTLES = "//div[@data-test-id='hero-detail.gTHC-battles']/div/span";
    public static final String AMOUNT_THC = "//span[@data-test-id='hero-detail.price-THC']";
}
