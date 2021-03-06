package MyUtility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elijah Silang
 */
public class FoodTest {
    Food FoodInstance;
    public FoodTest() {
    }
    
    @Before
    public void setUp() {
        FoodInstance = new Food();
    }
    
    @After
    public void tearDown() {
        FoodInstance = null;
    }

    /**
     * Test of getFoodSam method, of class Food.
     */
    @Test
    public void testGetFoodSam() {
        System.out.println("getFoodSam");
        String itemName = "Hamburger";
        Food instance = new Food();
        instance.setPrices_Sam();
        Food expResult = instance.Sam[0];
        Food result = instance.getFoodSam(itemName);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetFoodSam2() {
        System.out.println("getFoodSam");
        String itemName = "1";
        Food instance = new Food();
        instance.setPrices_Sam();
        Food expResult = null;
        Food result = instance.getFoodSam(itemName);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetFoodSam3() {
        System.out.println("getFoodSam");
        String itemName = "a";
        Food instance = new Food();
        instance.setPrices_Sam();
        Food expResult = null;
        Food result = instance.getFoodSam(itemName);
        assertEquals(expResult, result);
    }

    /**
     * Test of getFoodGuy method, of class Food.
     */
    @Test
    public void testGetFoodGuy() {
        System.out.println("getFoodGuy");
        String itemName = "Pizza";
        Food instance = new Food();
        instance.setPrices_Guy();
        Food expResult = instance.OneGuy[0];
        Food result = instance.getFoodGuy(itemName);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetFoodGuy2(){
        System.out.println("getFoodGuy");
        String itemName = "1";
        Food instance = new Food();
        instance.setPrices_Guy();
        Food expResult = null;
        Food result = instance.getFoodGuy(itemName);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetFoodGuy3(){
        System.out.println("getFoodGuy");
        String itemName = "a";
        Food instance = new Food();
        instance.setPrices_Guy();
        Food expResult = null;
        Food result = instance.getFoodGuy(itemName);
        assertEquals(expResult, result);
    }

    /**
     * Test of getFoodLou method, of class Food.
     */
    @Test
    public void testGetFoodLou() {
        System.out.println("getFoodLou");
        String itemName = "Ribs";
        Food instance = new Food();
        instance.setPrices_Lou();
        Food expResult = instance.Lou[1];
        Food result = instance.getFoodLou(itemName);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetFoodLou2() {
        System.out.println("getFoodLou");
        String itemName = "1";
        Food instance = new Food();
        instance.setPrices_Lou();
        Food expResult = null;
        Food result = instance.getFoodLou(itemName);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetFoodLou3() {
        System.out.println("getFoodLou");
        String itemName = "a";
        Food instance = new Food();
        instance.setPrices_Lou();
        Food expResult = null;
        Food result = instance.getFoodLou(itemName);
        assertEquals(expResult, result);
    }

}
