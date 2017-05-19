

package Calc;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;

/**
 * 
 * @author Juan
 * 
 */
public class CalculadoraMultiplicarTest {
     private int num1;
    private int num2;
    private int result;
    
    public CalculadoraMultiplicarTest(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{20, 10, 200}, {30, -2, 60}, {5, 2, -10}});
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

    @Test
    public void testMulti() {
        System.out.println("Multi");
        Calculadora instance = new Calculadora(this.num1, this.num2);
        int Mu = instance.multiplica();
        assertEquals(this.result, Mu);
    }

}
