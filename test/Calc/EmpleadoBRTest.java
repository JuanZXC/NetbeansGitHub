/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class EmpleadoBRTest {
    
    public EmpleadoBRTest() {
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
     * Test of calculaSalarioBruto method, of class EmpleadoBR.
     */
    @Test
    public void testCalculaSalarioBruto() throws Exception {
        System.out.println("calculaSalarioBruto");
        TipoEmpleado tipo = null;
        float ventasMes = 2000.0F;
        float horasExtra = 8.0F;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 1360.0F;
        float result = instance.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculaSalarioNeto method, of class EmpleadoBR.
     */
    @Test
    public void testCalculaSalarioNeto() throws Exception {
        System.out.println("calculaSalarioNeto");
        float salarioBruto = 0.0F;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 0.0F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
