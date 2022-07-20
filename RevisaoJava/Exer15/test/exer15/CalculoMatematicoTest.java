/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exer15;


/**
 *
 * @author carol
 */
public class CalculoMatematicoTest {
    
    public CalculoMatematicoTest() {
    }
    
    public static void setUpClass() {
    }
    public static void tearDownClass() {
    }
   
    public void setUp() {
    }
  
    public void tearDown() {
    }

    /**
     * Test of divisao method, of class CalculoMatematico.
     */

    public void testDivisao() {
        System.out.println("divisao");
        int valor1 = 0;
        int valor2 = 0;
        CalculoMatematico instance = new CalculoMatematico();
        int expResult = 0;
        int result = instance.divisao(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertEquals(int expResult, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
