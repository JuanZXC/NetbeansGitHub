
package Calc;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Juan
 */
@RunWith(Parameterized.class)
public class FechaTest {
    
    private int tipo;
    private String result;

    public FechaTest(int tipo, String result) {
        this.tipo = tipo;
        this.result = result;
    }
    
    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{1,"2017/04"},{2,"04/2016"},{3,"04/17"},{4,"No"}});
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
     * Test of DevuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha() {
        System.out.println("DevuelveFecha");
        Fecha instance = new Fecha();
        String resulte = instance.DevuelveFecha(tipo);
        assertEquals(resulte, this.result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    /*@Test
    public void testDevuelveFecha() {
        System.out.println("DevuelveFecha");
        int tipo = 1;
        Fecha instance = new Fecha();
        String expResult = "2017/03";
        String result = instance.DevuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }*/
    
}
