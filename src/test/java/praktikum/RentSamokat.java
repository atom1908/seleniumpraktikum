package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RentSamokat extends BaseUITest{
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String orderButton;


    public RentSamokat(String name, String surname, String address, String metro, String orderButton) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.orderButton = orderButton;
    }

    @Parameterized.Parameters
    public static Object[][] setContactInformation() {
        return new Object[][] {
                { "Василий", "Алексеев", "Москва, ул. Ленина, д. 1 кв. 333", "Комсомольская", "//button[@class='Button_Button__ra12g' and text()='Заказать']"},
                { "Юрий", "Иванов", "Санкт-Петербург, ул. Новая, д 1111", "Университет", "//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"},
                { "Николай", "Георгиев", "Казань, ул. Новая, д 1111", "Алма-Атинская", "//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"},
        };
    }




    @Test
    public void makeOrder() {
        CustomerInformationPage customerInformationPage = new CustomerInformationPage(webDriver);
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieAccept();
        mainPage.clickOrderButton(orderButton);
        customerInformationPage.fillInputName(name);
        customerInformationPage.fillInputSurname(surname);
        customerInformationPage.fillInputAddress(address);
        customerInformationPage.fillInputMetro(metro);
        customerInformationPage.fillInputPhone("+79998887766");
        customerInformationPage.clickNextButton();

        RentalInformationPage rentalInformationPage = new RentalInformationPage(webDriver);
        rentalInformationPage.setInputRentalDate();
        rentalInformationPage.setInputRentalPeriod();
        rentalInformationPage.clickSelectColour();
        rentalInformationPage.setInputComment("комментарий");
        rentalInformationPage.clickOrderButton();
        rentalInformationPage.clickYesButton();
        rentalInformationPage.checkOrderSuccess();
    }


}
