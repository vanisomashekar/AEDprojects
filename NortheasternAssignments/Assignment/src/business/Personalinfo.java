/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import javax.swing.ComboBoxModel;
import javax.swing.Icon;


/**
 *
 * @author vaniv
 */
public class Personalinfo{
    
    /**
     *
     * @param arg
     */
    
    public Demographic demograph = new Demographic();

    public Demographic getDemograph() {
        return demograph;
    }

    public void setDemograph(Demographic demograph) {
        this.demograph = demograph;
    }
    
    public Address address = new Address();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public SavingAccount savingAccount = new SavingAccount();

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
    
    public CheckingAccount checkingAccount = new CheckingAccount();

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
    
    public DriversLicense driversLicense = new DriversLicense();

    public DriversLicense getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(DriversLicense driversLicense) {
        this.driversLicense = driversLicense;
    }
    
    public MedicalRecord medicalRecord = new MedicalRecord();

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
    
    public Demographic createDemo(String fname, String lname, String contact , String dob ,String age , String height , String weight , String ssn){
        demograph.setFirstname(fname);
        demograph.setLastname(lname);
        demograph.setPhone_number(contact);
        demograph.setDob(dob);
        demograph.setAge(age);
        demograph.setHeight(height);
        demograph.setWeight(weight);
        demograph.setSsn(ssn);
        return demograph;
    } 
    
    public Address  createAdd(String Street , String City , String State , String Zip){
        address.setStreet(Street);
        address.setCity(City);
        address.setState(State);
        address.setZip_code(Zip);
        return address;
    }
    
    public SavingAccount createSaving(String BN, String BRN , String BAN , String AB, ComboBoxModel AT){
        savingAccount.setSaving_bankname(BN);
        savingAccount.setSaving_bankRN(BRN);
        savingAccount.setSaving_bankAN(BAN);
        savingAccount.setSaving_accountbal(AB);
        savingAccount.setSaving_accounttype(AT);
        return savingAccount;
    }
    
    public CheckingAccount createChecking(String CBN , String CRN , String CAN , String CAB , ComboBoxModel CAT){
        checkingAccount.setCurrent_bankname(CBN);
        checkingAccount.setCurrent_bankRN(CRN);
        checkingAccount.setCurrent_bankAN(CAN);
        checkingAccount.setCurrent_accountbal(CAB);
        checkingAccount.setCurrent_accounttype(CAT);
        return checkingAccount;
    }
    
    public DriversLicense createDL(String LN, String DOI , String DOE , String BT , Icon Picture){
        driversLicense.setLicense_number(LN);
        driversLicense.setDate_issued(DOI);
        driversLicense.setDate_expiration(DOE);
        driversLicense.setBlood_type(BT);
        driversLicense.setPicture(Picture);
        return driversLicense;
    }
    
    public MedicalRecord createMR(String MRN , String A1 , String A2 , String A3){
        medicalRecord.setMedical_Recordnum(MRN);
        medicalRecord.setAlergy1(A1);
        medicalRecord.setAlergy2(A2);
        medicalRecord.setAlergy3(A3);
        return medicalRecord;
    }
    
    }
    