/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.ArrayList;

/**
 *
 * @author vaniv
 */
public class AirlineDirectory {
    private ArrayList<Airline> airlineDirectory;
    
    
    public AirlineDirectory(){
        airlineDirectory = new ArrayList<Airline>();
    }

    public ArrayList<Airline> getAirlineDirectory() {
        return airlineDirectory;
    }

    public void setAirlineDirectory(ArrayList<Airline> airlineDirectory) {
        this.airlineDirectory = airlineDirectory;
    }
 
    public Airline addAirline(){
        Airline newAirline = new Airline();
        airlineDirectory.add(newAirline);
        return newAirline;
    }
    
    public void deleteAirline(Airline airline){
        airlineDirectory.remove(airline);
    }
    public Airline searchAccount(String name){
        for(Airline air : this.airlineDirectory){
            if(air.getAirlineName().equalsIgnoreCase(name)){
                return air;
            }
        }
        return null;
    }
}
