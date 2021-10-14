package calcTestUI;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CalculationTest extends BaseTest {

    @Test
    public void calcTest() {
        //значение url берется из файла настроек conf.properties
        //получение доступа к методам класса HomePage для взаимодействия с элементами страницы
        HomePage homePage = new HomePage(driver);
        //ввод "Калькулятор"
        homePage.inputText("Калькулятор");
        //переход на другую страницу
        CalculationPage calculationPage = homePage.clickSearchNextBtn();
        //ввод комбинации действий
        calculationPage.oneBtnClick();
        calculationPage.multiplyBtnClick();
        calculationPage.twoBtnClick();
        calculationPage.minusBtnClick();
        calculationPage.threeBtnClick();
        calculationPage.plusBtnClick();
        calculationPage.oneBtnClick();
        //нажатие равно
        calculationPage.equalsBtnClick();
        //сравние значения последовательности ввода с ожидаемым результатом
        String memory = calculationPage.getMemoryResult();
        Assert.assertEquals(ConfProperties.getProperty("memory"), memory);
        //сравние результата арифметических операций с ожидаемым результатом
        String result = calculationPage.getResult();
        Assert.assertEquals(ConfProperties.getProperty("result"), result);
    }

    /**
     * осуществление закрытия окна браузера
     */

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}