package calcTestUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локаторов полей ввода
     */

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    private WebElement searchBtn;

    /**
     * методы для ввода текста и осуществления нажатия кнопки поиска
     */

    public void inputText(String textField) {
        searchField.sendKeys(textField);
    }

    public CalculationPage clickSearchNextBtn() {
        searchBtn.click();
        return new CalculationPage(driver);
    }
}