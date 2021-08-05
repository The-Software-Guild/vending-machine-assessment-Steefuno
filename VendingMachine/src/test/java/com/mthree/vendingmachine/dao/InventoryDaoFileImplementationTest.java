/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 
 */
package com.mthree.vendingmachine.dao;

import com.mthree.vendingmachine.dto.Item;
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
public class InventoryDaoFileImplementationTest {
    
    public InventoryDaoFileImplementationTest() {
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
     * Test of removeItem method, of class InventoryDaoFileImplementation.
     */
    @Test
    public void testRemoveItem() throws Exception {
        System.out.println("removeItem");
        String itemName = "";
        InventoryDaoFileImplementation instance = null;
        instance.removeItem(itemName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllItems method, of class InventoryDaoFileImplementation.
     */
    @Test
    public void testGetAllItems() {
        System.out.println("getAllItems");
        InventoryDaoFileImplementation instance = null;
        String[] expResult = null;
        String[] result = instance.getAllItems();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class InventoryDaoFileImplementation.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        String itemName = "";
        InventoryDaoFileImplementation instance = null;
        Item expResult = null;
        Item result = instance.getItem(itemName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class InventoryDaoFileImplementation.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        InventoryDaoFileImplementation instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
