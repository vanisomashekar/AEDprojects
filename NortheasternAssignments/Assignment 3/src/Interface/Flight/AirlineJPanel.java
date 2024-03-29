/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Flight;

import Bussiness.Airline;
import Bussiness.AirlineDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author vaniv
 */
public class AirlineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlineJPanel
     */
    private JPanel rightPanel;
    private AirlineDirectory airlineDirectory;

    AirlineJPanel(JPanel rightPanel, AirlineDirectory airlineDirectory) {
       initComponents(); 
       this.rightPanel = rightPanel;
       this.airlineDirectory = airlineDirectory;
       AirlineCombobox.removeAllItems();
       for(Airline airline : airlineDirectory.getAirlineDirectory()) {
           AirlineCombobox.addItem(airline);
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

        jLabel1 = new javax.swing.JLabel();
        AirlineCombobox = new javax.swing.JComboBox();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AIRLINE");

        AirlineCombobox.setBackground(new java.awt.Color(0, 51, 102));
        AirlineCombobox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AirlineCombobox.setForeground(new java.awt.Color(255, 255, 255));
        AirlineCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        searchBtn.setBackground(new java.awt.Color(0, 51, 102));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(AirlineCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(searchBtn)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AirlineCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addContainerGap(398, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        Airline airline = (Airline)AirlineCombobox.getSelectedItem();
        ManageFlightsJPanel manageFlightsJPanel = new ManageFlightsJPanel(rightPanel, airline);
        rightPanel.add("manageFlightsJPanel",manageFlightsJPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AirlineCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
