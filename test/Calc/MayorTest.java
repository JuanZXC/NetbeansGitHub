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
public class MayorTest {

    public MayorTest() {
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
     * Test of obt_mayorNumero method, of class Mayor.
     */
    @Test
    public void testObt_mayorNumero() {
        /*System.out.println("obt_mayorNumero");
         int[] lista = null;
         int expResult = 0;
         int result = Mayor.obt_mayorNumero(lista);
         assertEquals(expResult, result);
         // TODO review the generated test code and remove the default call to fail.
         fail("The test case is a prototype.");*/
        System.out.println("obt_mayorNumero");
        try {
            assertEquals(0, Mayor.obt_mayorNumero(null));
            fail("The test case is a prototype.");
        } catch (NullPointerException e) {

        }
        assertEquals(9, Mayor.obt_mayorNumero(new int[]{3, 7, 9, 8}));
    }

    @Test
    public void testObt_mayorNumero2() {

        System.out.println("obt_mayorNumero");
        try {
            assertEquals(0, Mayor.obt_mayorNumero(null));
            fail("The test case is a prototype.");
        } catch (NullPointerException e) {

        }

        assertEquals(9, Mayor.obt_mayorNumero(new int[]{9, 7, 8}));
    }

    @Test
    public void testObt_mayorNumero3() {

        System.out.println("obt_mayorNumero");
        try {
            assertEquals(0, Mayor.obt_mayorNumero(null));
            fail("The test case is a prototype.");
        } catch (NullPointerException e) {

        }

        assertEquals(9, Mayor.obt_mayorNumero(new int[]{7, 9, 8}));

    }

    @Test
    public void testObt_mayorNumero4() {

        System.out.println("obt_mayorNumero");
        try {
            assertEquals(0, Mayor.obt_mayorNumero(null));
            fail("The test case is a prototype.");
        } catch (NullPointerException e) {

        }

        assertEquals(9, Mayor.obt_mayorNumero(new int[]{7, 8, 9}));

    }

    @Test
    public void testObt_mayorNumero5() {

        System.out.println("obt_mayorNumero");
        try {
            assertEquals(0, Mayor.obt_mayorNumero(null));
            fail("The test case is a prototype.");
        } catch (NullPointerException e) {

        }

        assertEquals(9, Mayor.obt_mayorNumero(new int[]{9, 7, 9, 8}));

    }

    @Test
    public void testObt_mayorNumero6() {

        System.out.println("obt_mayorNumero");
        try {
            assertEquals(0, Mayor.obt_mayorNumero(null));
            fail("The test case is a prototype.");
        } catch (NullPointerException e) {

        }

        assertEquals(7, Mayor.obt_mayorNumero(new int[]{7}));

    }

    @Test
    public void testObt_mayorNumero7() {

        System.out.println("obt_mayorNumero");
        try {
            assertEquals(0, Mayor.obt_mayorNumero(null));
            fail("The test case is a prototype.");
        } catch (NullPointerException e) {

        }
        assertEquals(-4, Mayor.obt_mayorNumero(new int[]{-4, -6, -7, -22}));
    }
}
