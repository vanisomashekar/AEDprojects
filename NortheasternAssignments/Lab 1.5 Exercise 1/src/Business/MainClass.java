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
public class MainClass {
     public static void main(String arg[]){
     Person person =new Person();
     //using person object to set the variable
     person.setFirstName("Vani");
     person.setLastName("Somashekar");
     
     Address LocalAddress = new Address();
     Address WorkAddress = new Address();
     Address HomeAddress = new Address();
     // using three different objects for Address
     LocalAddress.setLocalAddress("Northeastern University,Huntington Ave,Boston,MA");
     WorkAddress.setWorkAddress("Boylston Street,Boston,MA");
     HomeAddress.setHomeAddress("44 Parker Hill Ave,Boston,MA");
     //for printing the values.
     System.out.println("Person");
     System.out.println("First Name:"+ person.getFirstName());
     System.out.println("Last Name:" + person.getLastName());
     System.out.println("Address");
     System.out.println("Local Address:" + LocalAddress.getLocalAddress());
     System.out.println("Work Address:" + WorkAddress.getWorkAddress());
     System.out.println("Home Address:" + HomeAddress.getHomeAddress());
     }
}
