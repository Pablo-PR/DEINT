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
public class NumeroComplejoTest {
    
    public NumeroComplejoTest() {
    }
    
    NumeroComplejo num1;
    NumeroComplejo num2;
    
    @Before
    public void inicializar() {
        num1 = new NumeroComplejo(1, 1);
        num2 = new NumeroComplejo(1, 1);
    }

    /**
     * Test of suma method, of class NumeroComplejo.
     */
    @Test
    public void testSuma() {
        NumeroComplejo numResultado = new NumeroComplejo(2, 2);
        assertEquals(num1.suma(num2), numResultado);
    }

    /**
     * Test of division method, of class NumeroComplejo.
     */
    @Test
    public void testDivision() {
        NumeroComplejo numResultado = new NumeroComplejo(1, 0);
        assertEquals(num1.division(num2), numResultado);
    }
}