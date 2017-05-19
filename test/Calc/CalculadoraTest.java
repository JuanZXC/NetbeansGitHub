
package Calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Juan
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(6,2);
        int expResult = 8;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(12,1);
        int expResult = 11;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of resta_otro method, of class Calculadora.
     */
    @Test
    public void testResta_otro() {
        System.out.println("resta_otro");
        Calculadora instance = new Calculadora(7,1);
        /*int expResult=6;*/
        int result = instance.resta_otro();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of resta2_otro method, of class Calculadora.
     */
    @Test
    public void testResta2_otro() {
        System.out.println("resta2_otro");
        Calculadora instance = new Calculadora(7,2);
        /*boolean expResult = true;*/
        boolean result = instance.resta2_otro();
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora(2,2);
        int expResult = 4;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora(12,2);
        int expResult = 6;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divide_otro method, of class Calculadora.
     */
    @Test
    public void testDivide_otro() {
        System.out.println("divide_otro");
        Calculadora instance = new Calculadora(12,0);
        Integer expResult = null;
        Integer result = instance.divide_otro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of suma_otro method, of class Calculadora.
     */
    
    
}
