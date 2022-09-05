package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerInformationPage extends BasePage{

    public CustomerInformationPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By inputName = By.xpath("//input[@placeholder='* Имя']");
    private By inputSurname = By.xpath("//input[@placeholder='* Фамилия']");
    private By inputAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By inputMetro = By.xpath("//input[@placeholder='* Станция метро']");
    private By selMetro = By.className("select-search__select");
    private By inputPhone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath("//button[text()='Далее']");

    public void fillInputName(String name) {
        webDriver.findElement(inputName).sendKeys(name);
    }

    public void fillInputSurname(String surname) {
        webDriver.findElement(inputSurname).sendKeys(surname);
    }

    public void fillInputAddress(String address) {
        webDriver.findElement(inputAddress).sendKeys(address);
    }

    public void fillInputMetro(String metro) {
        webDriver.findElement(inputMetro).click();
        webDriver.findElement(inputMetro).sendKeys(metro);
        webDriver.findElement(selMetro).click();
    }

    public void fillInputPhone(String phone) {
        webDriver.findElement(inputPhone).sendKeys(phone);
    }

    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

}
