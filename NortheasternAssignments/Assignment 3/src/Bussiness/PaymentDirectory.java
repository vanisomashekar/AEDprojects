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
public class PaymentDirectory {
    private ArrayList<Payment> paymentDirectory;
    
    
    public PaymentDirectory(){
        paymentDirectory = new ArrayList<Payment>();
    }

    public ArrayList<Payment> getPaymentDirectory() {
        return paymentDirectory;
    }

    public void setPaymentDirectory(ArrayList<Payment> paymentDirectory) {
        this.paymentDirectory = paymentDirectory;
    }
    
    public Payment addPayment(){
        Payment newPayment = new Payment();
        paymentDirectory.add(newPayment);
        return newPayment;
    }
    
    public void deletePayment(Payment payment){
        paymentDirectory.remove(payment);
    }
    public Payment searchAccount(String name){
        for(Payment payment : this.paymentDirectory){
            if(payment.getName().equalsIgnoreCase(name)){
                return payment;
            }
        }
        return null;
    }
}
