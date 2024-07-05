import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTestTDD {

    StringCalculator stringCalculator;

    @BeforeEach
    public void init() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void finish() {
        stringCalculator = null;
    }


    @Test
    public void testEmptyString(){
        assertEquals(0,stringCalculator.add(""));
    }

    @Test
    public void testAddingOnlyOneNumber() {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void testAddingMultipleNumbers() {
        assertEquals(12, stringCalculator.add("3,4,5"));
    }

    @Test
    public void testAddingNumbersWithNewLineDelimiter() {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void testAddingNumbersWithCustomDelimiter() {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumber() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                stringCalculator.add("//;\n-1;-2;-3"));

        assertEquals("Negatives not allowed -1,-2,-3", exception.getMessage());
    }
}
