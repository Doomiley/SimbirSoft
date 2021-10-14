package calcTestUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculationPage {

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */

    public WebDriver driver;

    public CalculationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локаторов
     */

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")
    private WebElement oneBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")
    private WebElement twoBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")
    private WebElement threeBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")
    private WebElement multiplyBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")
    private WebElement minusBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")
    private WebElement plusBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
    private WebElement equalsBtn;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")
    private WebElement memResult;

    @FindBy(xpath = "//*[@id=\"cwos\"]")
    private WebElement finalResult;

    /**
     * методы для нажатия кнопок в калькуляторе
     */

    public void oneBtnClick() {
        oneBtn.click();
    }

    public void multiplyBtnClick() {
        multiplyBtn.click();
    }

    public void twoBtnClick() {
        twoBtn.click();
    }

    public void minusBtnClick() {
        minusBtn.click();
    }

    public void threeBtnClick() {
        threeBtn.click();
    }

    public void plusBtnClick() {
        plusBtn.click();
    }

    public void equalsBtnClick() {
        equalsBtn.click();
    }

    /**
     * метод для получения последовательности действий в выводе результата
     */

    public String getMemoryResult() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String memory = memResult.getText();
        return memory;
    }

    /**
     * метод для получения результата вычисленией
     */

    public String getResult() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = finalResult.getText();
        return result;
    }
}