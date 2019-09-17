/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vaniv
 */
public class AbnormalPanel extends javax.swing.JPanel {

    /**
     * Creates new form AbnormalPanel
     */
   private VitalSignHistory vsh;
   double MaxTemp;
   double MinTemp;
   
    AbnormalPanel(VitalSignHistory vsh, double MaxTemp, double MinTemp) {
        initComponents();
        this.vsh = vsh;
        this.MaxTemp = MaxTemp;
        this.MinTemp = MinTemp;
        populateTable();
    }
    
    private void populateTable(){
         DefaultTableModel dtm =(DefaultTableModel)tblVitalSigns.getModel();
    dtm.setRowCount(0);
    for(VitalSigns vs : vsh.getAbnormalList(MaxTemp, MinTemp)){
        Object row[] = new Object[3];
        row[0] =vs;
        row[1]= vs.getBloodPressure();
        row[2]=vs.getTemperature();
        dtm.addRow(row);
    }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        ViewDetailsBtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        temperature = new javax.swing.JTextField();
        BloodPressure = new javax.swing.JLabel();
        bloodPressure = new javax.swing.JTextField();
        BloodPressure1 = new javax.swing.JLabel();
        Pulse = new javax.swing.JTextField();
        BloodPressure2 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 0));

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure", "Temperature"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSigns);

        ViewDetailsBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        ViewDetailsBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewDetailsBtn.setText("View Details");
        ViewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsBtnActionPerformed(evt);
            }
        });

        Deletebtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        Deletebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Temperature");

        temperature.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        temperature.setEnabled(false);

        BloodPressure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressure.setText("Blood Pressure");

        bloodPressure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bloodPressure.setEnabled(false);

        BloodPressure1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressure1.setText("Pulse");

        Pulse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pulse.setEnabled(false);

        BloodPressure2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressure2.setText("Date");

        Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Date.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Abnormal Vital Signs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(368, 368, 368))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BloodPressure2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(115, 115, 115)
                                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BloodPressure1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Pulse, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(ViewDetailsBtn))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Deletebtn)
                            .addGap(18, 18, 18)))
                    .addGap(235, 235, 235)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(661, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ViewDetailsBtn)
                        .addComponent(Deletebtn))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BloodPressure2)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsBtnActionPerformed
        int selectedrow = tblVitalSigns.getSelectedRow();
        if (selectedrow >= 0)
        {
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow,0);
            bloodPressure.setText(String.valueOf(vs.getBloodPressure()));
            temperature.setText(String.valueOf(vs.getTemperature()));
            Pulse.setText(String.valueOf(vs.getPulse()));
            Date.setText(String.valueOf(vs.getDate()));
        }else
        {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_ViewDetailsBtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        int selectedrow = tblVitalSigns.getSelectedRow();
        if (selectedrow >= 0)
        {
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow , 0);
            vsh.deleteVitals(vs);
            JOptionPane.showMessageDialog(null,"Vital Sign has been deleted");
            populateTable();

        }else
        {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_DeletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodPressure;
    private javax.swing.JLabel BloodPressure1;
    private javax.swing.JLabel BloodPressure2;
    private javax.swing.JTextField Date;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField Pulse;
    private javax.swing.JButton ViewDetailsBtn;
    private javax.swing.JTextField bloodPressure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField temperature;
    // End of variables declaration//GEN-END:variables
}