/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.Date;

/**
 *
 * @author vaniv
 */
public class Flight {
    
    private String FlightId;
    private String departTime;
    private Date date;

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String FlightId) {
        this.FlightId = FlightId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    private int price;
    private String DepartLocation;
    private int availableSeats;
    private CustomerDirectory customerdir;
    
    public Flight(){
        customerdir = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerdir() {
        return customerdir;
    }

    public void setCustomerdir(CustomerDirectory customerdir) {
        this.customerdir = customerdir;
    }
    

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    
     public String getDepartLocation() {
        return DepartLocation;
    }

    public void setDepartLocation(String DepartLocation) {
        this.DepartLocation = DepartLocation;
    }

    public String getArrivalLocation() {
        return ArrivalLocation;
    }

    public void setArrivalLocation(String ArrivalLocation) {
        this.ArrivalLocation = ArrivalLocation;
    }
    private String ArrivalLocation;
    
    public String getFlightID() {
        return FlightId;
    }

    public void setFlightID(String flightID) {
        this.FlightId = flightID;
    }
     public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    
   public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
@Override
    public String toString() {
        return FlightId;
    }
}
