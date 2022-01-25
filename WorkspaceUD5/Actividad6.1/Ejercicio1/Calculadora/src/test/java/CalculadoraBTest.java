/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class CalculadoraBTest {
    
    public CalculadoraBTest() {
    }
    
    CalculadoraB calc;
    
    @Before
    public void inicializar(){
        calc = new CalculadoraB(3, 1);
    }
    
    @Test
    public void testSumar() {
        assertEquals(calc.sumar(), 3.7, 0.3);
    }

    /**
     * Test of restar method, of class CalculadoraB.
     */
    @Test
    public void testRestar() {
        assertEquals(calc.restar(), 2.1, 0.2);
    }

    /**
     * Test of multiplicar method, of class CalculadoraB.
     */
    @Test
    public void testMultiplicar() {
        assertEquals(calc.multiplicar(), 3.5, 0.5);
    }
    
}
