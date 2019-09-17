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
public class Customer {
    private String customerName;

    
    private String DOB;
    private String gender;
    private String Address;
    private String Flight;
    private String Airline;
    private PaymentDirectory PaymentDir;

    public PaymentDirectory getPaymentDir() {
        return PaymentDir;
    }

    public void setPaymentDir(PaymentDirectory PaymentDir) {
        this.PaymentDir = PaymentDir;
    }
    
    

    public String getFlight() {
        return Flight;
    }

    public void setFlight(String Flight) {
        this.Flight = Flight;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String Airline) {
        this.Airline = Airline;
    }
    private SeatDirectory seatDir;
    
    public Customer(){
        seatDir = new SeatDirectory();
        PaymentDir = new PaymentDirectory();
    }

    public SeatDirectory getSeatDir() {
        return seatDir;
    }

    public void setSeatDir(SeatDirectory SeatDir) {
        this.seatDir = SeatDir;
    }

    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    @Override
    public String toString() {
        return customerName;
    }
}
