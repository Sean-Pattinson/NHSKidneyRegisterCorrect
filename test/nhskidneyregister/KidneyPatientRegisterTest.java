/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhskidneyregister;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Sheep Dalton
 */
public class KidneyPatientRegisterTest
{
    
    public KidneyPatientRegisterTest()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    static int ID = 1 ;
    
    protected  
            KidneyPatient makeKidneyPaitent()
            { 
                return new KidneyPatient("BOB"+ID, String.format("%d", ID++), "NOWHERE", 0 , 0);
            } 
    protected  KidneyDonor makeKidneyDonor()
            { 
                return new KidneyDonor("JENE"+ID, String.format("%d", ID++), "NOWHERE", 0 , 1);
            } 
           

    /**
     * Test of reset method, of class KidneyPatientRegister.
     */
    @Test
    public void testReset()
    {
        System.out.println("reset");
        KidneyPatientRegister instance = new KidneyPatientRegister();
        assertEquals(instance.countPatients(), 0);
        instance.addKindeyPatient(makeKidneyPaitent());
         assertEquals(instance.countPatients(), 1);
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
         assertEquals(instance.countPatients(), 0);
    }

    /**
     * Test of testForDuplicates method, of class KidneyPatientRegister.
     */
    @Test
    public void testTestForDuplicates()
    {
        KidneyPatientRegister instance = new KidneyPatientRegister();
        String p1ID = "NHS111,2222"; 
        String donorID = "NHS999,333"; 

        KidneyPatient p = new KidneyPatient("Adam Adams", p1ID, "ADDRESS-EMPTY",0,3); 
        instance.addKindeyPatient( p ); 
        assert instance.registerContains(p1ID )== true : "register.registerContains failed";
        assert instance.countPatients() == 1  : "runInternalChecks::register.countPatients() failed"; 

        KidneyPatient theDuplicatePaitent = new KidneyPatient("Jene Adams","NHS999,4444", "ADDRESS-EMPTY",0,3); 

        KidneyDonor donor = new KidneyDonor("EVE Adams", donorID, "ADDRESS-EMPTY2" , 1, 2 );
        assert donor != null : "no donor"; 
        boolean b  = instance.addDonor(p1ID, donor);  

        List<DonorsToPatientPair> dups = instance.listDuplicateDonors();
        // ADD DELIBERATE DUPLICATE 
        assert dups.size() == 0 : "Duplicates found where there were non.";
        assertEquals(dups.size() , 0  );
        instance.addKindeyPatient( theDuplicatePaitent ); 
        instance.addDonor(theDuplicatePaitent.getNHSNorthPatientID1996(), donor);
        dups = instance.listDuplicateDonors();
        assertEquals(dups.size(), 4);
        
       /* assert dups.size() == 4 : "Duplicates not found."; 
        
        ArrayList<KidneyPatient> expResult = null;
        ArrayList<KidneyPatient> result = instance.testForDuplicates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/ 
    }

    /**
     * Test of addKindeyPatient method, of class KidneyPatientRegister.
     */
    @Test
    public void testAddKindeyPatient()
    {
        System.out.println("addKindeyPatient");
        KidneyPatient p = new KidneyPatient("BOB", "000", "NOWHERE", 0 , 0);;
        KidneyPatientRegister instance = new KidneyPatientRegister();
        instance.addKindeyPatient(p);
        assertEquals(instance.countPatients(), 1);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addDonor method, of class KidneyPatientRegister.
     */
    @Test
    public void testAddDonor()
    {
        System.out.println("addDonor");
        KidneyPatient patient = this.makeKidneyPaitent(); 
        KidneyDonor donar = new KidneyDonor("GENE", "001", "NOWHERE", 0 , 0);
        
        KidneyPatientRegister instance = new KidneyPatientRegister();
        boolean expResult = false;
        boolean result = instance.addDonor(patient.getNHSNorthPatientID1996(), donar);
       
        KidneyDonor find = instance.getDonorForID("001"); 
        
        assertEquals(find , donar);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPairForPatientID method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetPairForPatientID()
    {
        System.out.println("getPairForPatientID");
       
        KidneyPatientRegister instance = new KidneyPatientRegister();
        KidneyPatient patient = this.makeKidneyPaitent(); 
        KidneyDonor donar = new KidneyDonor("GENE", "001", "NOWHERE", 0 , 0);
        instance.addKindeyPatient(patient);
        boolean ignore = instance.addDonor(patient.getNHSNorthPatientID1996(), donar);
        
        DonorsToPatientPair result = 
               instance.getPairForPatientID(patient.getNHSNorthPatientID1996());
        
        assertEquals(patient.getNHSNorthPatientID1996(), result.getPaientID());
    }

    /**
     * Test of getPairForDonor method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetPairForDonor()
    {
        System.out.println("getPairForDonor");
        KidneyPatient patient = this.makeKidneyPaitent(); 
        KidneyDonor donar = new KidneyDonor("GENE", "001", "NOWHERE", 0 , 0);
        KidneyPatientRegister instance = new KidneyPatientRegister();
        boolean expResult = false;
        boolean ignore = instance.addDonor(patient.getNHSNorthPatientID1996(), donar);
        
        DonorsToPatientPair result = instance.getPairForDonor(donar.getNHSNorthPatientID1996());
        assertNotNull(result ); 
        assertEquals(result.getDonorID(), donar.getNHSNorthPatientID1996());
        assertEquals(result.getPaientID(), patient.getNHSNorthPatientID1996());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of registerContains method, of class KidneyPatientRegister.
     */
    @Test
    public void testRegisterContains()
    {
        System.out.println("registerContains");
        String NHSpatientID = "000";
        KidneyPatientRegister instance = new KidneyPatientRegister();
        boolean expResult = false;
        boolean result = instance.registerContains(NHSpatientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFirstRecipientForDonor method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetFirstRecipientForDonor()
    {
        System.out.println("getFirstRecipientForDonor");
        KidneyPatient patient = this.makeKidneyPaitent(); 
        KidneyDonor donor = new KidneyDonor("GENE", "001", "NOWHERE", 0 , 0);
        
        KidneyPatientRegister instance = new KidneyPatientRegister();
        instance.addKindeyPatient(patient);
        boolean ignore = instance.addDonor(patient.getNHSNorthPatientID1996(), donor);
       
        KidneyPatient result = instance.getFirstRecipientForDonor(donor);
        assertEquals(patient, result);
    }

    /**
     * Test of getDonorForRecipient method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetDonorForRecipient()
    {
        System.out.println("getDonorForRecipient");
        KidneyPatient p = this.makeKidneyPaitent();
        KidneyPatientRegister instance = new KidneyPatientRegister();
        instance.addKindeyPatient(p);
        KidneyDonor expResult = this.makeKidneyDonor();
       
        instance.addDonor(p.getNHSNorthPatientID1996(), expResult);
        KidneyDonor result  = instance.getDonorForRecipient(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDonorsWithBloodType method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetDonorsWithBloodType()
    {
        System.out.println("getDonorsWithBloodType");
        int type = 0;
        KidneyPatientRegister instance = new KidneyPatientRegister();
        KidneyPatient p = this.makeKidneyPaitent();
        KidneyDonor d = this.makeKidneyDonor();
        instance.addKindeyPatient(p);
        instance.addDonor(p.getNHSNorthPatientID1996(), d);
        List<KidneyDonor> expResult = null;
        List<KidneyDonor> result = instance.getDonorsWithBloodType(d.getBloodType());
        assertEquals(1, result.size());
        assertEquals(result.get(0), d);
    }

    /**
     * Test of getDonorsAndTheirPaitentsForBloodType method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetDonorsAndTheirPaitentsForBloodType()
    {
        System.out.println("getDonorsAndTheirPaitentsForBloodType");
        int type = 0;
        KidneyPatientRegister instance = new KidneyPatientRegister();
        String expResult = "Donor -> recipient\nJENE7|7|NOWHERE|0|true|0|1 -> BOB6|6|NOWHERE|0|true|0|0\n";
        KidneyPatient p = this.makeKidneyPaitent();
        KidneyDonor d = this.makeKidneyDonor();
        instance.addKindeyPatient(p);
        instance.addDonor(p.getNHSNorthPatientID1996(), d);

        String result = instance.getDonorsAndTheirPaitentsForBloodType(d.getBloodType());
         // do this in case changes System.out.println("*******'"+result+"'"); 
        assertEquals(expResult, result);
    }

    /**
     * Test of getDonorForID method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetDonorForID()
    {
        System.out.println("getDonorForID");
        String donorID = "000";
        KidneyPatientRegister instance = new KidneyPatientRegister();
        KidneyDonor expResult =  makeKidneyDonor();
        instance.addDonor(expResult.getNHSNorthPatientID1996(), expResult); 
        
        KidneyDonor result = instance.getDonorForID(expResult.getNHSNorthPatientID1996());
        assertEquals(result, expResult);
    }

    /**
     * Test of getPatientforID method, of class KidneyPatientRegister.
     */
    @Test
    public void testGetPatientforID()
    {
        System.out.println("getPatientforID");
      
        KidneyPatientRegister instance = new KidneyPatientRegister();
        KidneyPatient expResult = this.makeKidneyPaitent();
        instance.addKindeyPatient(expResult);
        
        KidneyPatient result = instance.getPatientforID(expResult.getNHSNorthPatientID1996());
        assertEquals(expResult, result);
    }

    /**
     * Test of countPatients method, of class KidneyPatientRegister.
     */
    @Test
    public void testCountPatients()
    {
        System.out.println("countPatients");
        KidneyPatientRegister instance = new KidneyPatientRegister();
        int expResult = 0;
        int result = instance.countPatients();
        assertEquals(expResult, result);
          instance.addKindeyPatient(makeKidneyPaitent());
          expResult= 1 ; 
        assertEquals(instance.countPatients(), expResult );
    }

    /**
     * Test of listAllPairs method, of class KidneyPatientRegister.
     */
    @Test
    public void testListAllPairs()
    {
        System.out.println("listAllPairs");
        KidneyPatientRegister instance = new KidneyPatientRegister();
        String expResult = "";
        
        String result = instance.listAllPairs();
        assertEquals(expResult, result);   
        
        
    }

    /**
     * Test of listDuplicateDonors method, of class KidneyPatientRegister.
     */
    @Test
    public void testListDuplicateDonors()
    {
        System.out.println("listDuplicateDonors");
        KidneyPatientRegister instance = new KidneyPatientRegister();
        List<DonorsToPatientPair> expResult = null;
        List<DonorsToPatientPair> result = instance.listDuplicateDonors();
        assertEquals(0, result.size());
        
        String p1ID = "NHS111,2222"; 
        String donorID = "NHS999,333"; 

        KidneyPatient p = new KidneyPatient("Adam Adams", p1ID, "ADDRESS-EMPTY",0,3); 
        instance.addKindeyPatient( p ); 
        assert instance.registerContains(p1ID )== true : "register.registerContains failed";
        assert instance.countPatients() == 1  : "runInternalChecks::register.countPatients() failed"; 

        KidneyDonor donor = new KidneyDonor("EVE Adams", donorID, "ADDRESS-EMPTY2" , 1, 2 );
        assert donor != null : "no donor"; 
        boolean b  = instance.addDonor(p1ID, donor);
           
          KidneyPatient theDuplicatePaitent = new KidneyPatient("Jene Adams","NHS999,4444", "ADDRESS-EMPTY",0,3); 

            List<DonorsToPatientPair> dups = instance.listDuplicateDonors();
        // ADD DELIBERATE DUPLICATE 
            assert dups.size() == 0 : "Duplicates found where there were non.";
            instance.addKindeyPatient( theDuplicatePaitent ); 
            instance.addDonor(theDuplicatePaitent.getNHSNorthPatientID1996(), donor);
            dups = instance.listDuplicateDonors();
            assertEquals( dups.size(),  4 );  
  
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of testForDonarPureity method, of class KidneyPatientRegister.
     */
    @Test
    public void testTestForDonarPureity()
    {
        System.out.println("testForDonarPureity");
        KidneyPatientRegister instance = new KidneyPatientRegister();
        List<DonorsToPatientPair> expResult = null;
        List<DonorsToPatientPair> result = instance.testForDonarPureity();
        assertEquals(0, result.size());
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
