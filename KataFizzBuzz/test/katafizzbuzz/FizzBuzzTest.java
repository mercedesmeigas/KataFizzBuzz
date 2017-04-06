/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam107
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void testFizzBuzzDeContiene7DevuelveRezz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(72);
        assertEquals("Rezz",result);
    }
    
    @Test
    public void testFizzBuzzDeSieteMultiploDevuelveRezz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(14);
        assertEquals("Rezz",result);
    }
    
    
}
