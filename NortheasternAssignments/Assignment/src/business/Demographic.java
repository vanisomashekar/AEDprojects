/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author vaniv
 */
public class Demographic {
    
    private String firstname;
    private String lastname;
    private String phone_number;
    private String dob;
    private String age;
    private String height;
    private String weight;
    private String ssn;
    
    
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
     
    public Demographic  d(String firstname,String lastname,String phone_number,String dob , String age , String height , String weight , String ssn){
     this.firstname = firstname;
     this.lastname = lastname;
     this.age = age;
     this.phone_number = phone_number;
     this.dob = dob;
     this.height =height;
     this.weight = weight;
     this.ssn = ssn;
     return d(firstname,lastname,phone_number,dob,age,height , weight , ssn);
     }
    }

