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
public class SeatDirectory {
    private ArrayList<Seats> seatDirectory;
    
    
    public SeatDirectory(){
        seatDirectory = new ArrayList<Seats>();
    }

    public ArrayList<Seats> getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(ArrayList<Seats> seatDirectory) {
        this.seatDirectory = seatDirectory;
    }

    public Seats addSeat(){
        Seats newSeat = new Seats();
        seatDirectory.add(newSeat);
        return newSeat;
    }
    
    public void deleteSeat(Seats seat){
        seatDirectory.remove(seat);
    }
    public Seats searchAccount(String name){
        for(Seats seat : this.seatDirectory){
            if(seat.getSelectedSeat().equalsIgnoreCase(name)){
                return seat;
            }
        }
        return null;
    }
}
