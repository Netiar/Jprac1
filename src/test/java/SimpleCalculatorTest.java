import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator Calculator = new SimpleCalculator();
        Integer expected =4;
        assertEquals(expected, Calculator.add(2,2 ));
    }

    @Test
    void threePlusSevenShouldEqual10(){
        SimpleCalculator Calculator = new SimpleCalculator();
        Integer expected =10;
        assertEquals(expected, Calculator.add(3,7 ));
    }
}