/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import business.Personalinfo;
//import java.awt.Toolkit;
/**
 *
 * @author vaniv
 */
public class Assignment_Mainframe extends javax.swing.JFrame {

    /**
     * Creates new form Assignment_Mainframe
     */
    @SuppressWarnings("FieldMayBeFinal")
    private Personalinfo personalinfo;
    
    public Assignment_Mainframe() {
       this.setResizable(false);
        initComponents();
      //  Toolkit tk =Toolkit.getDefaultToolkit();
        //int xsize = (int) tk.getScreenSize().getWidth();
       // int ysize = (int) tk.getScreenSize().getHeight();
       // this.setSize(xsize,ysize);
        personalinfo = new Personalinfo();     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainJPanel = new javax.swing.JPanel();
        PersonalProfileLabel = new javax.swing.JLabel();
        splitpane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        completeButton = new javax.swing.JButton();
        DisplayPanel = new javax.swing.JPanel();
        ProfilePicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainJPanel.setBackground(new java.awt.Color(4, 78, 4));
        MainJPanel.setForeground(new java.awt.Color(102, 0, 0));
        MainJPanel.setPreferredSize(new java.awt.Dimension(1563, 1200));

        PersonalProfileLabel.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        PersonalProfileLabel.setForeground(new java.awt.Color(255, 255, 255));
        PersonalProfileLabel.setText("PERSONAL PROFILE");

        splitpane.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        splitpane.setForeground(new java.awt.Color(102, 102, 102));

        ControlPanel.setBackground(new java.awt.Color(51, 102, 0));
        ControlPanel.setPreferredSize(new java.awt.Dimension(290, 914));

        createButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        createButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("CREATE");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        viewButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("VIEW");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        completeButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        completeButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        completeButton.setForeground(new java.awt.Color(255, 255, 255));
        completeButton.setText("REPORT");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(579, Short.MAX_VALUE))
        );

        splitpane.setLeftComponent(ControlPanel);

        DisplayPanel.setBackground(new java.awt.Color(0, 102, 51));
        DisplayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, null));

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1321, Short.MAX_VALUE)
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        splitpane.setRightComponent(DisplayPanel);

        ProfilePicture.setIcon(new javax.swing.ImageIcon("C:\\Users\\vaniv\\Pictures\\PROFILE 3.png")); // NOI18N

        javax.swing.GroupLayout MainJPanelLayout = new javax.swing.GroupLayout(MainJPanel);
        MainJPanel.setLayout(MainJPanelLayout);
        MainJPanelLayout.setHorizontalGroup(
            MainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1563, Short.MAX_VALUE)
            .addGroup(MainJPanelLayout.createSequentialGroup()
                .addGap(539, 539, 539)
                .addComponent(ProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PersonalProfileLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainJPanelLayout.setVerticalGroup(
            MainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainJPanelLayout.createSequentialGroup()
                .addGroup(MainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainJPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(PersonalProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainJPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(splitpane, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(MainJPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Create Button opens Create JPanel and Aligns the panel on the right-side of the split panel
 *  
 */
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        CreateJPanel createPanel = new CreateJPanel(personalinfo);
        splitpane.setRightComponent(createPanel);
    }//GEN-LAST:event_createButtonActionPerformed
/**
 * View Button calls the View JPanel and aligns on the right-side of the panel
 * 
 */
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        ViewJPanel viewPanel = new ViewJPanel(personalinfo);
        splitpane.setRightComponent(viewPanel);
    }//GEN-LAST:event_viewButtonActionPerformed
/**
 * 
 * Report Button displays the Report for all the JPanels and aligns the panel on the right-side of the split pane.
 */
    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        ReportJPanel reportJPanel = new ReportJPanel(personalinfo);
        splitpane.setRightComponent(reportJPanel);
    }//GEN-LAST:event_completeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Assignment_Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment_Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment_Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment_Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment_Mainframe().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JPanel MainJPanel;
    private javax.swing.JLabel PersonalProfileLabel;
    private javax.swing.JLabel ProfilePicture;
    private javax.swing.JButton completeButton;
    private javax.swing.JButton createButton;
    private javax.swing.JSplitPane splitpane;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
