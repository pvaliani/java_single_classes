import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

//    set up a new calculator instance to be used in the test
    @Before
    public void setUp(){
        calculator = new Calculator();

    }
// test addition

    @Test
    public void calculatorCanAdd(){
        assertEquals(4, calculator.add(2,2));
    }


    @Test
    public void calculatorCanSubtract(){
        assertEquals(2,calculator.subtract(4,2));
    }
}
