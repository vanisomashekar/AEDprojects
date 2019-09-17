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
public class SavingAccount {
    private String saving_bankname;
    private String saving_bankRN;
    private String saving_bankAN;
    private String saving_accountbal;
    private ComboBoxModel saving_accounttype;

    public String getSaving_bankname() {
        return saving_bankname;
    }

    public void setSaving_bankname(String saving_bankname) {
        this.saving_bankname = saving_bankname;
    }

    public String getSaving_bankRN() {
        return saving_bankRN;
    }

    public void setSaving_bankRN(String saving_bankRN) {
        this.saving_bankRN = saving_bankRN;
    }

    public String getSaving_bankAN() {
        return saving_bankAN;
    }

    public void setSaving_bankAN(String saving_bankAN) {
        this.saving_bankAN = saving_bankAN;
    }

    public String getSaving_accountbal() {
        return saving_accountbal;
    }

    public void setSaving_accountbal(String saving_accountbal) {
        this.saving_accountbal = saving_accountbal;
    }

    public ComboBoxModel getSaving_accounttype() {
        return saving_accounttype;
    }

    public void setSaving_accounttype(ComboBoxModel saving_accounttype) {
        this.saving_accounttype = saving_accounttype;
    }

}
