/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.probando;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class ProbandoTest {
    
    public ProbandoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Probando.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Probando instance = new Probando(2,8);
        int expResult = 10;
        int result = instance.sumar();
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class Probando.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Probando instance = new Probando(2,8);
        int expResult = -6;
        int result = instance.restar();
        assertEquals(expResult, result);
    }

    
}
