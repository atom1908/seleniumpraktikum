package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RentalInformationPage extends BasePage{

    public RentalInformationPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By inputRentalDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By inputRentalPeriod = By.xpath("//*[text()='* Срок аренды']");
    private By selRentalPeriod = By.xpath("//*[text()='двое суток']");
    private By selectColour = By.id("black");
    private By inputComment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private By yesButton = By.xpath("//button[text()='Да']");
    private By orderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    private By orderSuccess = By.xpath("//*[text()='Заказ оформлен']");

    public void setInputRentalDate() {
        webDriver.findElement(inputRentalDate).sendKeys("23.09.2022", Keys.ENTER);
    }

    public void setInputRentalPeriod() {
        webDriver.findElement(inputRentalPeriod).click();
        webDriver.findElement(selRentalPeriod).click();
    }

    public void clickSelectColour() {
        webDriver.findElement(selectColour).click();
    }

    public void setInputComment(String comment) {
        webDriver.findElement(inputComment).sendKeys(comment);
    }

    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }

    public void clickYesButton() {
        webDriver.findElement(yesButton).click();
    }

    public boolean checkOrderSuccess() {
        return webDriver.findElement(orderSuccess).isDisplayed();
    }
}
