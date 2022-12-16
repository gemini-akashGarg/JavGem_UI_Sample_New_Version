package com.qa.Quantic_sample.Objects;

import org.openqa.selenium.By;

public class Amazon_locators {
    public static By sign_in_button = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    public static By user_name_box = By.xpath("//input[@type='email']");
    public static By Continue_button = By.xpath("//input[@type='submit']");
    public static By user_password_box = By.xpath("//input[@type='password']");
    public static By cart_icon = By.xpath("//a[@id='nav-cart']");
    public static By check_cart_empty = By.xpath("//*[@id='sc-active-cart']//h2");
    public static By search_Box = By.xpath("//input[@id='twotabsearchtextbox']");
    public static By search_Button = By.xpath("//*[@class='nav-search-submit nav-sprite']");
    public static By first_result = By.xpath("//*[@data-image-index='1']");
    public static By second_result = By.xpath("//*[@data-image-index='2']");
    public static By price = By.xpath("//span[@class='a-price-whole']");
    public static By price1=By.xpath("//*[@id='corePrice_feature_div']//span[2]");
    public static By tittle = By.xpath("//span[@id='productTitle']");
    public static By error_msg = By.xpath("//span[@class='a-list-item']");
    public static By pricedrpdwn = By.xpath("//span[@class='a-button a-button-dropdown a-button-small']");
    public static By low_high = By.xpath("//*[@id='s-result-sort-select_1']");
    public static By high_low = By.xpath("//*[@id='s-result-sort-select_2']");
    public static By fb_link = By.xpath("//*[@id='navFooter']//div[3]//li[1]//a");
    public static By insta_link = By.xpath("//*[@id='navFooter']//div[3]//li[3]//a");
    public static By twitter_link = By.xpath("//*[@id='navFooter']//div[3]//li[2]//a");
    public static By lang_button = By.xpath("//span[@class='icp-nav-link-inner']");
    public static By English = By.xpath("//*[@id='icp-language-settings']/div[2]");
    public static By hindi = By.xpath("//*[@id='icp-language-settings']/div[3]");
    public static By tamil = By.xpath("//*[@id='icp-language-settings']/div[4]");
    public static By telgu = By.xpath("//*[@id='icp-language-settings']/div[5]");
    public static By Kannda = By.xpath("//*[@id='icp-language-settings']/div[6]");
    public static By malyalam = By.xpath("//*[@id='icp-language-settings']/div[7]");
    public static By bangla = By.xpath("//*[@id='icp-language-settings']/div[8]");
    public static By marathi = By.xpath("//*[@id='icp-language-settings']/div[9]");
    public static By lang_submit = By.xpath("//input[@aria-labelledby='icp-save-button-announce']");
    public static By all=By.xpath("//*[@class='hm-icon nav-sprite']");
    public static By echodot=By.xpath("//a[@data-menu-id='2']");
    public static By item=By.xpath("//*[@id='hmenu-content']/ul[2]/li[3]/a");
    public static By addToCart=By.xpath("//input[@id='add-to-cart-button']");
    public static By cartTitle=By.xpath("//span[@class='a-truncate-cut']");
    public static By locationButton=By.xpath("//a[@id='nav-global-location-popover-link']");
    public static By locationText=By.xpath("//input[@class='GLUX_Full_Width a-declarative']");
    public static By locationSubmit=By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']");
    public static By locationValidate=By.xpath("//span[@class='nav-line-2 nav-progressive-content']");
    public static By Australia=By.xpath("//*[@id='navFooter']/div[4]//li[1]");
    public static By Brazil=By.xpath("//*[@id='navFooter']/div[4]//li[2]");
    public static By Canada=By.xpath("//*[@id='navFooter']/div[4]//li[3]");
    public static By china=By.xpath("//*[@id='navFooter']/div[4]//li[4]");
    public static By France=By.xpath("//*[@id='navFooter']/div[4]//li[5]");
    public static By Germany=By.xpath("//*[@id='navFooter']/div[4]//li[6]");
    public static By Itlay=By.xpath("//*[@id='navFooter']/div[4]//li[7]");
    public static By Japan=By.xpath("//*[@id='navFooter']/div[4]//li[8]");
    public static By Mexico=By.xpath("//*[@id='navFooter']/div[4]//li[9]");
    public static By Netherlands=By.xpath("//*[@id='navFooter']/div[4]//li[10]");
    public static By Poland=By.xpath("//*[@id='navFooter']/div[4]//li[11]");
    public static By Singapore=By.xpath("//*[@id='navFooter']/div[4]//li[12]");
    public static By Spain=By.xpath("//*[@id='navFooter']/div[4]//li[13]");
    public static By Turkey=By.xpath("//*[@id='navFooter']/div[4]//li[14]");
    public static By UAE=By.xpath("//*[@id='navFooter']/div[4]//li[15]");
    public static By UK=By.xpath("//*[@id='navFooter']/div[4]//li[16]");
    public static By US=By.xpath("//*[@id='navFooter']/div[4]//li[17]");
    public static By lowPrice=By.xpath("//input[@id='low-price']");
    public static By highPrice=By.xpath("//input[@id='high-price']");
    public static By Go=By.xpath("//input[@aria-labelledby='a-autoid-1-announce']");
    public static By onScreenFirstResult=By.xpath("//*[@data-index='2']//span[@class='a-price-whole']");
    public static By onScreenFirstResultName=By.xpath("//*[@data-index='2']//span[@class='a-size-medium a-color-base a-text-normal']");
    public static By cartDrpDwn=By.xpath("//span[@class='a-button-text a-declarative']");
    public static By cartDel=By.xpath("//input[@value='Delete']");
    public static By cartCount=By.xpath("//span[@id='nav-cart-count']");
    public static By payOnDelivery=By.xpath("//*[@id='p_g_shipping_options_group/4931671031']//span");
    public static By backToTop=By.xpath("//span[@class='navFooterBackToTopText']");
    public static By newRelease=By.xpath(" //a[ text()='Hot New Releases' ]");
    public static By Bestsellers=By.xpath(" //a[ text()='Best Sellers' ]");
    public static By toprelease=By.xpath("//*[@id='anonCarousel1']//li[1]//a[1]/div");
    public static By Quantity=By.xpath("//*[@id='quantity_2']");
    public static By drpdwn=By.xpath("//*[@class='a-dropdown-item']");
    public static By icon =By.xpath("//*[@id='nav-search']");
    public static By temp=By.xpath("html/body/a/img");
    public static By alert=By.xpath("//button[@onclick='jsAlert()']");
    public static By confirm=By.xpath("//button[@onclick='jsConfirm()']");
    public static By prompt=By.xpath("//button[@onclick='jsPrompt()']");
    public static By usrNme=By.xpath("//*[@id='txtUsername']");

    public static By dclick=By.xpath("//button[@id='doubleClickBtn']");

    public static By rclick=By.xpath("//button[@id='rightClickBtn']");

    public static By from=By.xpath("//li[@id=\"fourth\"]");

    public static By to=By.xpath("//*[@id='amt7']");

    public static By dropdown=By.xpath("//*[@name='country']");

    public static By fileupload=By.xpath("//input[@type='file']");
}


