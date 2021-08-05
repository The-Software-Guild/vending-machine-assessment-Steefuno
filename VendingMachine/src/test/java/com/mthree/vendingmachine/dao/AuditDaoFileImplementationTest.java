/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 
 */
package com.mthree.vendingmachine.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Steven
 */
public class AuditDaoFileImplementationTest {
    
    public AuditDaoFileImplementationTest() {
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
     * Test of log method, of class AuditDaoFileImplementation.
     */
    @Test
    public void testLog() {
        System.out.println("log");
        String message = "";
        AuditDaoFileImplementation instance = null;
        instance.log(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class AuditDaoFileImplementation.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        AuditDaoFileImplementation instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
