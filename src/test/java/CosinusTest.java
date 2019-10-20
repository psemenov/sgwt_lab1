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
    public void testFirstClass() {
        //First class: from -pi + 2pi*n to -pi/2 + 2pi*n
        for (double x = -Math.PI ; x < -Math.PI/2; x += 0.01) 
            assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
        
        
    }

    @Test 
    public void testSecondClass() {
        //Second class: from -pi/2 to 0
        for (double x = -Math.PI/2; x < 0; x += 0.01) 
            assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test 
    public void testThirdClass() {
        //Third class: from 0 to pi/2
        for (double x = 0; x < Math.PI/2; x += 0.01) 
            assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }

    @Test 
    public void testFourthClass() {
        //Fourth class: from pi/2 to pi
        for (double x = Math.PI/2; x < Math.PI; x += 0.01) 
            assertEquals(Math.cos(x), Cosinus.cos(x), DELTA);
    }






}