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
public class FactorialTest {

    private int num;

    public FactorialTest(int num) {
        this.num = num;
    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{2}, {37}, {0}, {-23}});
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
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        Factorial instance = new Factorial();
        int result = Factorial.calculo(this.num);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /*@Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 5;
        int expResult = 120;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }*/

}
