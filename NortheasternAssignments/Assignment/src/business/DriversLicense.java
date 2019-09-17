/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.awt.Image;
import javax.swing.Icon;

/**
 *
 * @author vaniv
 */
public class DriversLicense {
    private String License_number;
    private String date_issued;
    private String date_expiration;
    private String blood_type;
    private Icon Picture;
   
    public String getLicense_number() {
        return License_number;
    }

    public void setLicense_number(String License_number) {
        this.License_number = License_number;
    }

    public String getDate_issued() {
        return date_issued;
    }

    public void setDate_issued(String date_issued) {
        this.date_issued = date_issued;
    }

    public String getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(String date_expiration) {
        this.date_expiration = date_expiration;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
    public Icon getPicture(){
        return Picture;
    }
    
    public void setPicture(Icon Picture){
        this.Picture = Picture;
    }
}
