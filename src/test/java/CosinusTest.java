import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;


public class CosinusTest extends Assert {
    private static final double DELTA = 1e-3;

    @Test
    public void testCos1() {
    	/* x = -2pi, interval 2, 3 */
        double x = -2 * Math.PI;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

	@Test
    public void testCos2() {
    	/* x = -7pi/4, interval 3 */
        double x = -7 * Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos3() {
    	/* x = -3pi/2, interval 3, 4 */
        double x = -3 * Math.PI/2;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos4() {
    	/* x = -5pi/4, interval 4 */
        double x = -5 * Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos5() {
    	/* x = -pi, interval 4, 1 */
        double x = -Math.PI;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

	@Test
    public void testCos6() {
    	/* x = -3pi/4, interval 1 */
        double x = -3*Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos7() {
    	/* x = -pi/2, interval 1, 2 */
        double x = -Math.PI/2;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos8() {
    	/* x = -pi/4, interval 2 */
        double x = -Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

	@Test
    public void testCos9() {
    	/* x = 0, interval 2, 3 */
        double x = 0;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos10() {
    	/* x = pi/4, interval 3*/
        double x = -Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

	@Test
    public void testCos11() {
    	/* x = pi/2, interval 3, 4 */
        double x = Math.PI/2;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos12() {
    	/* x = 3*pi/4, interval 4*/
        double x = 3*Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

	@Test
    public void testCos13() {
    	/* x = pi, interval 4, 1 */
        double x = Math.PI;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos14() {
    	/* x = 5*pi/4, interval 1*/
        double x = 5*Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }


	@Test
    public void testCos15() {
    	/* x = 3pi/2, interval 1, 2 */
        double x = 3*Math.PI/2;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos16() {
    	/* x = 7*pi/4, interval 2*/
        double x = 7*Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }


	@Test
    public void testCos17() {
    	/* x = 2pi, interval 2, 3 */
        double x = 2*Math.PI;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos18() {
    	/* x = 9*pi/4, interval 3*/
        double x = 9*Math.PI/4;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

	@Test
    public void testCos19() {
    	/* x = -INF */
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test
    public void testCos20() {
    	/* x = INF */
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }






}