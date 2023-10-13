import org.example.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTest {
//    @BeforeEach
//    public void setUpDriver() {
//        Driver.createDriver();
//    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
