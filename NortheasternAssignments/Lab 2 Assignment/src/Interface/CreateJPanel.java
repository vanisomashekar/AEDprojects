/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author vaniv
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Product product = new Product();
    
    public CreateJPanel(Product product) {
        initComponents();
        this.product = product;
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
        NameLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        AvailnumberLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Availnumber = new javax.swing.JTextField();
        SubmitJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCT INFORMATION");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameLabel.setText("NAME");

        PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PriceLabel.setText("PRICE");

        AvailnumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AvailnumberLabel.setText("AVAILABLE NUMBER");

        DescriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DescriptionLabel.setText("DESCRIPTION");

        Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Availnumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        SubmitJButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        SubmitJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitJButton.setText("SUBMIT");
        SubmitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitJButtonActionPerformed(evt);
            }
        });

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Description.setRows(5);
        jScrollPane1.setViewportView(Description);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PriceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AvailnumberLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(Availnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(SubmitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AvailnumberLabel, DescriptionLabel, NameLabel, PriceLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Availnumber, Name, Price});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceLabel)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Availnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvailnumberLabel))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescriptionLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(SubmitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AvailnumberLabel, DescriptionLabel, NameLabel, PriceLabel});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Availnumber, Name, Price});

    }// </editor-fold>//GEN-END:initComponents
//to collect the values when clicked on submit 
    private void SubmitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitJButtonActionPerformed
        product.setName(Name.getText());
        product.setPrice(Price.getText());
        product.setAvailNum(Availnumber.getText());
        product.setDescription(Description.getText());
        //Prompt user that the product was successfully created;
        JOptionPane.showMessageDialog(null,"Product successfully created");
    }//GEN-LAST:event_SubmitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Availnumber;
    private javax.swing.JLabel AvailnumberLabel;
    private javax.swing.JTextArea Description;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField Price;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JButton SubmitJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
