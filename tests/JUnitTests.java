/**
 * Created by Alexander_Demidovich on 10/7/2016.
 */

import Handler.Handler;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTests {
    @Test
    public void CalculateFunction_0_0Returned(){
        double expected = 0.0;
        int x = 0;
        double actual = Handler.calculate(x);
        assertEquals(expected, actual,0.001);
    }
    @Test
    public void CalculateFunction_30_Minus6Dot405Returned(){
        double expected = -6.405;
        int x = 30;
        double actual = Handler.calculate(x);
        assertEquals(expected, actual,0.001);
    }
    @Test
    public void CalculateFunction_180_1Dot338Returned(){
        double expected = 1.338;
        int x = 180;
        double actual = Handler.calculate(x);
        assertEquals(expected, actual,0.001);
    }
}
