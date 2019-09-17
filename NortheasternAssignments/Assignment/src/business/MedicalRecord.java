/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author vaniv
 */
public class MedicalRecord {
    private String Medical_Recordnum;
    private String Alergy1;
    private String Alergy2;
    private String Alergy3;
    
    public String getMedical_Recordnum() {
        return Medical_Recordnum;
    }

    public void setMedical_Recordnum(String Medical_Recordnum) {
        this.Medical_Recordnum = Medical_Recordnum;
    }

    public String getAlergy1() {
        return Alergy1;
    }

    public void setAlergy1(String Alergy1) {
        this.Alergy1 = Alergy1;
    }

    public String getAlergy2() {
        return Alergy2;
    }

    public void setAlergy2(String Alergy2) {
        this.Alergy2 = Alergy2;
    }

    public String getAlergy3() {
        return Alergy3;
    }

    public void setAlergy3(String Alergy3) {
        this.Alergy3 = Alergy3;
    }
}
