/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPServer;

import UDPClient.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author afrin
 */
public class ServerWelcomeForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    
    public ServerWelcomeForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2 , dim.height / 2 - this.getSize().height / 2);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();
        LabelConnected = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("   ProdBox");
        kGradientPanel1.add(jLabel6);
        jLabel6.setBounds(30, 80, 180, 40);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(170, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Status");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(30, 270, 64, 50);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(170, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Connected ");
        jLabel4.setToolTipText("");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(0, 320, 160, 30);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(170, 0, 255));
        jLabel7.setText("Total Clients");
        kGradientPanel1.add(jLabel7);
        jLabel7.setBounds(40, 370, 90, 15);

        LabelStatus.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        LabelStatus.setForeground(new java.awt.Color(249, 43, 43));
        LabelStatus.setText("Closed");
        kGradientPanel1.add(LabelStatus);
        LabelStatus.setBounds(150, 290, 90, 15);

        LabelConnected.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        LabelConnected.setForeground(new java.awt.Color(170, 0, 255));
        LabelConnected.setText("None");
        kGradientPanel1.add(LabelConnected);
        LabelConnected.setBounds(150, 330, 36, 15);

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(170, 0, 255));
        jLabel10.setText("3");
        kGradientPanel1.add(jLabel10);
        jLabel10.setBounds(150, 370, 9, 15);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Login");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(60, 400, 100, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/curve.png"))); // NOI18N
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 90, 310, 450);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/box.png"))); // NOI18N
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(100, 30, 90, 50);

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ServerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerWelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerWelcomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelConnected;
    public javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
