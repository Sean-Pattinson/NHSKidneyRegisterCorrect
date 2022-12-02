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
public class NHSPatientTest
{
    
    public NHSPatientTest()
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
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getFullName method, of class NHSPatient.
     */
    @Test
    public void testGetFullName()
    {
        System.out.println("getFullName");
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );
        String expResult = "MORTY";
        String result = instance.getFullName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setFullName method, of class NHSPatient.
     */
    @Test
    public void testSetFullName()
    {
        System.out.println("setFullName");
        String fullName = "RICKY";
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;
        instance.setFullName(fullName);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getNHSNorthPatientID1996 method, of class NHSPatient.
     */
    @Test
    public void testGetNHSNorthPatientID1996()
    {
        System.out.println("getNHSNorthPatientID1996");
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;;
        String expResult = "93409834098";
        String result = instance.getNHSNorthPatientID1996();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNHSNorthPatientID1996 method, of class NHSPatient.
     */
    @Test
    public void testSetNHSNorthPatientID1996()
    {
        System.out.println("setNHSNorthPatientID1996");
        String NHSNorthPatientID1996 = "0180980";
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );
        instance.setNHSNorthPatientID1996(NHSNorthPatientID1996);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getAddress method, of class NHSPatient.
     */
    @Test
    public void testGetAddress()
    {
        System.out.println("getAddress");
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;;
        String expResult = "NE54 5AA";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAddress method, of class NHSPatient.
     */
    @Test
    public void testSetAddress()
    {
        System.out.println("setAddress");
        String address = "voissiosdh";
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;;
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getBirthYear method, of class NHSPatient.
     */
    @Test
    public void testGetBirthYear()
    {
        System.out.println("getBirthYear");
         NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;;
        int expResult = 0;
        int result = instance.getBirthYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setBirthYear method, of class NHSPatient.
     */
    @Test
    public void testSetBirthYear()
    {
        System.out.println("setBirthYear");
        int birthYear = 6;
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );
        instance.setBirthYear(birthYear);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getBirthYear(), birthYear);
    }

    /**
     * Test of isIsAlive method, of class NHSPatient.
     */
    @Test
    public void testIsIsAlive()
    {
        System.out.println("isIsAlive");
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );
        boolean expResult = true;
        boolean result = instance.isIsAlive();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIsAlive method, of class NHSPatient.
     */
    @Test
    public void testSetIsAlive()
    {
        System.out.println("setIsAlive");
        boolean isAlive = false;
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );
        instance.setIsAlive(isAlive);
       
       assertEquals(instance.isIsAlive(),isAlive ); 
    }

    /**
     * Test of toString method, of class NHSPatient.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;
        String expResult = "MORTY|93409834098|NE54 5AA|0|true";
        String result = instance.toString();
       
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of hashCode method, of class NHSPatient.
     */
    @Test
    public void testHashCode()
    {
        System.out.println("hashCode");
        NHSPatient instance = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;;
        int expResult = 1017033813;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of equals method, of class NHSPatient.
     */
    @Test
    public void testEquals()
    {
        System.out.println("equals");
        Object obj  = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;;
        NHSPatient instance  = new NHSPatient("MORTY","93409834098", "NE54 5AA" );
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
        Object obj2  = new NHSPatient("MORTY","93409834098", "NE54 5AA" );;;
        instance  = new NHSPatient("MORTY","00000", "NE54 5AA" );
        
        expResult = false;
        result = instance.equals(obj2);
        assertEquals(expResult, result);
    }
    
}
