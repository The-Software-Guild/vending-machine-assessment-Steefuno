/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 
 */

package com.mthree.vendingmachine.dao;

import com.mthree.vendingmachine.dto.Change;
import java.math.BigDecimal;

/**
 * 
 * @author Steven
 */
public interface BalanceDao {
    /**
     * Adds change to the current balance
     * @param change the set of coins to add
     * @return the new balance
     */
    BigDecimal addBalance(Change change);
    
    /**
     * Removes from the balance
     * @param deduction the BigDecimal to remove from the balance
     * @return the new balance
     */
    BigDecimal deductBalance(BigDecimal deduction);
    
    /**
     * Gets the balance
     * @return the balance
     */
    BigDecimal getBalance();
    
    /**
     * Converts the balance to change
     * @return the change
     */
    Change close();
}
