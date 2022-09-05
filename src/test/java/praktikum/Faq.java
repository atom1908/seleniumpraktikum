package praktikum;

import org.junit.Test;

public class Faq extends BaseUITest{
    @Test
    public void checkFirstAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.firstFaq();
    }

    @Test
    public void checkSecondAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.secondFaq();
    }

    @Test
    public void checkThirdAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.thirdFaq();
    }

    @Test
    public void checkFourthAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.fourthFaq();
    }

    @Test
    public void checkFifthAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.fifthFaq();
    }

    @Test
    public void checkSixAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.sixFaq();
    }

    @Test
    public void checkSevenAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.sevenFaq();
    }

    @Test
    public void checkEightAnswer() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.eightFaq();
    }
}
