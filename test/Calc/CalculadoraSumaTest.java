package Calc;

/**
 *
 * @author Juan
 *
 */
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

@RunWith(Parameterized.class)
public class CalculadoraSumaTest {

    private int num1;
    private int num2;
    private int result;
    
    public CalculadoraSumaTest(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{20, 10, 30}, {30, -2, 28}, {5, 2, 7}});
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
    public void testSuma() {
        System.out.println("Suma");
        Calculadora instance = new Calculadora(this.num1, this.num2);
        int Suma = instance.suma();
        assertEquals(this.result, Suma);
    }

}
