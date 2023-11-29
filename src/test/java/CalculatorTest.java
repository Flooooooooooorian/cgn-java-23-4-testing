import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void additionTest_when3and4_thenReturn7(){
        //GIVEN
        int valueA = 3;
        int valueB = 4;

        //WHEN
        int actual = Calculator.addition(valueA, valueB);

        //THEN
        assertEquals(7, actual);
    }

    @Test
    public void additionTest_when8and9_thenReturn17(){
        //GIVEN
        int valueA = 8;
        int valueB = 9;

        //WHEN
        int actual = Calculator.addition(valueA, valueB);

        //THEN
        assertEquals(17, actual);
    }

    @Test
    public void divisionTest_when4And2_thenReturn2() {
        //GIVEN
        int valueA = 4;
        int valueB = 2;

        //WHEN
        int actual = Calculator.division(valueA, valueB);

        //THEN
        assertEquals(2, actual);

    }
}
