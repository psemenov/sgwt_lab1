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

    @Test
    public void testMinusTwoPi() {
        double x = -2*Math.PI;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testMinusThreeSecondsPi() {
        double x = -3*Math.PI/2;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testMinusPi() {
        double x = -Math.PI;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testMinusHalfOfPi() {
        double x = -Math.PI/2;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testZero() {
        double x = 0;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testHalfOfPi() {
        double x = Math.PI/2;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testThreeSecondsPi() {
        double x = 3*Math.PI/2;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testTwoPi() {
        double x = 2*Math.PI;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testPositiveInfinity() {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testNegativeInfinity() {
        double x = Double.NEGATIVE_INFINITY;
        System.out.println(x);
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }

    @Test
    public void testRandom() {
        double x = Math.random() * Math.abs(Math.random() * 10);
        System.out.println(x);
        assertEquals(Math.cos(x), Cosines.cos(x), DELTA);
    }



}