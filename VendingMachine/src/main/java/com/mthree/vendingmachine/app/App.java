/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 04 Aug 2021
 */

package com.mthree.vendingmachine.app;

import com.mthree.vendingmachine.controller.Controller;
import com.mthree.vendingmachine.dao.AuditDao;
import com.mthree.vendingmachine.dao.AuditDaoFileImplementation;
import com.mthree.vendingmachine.dao.BalanceDao;
import com.mthree.vendingmachine.dao.BalanceDaoImplementation;
import com.mthree.vendingmachine.dao.InventoryDao;
import com.mthree.vendingmachine.dao.InventoryDaoFileImplementation;
import com.mthree.vendingmachine.dao.ManagerService;
import com.mthree.vendingmachine.ui.UI;
import com.mthree.vendingmachine.ui.UIConsoleImplementation;
import com.mthree.vendingmachine.ui.View;

/**
 * 
 * @author Steven
 */
public class App {
    public static void main(String[] args) {
        Controller controller;
        View view;
        UI ui;
        ManagerService manager;
        BalanceDao balanceDao;
        InventoryDao inventoryDao;
        AuditDao auditDao;
        
        balanceDao = new BalanceDaoImplementation();
        inventoryDao = new InventoryDaoFileImplementation("./Inventory");
        auditDao = new AuditDaoFileImplementation("./AuditLog");
        manager = new ManagerService(balanceDao, inventoryDao, auditDao);
        ui = new UIConsoleImplementation();
        view = new View(ui);
        controller = new Controller(view, manager);
        
        controller.run();
    }
}
