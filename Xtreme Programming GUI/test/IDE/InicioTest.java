/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IDE;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karadak
 */
public class InicioTest {
    
    public InicioTest() {
        
        System.out.println("Se inician los componentes Graficos");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Inicio.
     */
    @Test
    public void testMain() {
        System.out.println("El main se ejecuto");
        String[] args = null;
        Inicio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
