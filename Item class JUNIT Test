/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyUtility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michaeldichiara
 */
public class ItemTest {
    Item Iteminstance;
    public ItemTest() {
        
    }
    
    @Before
    public void setUp() {
        Iteminstance= new Item();
    }
    
    @After
    public void tearDown() {
        Iteminstance=null;
    }

    /**
     * Test of setPrices method, of class Item.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        String itemName = "Pen";
        Item instance = new Item();
        instance.setPrices();
        Item expResult = instance.menu[4];
        Item result = instance.getItem(itemName);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetItem2() {
        System.out.println("getItem");
        String itemName = "1";
        Item instance = new Item();
        instance.setPrices();
        Item expResult = null;
        Item result = instance.getItem(itemName);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetItem3() {
        System.out.println("getItem");
        String itemName = "a";
        Item instance = new Item();
        instance.setPrices();
        Item expResult = null;
        Item result = instance.getItem(itemName);
        assertEquals(expResult, result);
        
    }
    


    
}
