/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Bussiness.Airline;
import Bussiness.AirlineDirectory;
import Bussiness.CustomerDirectory;
import Bussiness.Flight;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vaniv
 */
public class CreateReservationJPanel extends javax.swing.JPanel {
    
    private JPanel rightPanel;
    private AirlineDirectory airlineDirectory;
   
    CreateReservationJPanel(JPanel rightPanel, AirlineDirectory airlineDirectory) {
        initComponents();
        this.rightPanel = rightPanel;
        this.airlineDirectory = airlineDirectory;
        FromCombobox.removeAllItems();
        ToCombobox.removeAllItems();
        for(Airline air :airlineDirectory.getAirlineDirectory()){
            for(Flight flight : air.getFlightdir().getFlightDirectory()){
           FromCombobox.addItem(flight.getDepartLocation());
            }
        }
        for(Airline air :airlineDirectory.getAirlineDirectory()){
            for(Flight flight : air.getFlightdir().getFlightDirectory()){
                ToCombobox.addItem(flight.getArrivalLocation());
            }
        }
//        From.setText(FromCombobox.getSelectedItem().toString());
//        To.setText(ToCombobox.getSelectedItem().toString());
        
        
        DefaultTableModel dtm = (DefaultTableModel)ReservationTable.getModel();
        dtm.setRowCount(0);
        
        for(Airline air :airlineDirectory.getAirlineDirectory()){
            for(Flight flight : air.getFlightdir().getFlightDirectory()){
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = air;
                row[1]= flight.getFlightID();
                row[2] = flight.getDepartLocation();
                row[3] = flight.getArrivalLocation();
                row[4] = flight.getDepartTime();
                row[5] = flight.getPrice();
                dtm.addRow(row);
            }
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
        jLabel2 = new javax.swing.JLabel();
        FromCombobox = new javax.swing.JComboBox();
        ToCombobox = new javax.swing.JComboBox();
        proceed = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ReservationTable = new javax.swing.JTable();
        SelectBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FROM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TO");

        FromCombobox.setBackground(new java.awt.Color(0, 51, 102));
        FromCombobox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FromCombobox.setForeground(new java.awt.Color(255, 255, 255));
        FromCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FromCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromComboboxActionPerformed(evt);
            }
        });

        ToCombobox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ToCombobox.setForeground(new java.awt.Color(255, 255, 255));
        ToCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        proceed.setBackground(new java.awt.Color(0, 51, 102));
        proceed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setText("PROCEED");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        ReservationTable.setBackground(new java.awt.Color(0, 51, 102));
        ReservationTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ReservationTable.setForeground(new java.awt.Color(255, 255, 255));
        ReservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AIRLINES", "FLIGHT ID", "FROM", "TO", "TIME", "PRICE"
            }
        ));
        jScrollPane3.setViewportView(ReservationTable);

        SelectBtn.setBackground(new java.awt.Color(0, 51, 102));
        SelectBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SelectBtn.setForeground(new java.awt.Color(255, 255, 255));
        SelectBtn.setText("SELECT");
        SelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(FromCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 522, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ToCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(574, 574, 574))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(566, 566, 566))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SelectBtn, proceed});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(FromCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(proceed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectBtn)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SelectBtn, proceed});

    }// </editor-fold>//GEN-END:initComponents

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)ReservationTable.getModel();
        dtm.setRowCount(0);
        String search = FromCombobox.getSelectedItem().toString();
        String Search1 = ToCombobox.getSelectedItem().toString();
       
        for(Airline air :airlineDirectory.getAirlineDirectory()){
         for(Flight flight :air.getFlightdir().getFlightDirectory()){
             String flight1 = flight.getFlightID();
             flight = air.getFlightdir().searchAccount(search, Search1, flight1);
             
            if (flight == flight && flight != null){
             
             Object[] row = new Object[dtm.getColumnCount()];
                row[0] = air;
                row[1]=  flight.getFlightID();
                row[2] = flight.getDepartLocation();
                row[3] = flight.getArrivalLocation();
                row[4] = flight.getDepartTime();
                row[5] = flight.getPrice();
               dtm.addRow(row);
        }
        }
    }    
    }//GEN-LAST:event_proceedActionPerformed

    private void SelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBtnActionPerformed
        int selectRow = ReservationTable.getSelectedRow();
        if(selectRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }else{
            
           Airline air= (Airline)ReservationTable.getValueAt(selectRow,0);
           CustomerDetailsJPanel customerJPanel = new CustomerDetailsJPanel(rightPanel,air);
            rightPanel.add("customerJPanel" , customerJPanel);
            CardLayout Layout = (CardLayout)rightPanel.getLayout();
            Layout.next(rightPanel);
            
        }
    }//GEN-LAST:event_SelectBtnActionPerformed

    private void FromComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromComboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox FromCombobox;
    private javax.swing.JTable ReservationTable;
    private javax.swing.JButton SelectBtn;
    private javax.swing.JComboBox ToCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton proceed;
    // End of variables declaration//GEN-END:variables
}
