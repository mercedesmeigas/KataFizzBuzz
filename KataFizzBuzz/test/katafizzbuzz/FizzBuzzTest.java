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
    public void testFizzBuzzDeTresDevuelveFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);
        assertEquals("Fizz",result);
    }
    
    @Test
    public void testFizzBuzzDeTresMultiploDevuelveFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(6);
        assertEquals("Fizz",result);
    }
       
    @Test
    public void testFizzBuzzDeContiene3DevuelveFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(13);
        assertEquals("Fizz",result);
    }
}
