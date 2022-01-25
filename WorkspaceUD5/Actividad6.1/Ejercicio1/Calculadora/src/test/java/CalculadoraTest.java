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
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    Calculadora calc;
    
    @Before
    public void inicializar(){
        calc = new Calculadora(3,4);
    }

    @Test
    public void testSuma() {
        assertEquals(calc.sumar(), 7);
    }
    
    @Test
    public void testResta() {
        assertEquals(calc.restar(), -1);
    }
    
    @Test
    public void testMultiplicacion() {
        assertEquals(calc.multiplicar(), 12);
    }
}
