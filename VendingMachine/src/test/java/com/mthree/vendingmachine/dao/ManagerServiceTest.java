/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 
 */
package com.mthree.vendingmachine.dao;

import com.mthree.vendingmachine.dto.Change;
import com.mthree.vendingmachine.dto.Item;
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
public class ManagerServiceTest {
    
    public ManagerServiceTest() {
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
     * Test of addBalance method, of class ManagerService.
     */
    @Test
    public void testAddBalance() {
        System.out.println("addBalance");
        Change change = null;
        ManagerService instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.addBalance(change);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class ManagerService.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        ManagerService instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of purchaseItem method, of class ManagerService.
     */
    @Test
    public void testPurchaseItem() throws Exception {
        System.out.println("purchaseItem");
        String itemName = "";
        ManagerService instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.purchaseItem(itemName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllItems method, of class ManagerService.
     */
    @Test
    public void testGetAllItems() {
        System.out.println("getAllItems");
        ManagerService instance = null;
        String[] expResult = null;
        String[] result = instance.getAllItems();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class ManagerService.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        String itemName = "";
        ManagerService instance = null;
        Item expResult = null;
        Item result = instance.getItem(itemName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class ManagerService.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        ManagerService instance = null;
        Change expResult = null;
        Change result = instance.close();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
