/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 
 */
package com.mthree.vendingmachine.dao;

import com.mthree.vendingmachine.dto.Change;
import java.math.BigDecimal;
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
public class BalanceDaoImplementationTest {
    
    public BalanceDaoImplementationTest() {
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
     * Test of addBalance method, of class BalanceDaoImplementation.
     */
    @Test
    public void testAddBalance() {
        System.out.println("addBalance");
        Change change = null;
        BalanceDaoImplementation instance = new BalanceDaoImplementation();
        BigDecimal expResult = null;
        BigDecimal result = instance.addBalance(change);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deductBalance method, of class BalanceDaoImplementation.
     */
    @Test
    public void testDeductBalance() throws Exception {
        System.out.println("deductBalance");
        BigDecimal deduction = null;
        BalanceDaoImplementation instance = new BalanceDaoImplementation();
        BigDecimal expResult = null;
        BigDecimal result = instance.deductBalance(deduction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class BalanceDaoImplementation.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BalanceDaoImplementation instance = new BalanceDaoImplementation();
        BigDecimal expResult = null;
        BigDecimal result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class BalanceDaoImplementation.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        BalanceDaoImplementation instance = new BalanceDaoImplementation();
        Change expResult = null;
        Change result = instance.close();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
