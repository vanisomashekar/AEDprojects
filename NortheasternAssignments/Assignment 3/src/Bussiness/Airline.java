/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

/**
 *
 * @author vaniv
 */
public class Airline {
    private static int count = 0;
    private String AirlineName;
    private int airlineID;
    private FlightDirectory flightdir;
    
    
    public Airline(){
        count++;
        airlineID =count;
        flightdir = new FlightDirectory();
    }


    public FlightDirectory getFlightdir() {
        return flightdir;
    }

    public int getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(int airlineID) {
        this.airlineID = airlineID;
    }
    
    public String getAirlineName() {
        return AirlineName;
    }

    public void setAirlineName(String AirlineName) {
        this.AirlineName = AirlineName;
    }

//    public Flight createFlight(int flightID, String DepartLoc,String ArrivalLoc, String departTime,String Date,int price, int windowseats,int middleseats ,int aisleseats){
//        flight.setFlightID(flightID);
//        flight.setDepartLocation(DepartLoc);
//        flight.setArrivalLocation(ArrivalLoc);
//        flight.setDepartTime(departTime);
//        flight.setDate(Date);
//        flight.setPrice(price);
//        flight.setWindowSeats(windowseats);
//        flight.setMiddleSeats(middleseats);
//        flight.setAisleSeats(aisleseats);
//        return flight;
//    }
    
    @Override
    public String toString() {
        return this.getAirlineName(); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
