/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabio
 */
public class TimeIT {
    
    public TimeIT() {
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
     * Test of getId method, of class Time.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Time instance = new Time();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Time.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Time instance = new Time();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Time.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Time instance = new Time();
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class Time.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        Time instance = new Time();
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnico method, of class Time.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        Time instance = new Time();
        String expResult = "";
        String result = instance.getTecnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnico method, of class Time.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("setTecnico");
        String tecnico = "";
        Time instance = new Time();
        instance.setTecnico(tecnico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
