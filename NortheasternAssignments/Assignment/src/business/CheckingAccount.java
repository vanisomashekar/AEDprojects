/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import javax.swing.ComboBoxModel;

/**
 *
 * @author vaniv
 */
public class CheckingAccount {
    private String current_bankname;
    private String current_bankRN;
    private String current_bankAN;
    private String current_accountbal;
    private ComboBoxModel current_accounttype;
    
     public String getCurrent_bankname() {
        return current_bankname;
    }

    public void setCurrent_bankname(String current_bankname) {
        this.current_bankname = current_bankname;
    }

    public String getCurrent_bankRN() {
        return current_bankRN;
    }

    public void setCurrent_bankRN(String current_bankRN) {
        this.current_bankRN = current_bankRN;
    }

    public String getCurrent_bankAN() {
        return current_bankAN;
    }

    public void setCurrent_bankAN(String current_bankAN) {
        this.current_bankAN = current_bankAN;
    }

    public String getCurrent_accountbal() {
        return current_accountbal;
    }

    public void setCurrent_accountbal(String current_accountbal) {
        this.current_accountbal = current_accountbal;
    }

    public ComboBoxModel getCurrent_accounttype() {
        return current_accounttype;
    }

    public void setCurrent_accounttype(ComboBoxModel current_accounttype) {
        this.current_accounttype = current_accounttype;
    }

}
