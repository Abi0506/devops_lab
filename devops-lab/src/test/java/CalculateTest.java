import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    @Test
    public void calcTest() {
        Calculate calc = new Calculate();
        assertEquals(110, calc.cal(100, 10, 10));
    }
}