import org.junit.Assert;
import org.junit.Test;

public class CosinesTest extends Assert {
    private static final double DELTA = 1e-3;

    @Test
    public void testFirstClass() {
        //First class: from -2pi + 2pi*n to -3pi/2 + 2pi*n
        for (double x = -2*Math.PI ; x < -(3*Math.PI)/2; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testSecondClass() {
        //Second class: from -3pi/2 + 2pi*n to -pi + 2pi*n
        for (double x = -3*Math.PI/2 ; x < -Math.PI; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testThirdClass() {
        //Third class: from -pi + 2pi*n to -pi/2 + 2pi*n
        for (double x = -Math.PI ; x < -Math.PI/2; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testFourthClass() {
        //Fourth class: from -pi/2 + 2pi*n to 0
        for (double x = -Math.PI/2; x < 0; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testFifthClass() {
        //Fifth class: from 0 + 2pi*n to pi/2 + 2pi*n
        for (double x = 0; x < Math.PI/2; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test 
    public void testSixthClass() {
        //Sixth class: pi/2 + 2pi*n to pi + 2pi*n
        for (double x = Math.PI/2; x < Math.PI; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test 
    public void testSeventhClass() {
        //Seventh class: from pi + 2pi*n to 3pi/2 + 2pi*n
        for (double x = Math.PI ; x < (3*Math.PI)/2; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test 
    public void testEighthClass() {
        //Eighth class: from 3pi/2 + 2pi*n to 2pi + 2pi*n
        for (double x = (3*Math.PI)/2 ; x < 2*Math.PI; x += 0.01)
            assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

}