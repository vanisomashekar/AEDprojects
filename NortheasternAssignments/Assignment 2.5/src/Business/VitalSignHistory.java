/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author vaniv
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignHistory;
   // private ArrayList<VitalSigns> VitalSignList;
    
     public VitalSignHistory()
     {
         vitalSignHistory = new ArrayList<VitalSigns>();
         
     }
    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v){
        vitalSignHistory.remove(v);
    }
    
    public ArrayList<VitalSigns> getAbnormalList(double maxTemp,double minTemp){
        ArrayList<VitalSigns> abnList = new ArrayList<>();
        for(VitalSigns vs :vitalSignHistory){
            if(vs.getTemperature()> maxTemp || vs.getTemperature()< minTemp){
                abnList.add(vs);
            }  
        }
        return abnList;
    }
}
