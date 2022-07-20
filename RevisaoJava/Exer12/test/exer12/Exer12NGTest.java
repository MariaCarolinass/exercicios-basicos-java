/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exer12;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author carol
 */
public class Exer12NGTest {
    
    public Exer12NGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método main, da classe Exer12.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Exer12.main(args);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
