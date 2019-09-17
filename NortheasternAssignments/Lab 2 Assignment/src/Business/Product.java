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
    private String price;
    private String availNum;
    private String description;
    //getters and setters for allocation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
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
    public Supplier Create(String ID, String Name , String Status,String City){
        supplier.setID(ID);
        supplier.setSName(Name);
        supplier.setStatus(Status);
        supplier.setCity(City);
        return supplier;
    }
    
    
}
