//import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTestTDD {

    StringCalculator stringCalculator;

    @BeforeEach
    public void init() {
        stringCalculator = new StringCalculator();
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
    public void testAddingNumbersWithDifferentDelimiter() {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
}
