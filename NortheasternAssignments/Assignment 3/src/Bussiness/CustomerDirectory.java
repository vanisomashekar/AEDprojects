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
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer(){
        Customer newCustomer = new Customer();
        customerDirectory.add(newCustomer);
        return newCustomer;
    }
    
    public void deleteCustomer(Customer customer){
        customerDirectory.remove(customer);
    }
    public Customer searchAccount(String name){
        for(Customer Cust : this.customerDirectory){
            if(Cust.getCustomerName().equalsIgnoreCase(name)){
                return Cust;
            }
        }
        return null;
    }
}
