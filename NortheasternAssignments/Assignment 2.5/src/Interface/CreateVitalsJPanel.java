/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;

/**
 *
 * @author vaniv
 */
public class CreateVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalsJPanel
     */
    
    private VitalSignHistory vsh;
    CreateVitalsJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh=vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BloodPressure = new javax.swing.JLabel();
        temperature = new javax.swing.JTextField();
        bloodPressure = new javax.swing.JTextField();
        Pulse = new javax.swing.JTextField();
        BloodPressure1 = new javax.swing.JLabel();
        BloodPressure2 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Savebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Temperature");

        BloodPressure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressure.setText("Blood Pressure");

        temperature.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bloodPressure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Pulse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BloodPressure1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressure1.setText("Pulse");

        BloodPressure2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressure2.setText("Date");

        Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Savebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Savebtn.setText("Save");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BloodPressure2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BloodPressure1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Pulse, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BloodPressure, BloodPressure1, BloodPressure2, Date, Pulse, bloodPressure, jLabel1, temperature});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodPressure)
                    .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BloodPressure1)
                    .addComponent(Pulse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodPressure2)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BloodPressure, BloodPressure1, BloodPressure2, Date, Pulse, bloodPressure, jLabel1, temperature});

    }// </editor-fold>//GEN-END:initComponents

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        double Temperature =    Double.parseDouble(temperature.getText());
        double BloodPressure = Double.parseDouble(bloodPressure.getText());
        int pulse = Integer.parseInt(Pulse.getText());
        String date = Date.getText();
        VitalSigns v = vsh.addVitals();
        v.setTemperature(Temperature);
        v.setBloodPressure(BloodPressure);
        v.setPulse(pulse);
        v.setDate(date);
        JOptionPane.showMessageDialog(null,"VitalSigns Added Successfully");
        
        //to clear after all the values are accepted
        bloodPressure.setText("");
        temperature.setText("");
        Pulse.setText("");
        Date.setText("");
    }//GEN-LAST:event_SavebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodPressure;
    private javax.swing.JLabel BloodPressure1;
    private javax.swing.JLabel BloodPressure2;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Pulse;
    private javax.swing.JButton Savebtn;
    private javax.swing.JTextField bloodPressure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField temperature;
    // End of variables declaration//GEN-END:variables
}