/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author vaniv
 */
public class Address {
  //Variable declaration
    String LocalAddress;
    String WorkAddress;
    String HomeAddress;
//getter and setter for allocation of the variable
    public String getLocalAddress() {
        return LocalAddress;
    }

    public void setLocalAddress(String LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    public String getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(String WorkAddress) {
        this.WorkAddress = WorkAddress;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }
      
}
