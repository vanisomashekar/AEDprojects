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
public class Product {
    //Variable declaration
    private String name;
    private double price;
    private int availNum;
    private String description;
    //getters and setters for allocation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     
    public Supplier supplier = new Supplier();

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    //to set the values of the supplier
    public Supplier CreatesupID(int ID){
        supplier.setID(ID);
        return supplier;
    }
    public Supplier CreatesupName(String Name){
        supplier.setSName(Name);
        return supplier;
    }
    public Supplier CreatesupStatus(String Status){
        supplier.setStatus(Status);
        return supplier;
    }
    public Supplier CreatesupCity(String City){
        supplier.setCity(City);
        return supplier;
    }
    
}
