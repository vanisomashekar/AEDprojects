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
public class FlightDirectory {
    private ArrayList<Flight> flightDirectory;
    
    
    public FlightDirectory(){
        flightDirectory = new ArrayList<Flight>();
        for(Flight flight : this.flightDirectory){
            if(flight.getAvailableSeats() == 0){
                deleteFlight(flight);
            }
        }
    }

    public ArrayList<Flight> getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(ArrayList<Flight> flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

   
    public Flight addFlight(){
        Flight newflight = new Flight();
        flightDirectory.add(newflight);
        return newflight;
    }
    
    public void deleteFlight(Flight flight){
        flightDirectory.remove(flight);
    }
    
    public Flight searchAccount(String ID , String IV, String FID){
        for(Flight fli : this.flightDirectory){
            if(fli.getDepartLocation().equalsIgnoreCase(ID) && fli.getArrivalLocation().equalsIgnoreCase(IV))
            {
              if(fli.getFlightID().equals(FID)){
                return fli;
            }
            }
        }
        return null;
    }
}
