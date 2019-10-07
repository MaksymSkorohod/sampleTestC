import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }


    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }



    //TODO
    //add new tests for add() method

    @Test
    public void testDivideTwoPositiveValues(){
        assertEquals("81 / 9 must be 9", 9, calc.division(81, 9));
    }

    @Test
    public void testDivideTwoNegativeValues(){
        assertEquals("-1112 / -22 must be 50", 50, calc.division(-1112, -22));
    }


    @Test
    public void testSlamOffTwoPositiveValues(){
        assertEquals("342 - 221 must be 12232", 121, calc.subtraction(342,221));
    }

    @Test
    public void testSlamOffTwoNegativeValues(){
        assertEquals("-45454 - 33222 must be 121", 12232, calc.subtraction(45454,33222));
    }

    @Test
    public void testSquareRootValue(){
        assertEquals("square root of 5 must be 2.24", 2.23606797749979, calc.sqrt(5));
    }

    @Test
    public void testPowerValue(){
        assertEquals("x^2 of value 12 must be 3.46", 3.4641016151377544, calc.sqrt(12));
    }


    @Test
    public void testSquareRootFromNegativeValue(){
        assertTrue("square root of -5 must be 0", Double.isNaN(calc.sqrt(-5)));
    }

    @Test
    public void testDivideValuesOnZero(){
        String message = " ";
        try{
            calc.division(33,0);
        }
        catch (ArithmeticException e){
            message = e.getMessage();
        }
        assertEquals("33 / 0 must be ", "/ by zero", message);
    }


    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
