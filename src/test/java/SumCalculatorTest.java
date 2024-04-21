import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumOf1() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSumOf3() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumOf0ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
