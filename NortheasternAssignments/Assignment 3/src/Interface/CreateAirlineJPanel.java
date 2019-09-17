/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Bussiness.Airline;
import Bussiness.AirlineDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vaniv
 */
public class CreateAirlineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirlineJPanel
     */
//    private Airline airline;
    private JPanel rightPanel;
    private AirlineDirectory airlineDirectory;
    
    CreateAirlineJPanel(JPanel rightPanel, AirlineDirectory airlineDirectory) {
       initComponents(); 
       this.rightPanel = rightPanel;
       this.airlineDirectory = airlineDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AirlineID = new javax.swing.JTextField();
        AirlineName = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AirlineTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AIRLINE ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AIRLINE NAME");

        AirlineID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AirlineID.setEnabled(false);
        AirlineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineIDActionPerformed(evt);
            }
        });

        AirlineName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AirlineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineNameActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 51, 102));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD ");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        Backbtn.setBackground(new java.awt.Color(0, 51, 102));
        Backbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Backbtn.setForeground(new java.awt.Color(255, 255, 255));
        Backbtn.setText("<< BACK");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        AirlineTable.setBackground(new java.awt.Color(0, 51, 102));
        AirlineTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AirlineTable.setForeground(new java.awt.Color(255, 255, 255));
        AirlineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AIRLINE NAME", "AIRLINE ID"
            }
        ));
        jScrollPane1.setViewportView(AirlineTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addGap(415, 415, 415)
                        .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addGap(561, 561, 561)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AirlineID, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(AirlineName, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addGap(482, 482, 482))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AirlineID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AirlineName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backbtn))
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AirlineID, AirlineName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddBtn, Backbtn});

    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
    
           Airline airline = airlineDirectory.addAirline();
    //airline.setAirlineID(Integer.parseInt(AirlineID.getText()));
        airline.setAirlineName(AirlineName.getText());
        
        JOptionPane.showMessageDialog(null, "Airline Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
      //AirlineID.setText("");
        AirlineName.setText("");
        populate();
       
    }//GEN-LAST:event_AddBtnActionPerformed

    public void populate(){
        DefaultTableModel dtm =(DefaultTableModel)AirlineTable.getModel();
         dtm.setRowCount(0);
        for(Airline b : airlineDirectory.getAirlineDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=b;
            row[1]=b.getAirlineID();
            dtm.addRow(row);
        }
        
    }
    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersJPanel manageAirlineJPanel = (ManageAirlinersJPanel) component;
        manageAirlineJPanel.populate();
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void AirlineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlineNameActionPerformed

    private void AirlineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlineIDActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AirlineID;
    private javax.swing.JTextField AirlineName;
    private javax.swing.JTable AirlineTable;
    private javax.swing.JButton Backbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
