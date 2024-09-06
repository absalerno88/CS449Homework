
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
    	System.out.println("Testing addition");
        int result = calculator.add(6, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    public void testSubtraction() {
    	System.out.println("Testing subtraction");
        int result = calculator.subtract(6, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}
