package praktikum;

import org.junit.Assert;
import org.openqa.selenium.*;

public class MainPage extends BasePage{

    private By cookieAccept = By.id("rcc-confirm-button"); // Кнопка "да все привыкли"
    private By firstQuestion = By.xpath("//*[text()='Сколько это стоит? И как оплатить?']"); // 1 вопрос
    private By firstAnswer = By.xpath("//*[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']"); // 1 ответ
    private By secondQuestion = By.xpath("//*[text()='Хочу сразу несколько самокатов! Так можно?']"); // 2 вопрос
    private By secondAnswer = By.xpath("//*[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']"); // 2 ответ
    private By thirdQuestion = By.xpath("//*[text()='Как рассчитывается время аренды?']"); // 3 вопрос
    private By thirdAnswer = By.xpath("//*[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']"); // 3 ответ
    private By fourthQuestion = By.xpath("//*[text()='Можно ли заказать самокат прямо на сегодня?']"); // 4 вопрос
    private By fourthAnswer = By.xpath("//*[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']"); // 4 ответ
    private By fifthQuestion = By.xpath("//*[text()='Можно ли продлить заказ или вернуть самокат раньше?']"); // 5 вопрос
    private By fifthAnswer = By.xpath("//*[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']"); // 5 ответ
    private By sixQuestion = By.xpath("//*[text()='Вы привозите зарядку вместе с самокатом?']"); // 6 вопрос
    private By sixAnswer = By.xpath("//*[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']"); // 6 ответ
    private By sevenQuestion = By.xpath("//*[text()='Можно ли отменить заказ?']"); // 7 вопрос
    private By sevenAnswer = By.xpath("//*[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']"); // 7 ответ
    private By eightQuestion = By.xpath("//*[text()='Я жизу за МКАДом, привезёте?']"); // 8 вопрос
    private By eightAnswer = By.xpath("//*[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']"); // 8 ответ
    private By orderButton1 = By.xpath("//button[@class='Button_Button__ra12g' and text()='Заказать']"); // кнопка Заказать сверху
    private By orderButton2 = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"); // кнопка Заказать снизу




    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCookieAccept() {
        webDriver.findElement(cookieAccept).click();
    }
    public void firstFaq() {
        webDriver.findElement(firstQuestion).click();
        String actual = webDriver.findElement(firstAnswer).getText();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actual);
    }
    public void secondFaq() {
        webDriver.findElement(secondQuestion).click();
        String actual = webDriver.findElement(secondAnswer).getText();
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", actual);
    }
    public void thirdFaq() {
        webDriver.findElement(thirdQuestion).click();
        String actual = webDriver.findElement(thirdAnswer).getText();
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actual);
    }
    public void fourthFaq() {
        webDriver.findElement(fourthQuestion).click();
        String actual = webDriver.findElement(fourthAnswer).getText();
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actual);
    }
    public void fifthFaq() {
        webDriver.findElement(fifthQuestion).click();
        String actual = webDriver.findElement(fifthAnswer).getText();
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", actual);
    }
    public void sixFaq() {
        webDriver.findElement(sixQuestion).click();
        String actual = webDriver.findElement(sixAnswer).getText();
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actual);
    }
    public void sevenFaq() {
        webDriver.findElement(sevenQuestion).click();
        String actual = webDriver.findElement(sevenAnswer).getText();
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", actual);
    }
    public void eightFaq() {
        webDriver.findElement(eightQuestion).click();
        String actual = webDriver.findElement(eightAnswer).getText();
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", actual);
    }

    public void clickOrderButton(String orderButton) {
        webDriver.findElement(By.xpath(orderButton)).click();
    }

}
