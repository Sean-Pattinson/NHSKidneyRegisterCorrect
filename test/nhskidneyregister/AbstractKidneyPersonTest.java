/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhskidneyregister;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sheep Dalton
 */
public class AbstractKidneyPersonTest
{
    AbstractKidneyPerson instance ; 
    
    public AbstractKidneyPersonTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
            
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        instance =
         new  AbstractKidneyPerson("MORTY","93409834098", "NE54 5AA" , 1,2  ); 
    }
    
    @After
    public void tearDown()
    {
            instance = null; 
            assertNull( instance); 
                    
    }

    /**
     * Test of getBloodType method, of class AbstractKidneyPerson.
     */
    @Test
    public void testGetBloodType()
    {
        System.out.println("getBloodType");
      
        int expResult = 1;
        int result = instance.getBloodType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setBloodType method, of class AbstractKidneyPerson.
     */
    @Test
    public void testSetBloodType()
    {
        System.out.println("setBloodType");
        int bloodType = 3 ;
       
        instance.setBloodType(bloodType);
        // TODO review the generated test code and remove the default call to fail.
         assertEquals(instance.getBloodType(), bloodType);
    }

    /**
     * Test of getKidneyType method, of class AbstractKidneyPerson.
     */
    @Test
    public void testGetKidneyType()
    {
        System.out.println("getKidneyType");
     
        int expResult = 2;
        int result = instance.getKidneyType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setKidneyType method, of class AbstractKidneyPerson.
     */
    @Test
    public void testSetKidneyType()
    {
        System.out.println("setKidneyType");
        int kidneyType = 5;
      
        instance.setKidneyType(kidneyType);
        // TODO review the generated test code and remove the default call to fail.
          assertEquals(kidneyType, instance.getKidneyType());
    }

    /**
     * Test of toString method, of class AbstractKidneyPerson.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
    
        String expResult = "MORTY|93409834098|NE54 5AA|0|true|1|2";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
