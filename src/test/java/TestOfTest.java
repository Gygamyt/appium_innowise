import org.example.pages.CalculatorAppPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOfTest extends BaseTest {
    private final CalculatorAppPage calculatorAppPage = new CalculatorAppPage();

    @Test
    public void resultInInputFieldTest() throws InterruptedException {
        calculatorAppPage
                .closePopUpsIfExist()
                .clickOne()
                .clickPlus()
                .clickOne()
                .clickResult()
                .getResultFromInputField();
        Assertions.assertEquals("2", calculatorAppPage
                .closePopUpsIfExist()
                .clickOne()
                .clickPlus()
                .clickOne()
                .clickResult()
                .getResultFromInputField());
    }

    @Test
    public void resultInResultFieldTest() throws InterruptedException {
        Assertions.assertEquals("2", calculatorAppPage
                .closePopUpsIfExist()
                .clickOne()
                .clickPlus()
                .clickOne()
                .getResultFromResultField());
    }
}
