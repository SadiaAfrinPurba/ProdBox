/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPClient;

import UDPServer.*;
import UDPClient.LoginForm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;


/**
 *
 * @author afrin
 */
public class ClientDirectoryForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeDirectoryForm
     */
    LoginForm loginForm = new LoginForm();
    String folderName;
    int createFolderClicked = 0;
    
    public ClientDirectoryForm() {
        initComponents();
        labelUsername.setText(loginForm.username);
        jPanel2.setBackground(Color.white);
        btnFolder1.setVisible(false);
        btnFolder2.setVisible(false);
        btnFolder3.setVisible(false);
        btnFolder4.setVisible(false);
        btnFolder5.setVisible(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2 , dim.height / 2 - this.getSize().height / 2);
    }
    
    public void  showFolderIcon(JButton btnName){
        btnName.setVisible(true);
        btnName.setText(folderName);
    }
    public void setDirectory(JButton btnName){
        //ClientDirectoryForm clientDir = new ClientDirectoryForm();
        labelDir.setText("home/" + btnName.getText());
        //clientDir.setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        labelCreateFolder = new javax.swing.JLabel();
        labelUpload = new javax.swing.JLabel();
        labelDownload = new javax.swing.JLabel();
        panelFolderSpace = new javax.swing.JPanel();
        btnFolder1 = new javax.swing.JButton();
        btnFolder2 = new javax.swing.JButton();
        btnFolder3 = new javax.swing.JButton();
        btnFolder4 = new javax.swing.JButton();
        btnFolder5 = new javax.swing.JButton();
        labelDir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/box.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("PordBox");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        labelUsername.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(170, 0, 255));
        labelUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        labelUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUsernameMouseClicked(evt);
            }
        });

        labelCreateFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/create-folder.png"))); // NOI18N
        labelCreateFolder.setToolTipText("New Folder");
        labelCreateFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCreateFolderMouseClicked(evt);
            }
        });

        labelUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/upload.png"))); // NOI18N
        labelUpload.setToolTipText("Upload");
        labelUpload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUploadMouseClicked(evt);
            }
        });

        labelDownload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/download.png"))); // NOI18N
        labelDownload.setToolTipText("Download");
        labelDownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDownloadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCreateFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelCreateFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        btnFolder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-medium.png"))); // NOI18N
        btnFolder1.setBorder(null);
        btnFolder1.setContentAreaFilled(false);
        btnFolder1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFolder1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFolder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolder1ActionPerformed(evt);
            }
        });

        btnFolder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-medium.png"))); // NOI18N
        btnFolder2.setBorder(null);
        btnFolder2.setContentAreaFilled(false);
        btnFolder2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFolder2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFolder3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-medium.png"))); // NOI18N
        btnFolder3.setBorder(null);
        btnFolder3.setContentAreaFilled(false);
        btnFolder3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFolder3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFolder4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-medium.png"))); // NOI18N
        btnFolder4.setBorder(null);
        btnFolder4.setContentAreaFilled(false);
        btnFolder4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFolder4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFolder5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder-medium.png"))); // NOI18N
        btnFolder5.setBorder(null);
        btnFolder5.setContentAreaFilled(false);
        btnFolder5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFolder5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        labelDir.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        labelDir.setForeground(new java.awt.Color(170, 0, 255));
        labelDir.setText("home");

        javax.swing.GroupLayout panelFolderSpaceLayout = new javax.swing.GroupLayout(panelFolderSpace);
        panelFolderSpace.setLayout(panelFolderSpaceLayout);
        panelFolderSpaceLayout.setHorizontalGroup(
            panelFolderSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFolderSpaceLayout.createSequentialGroup()
                .addGroup(panelFolderSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFolderSpaceLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnFolder1)
                        .addGap(66, 66, 66)
                        .addComponent(btnFolder2)
                        .addGap(53, 53, 53)
                        .addComponent(btnFolder3)
                        .addGap(43, 43, 43)
                        .addComponent(btnFolder4)
                        .addGap(45, 45, 45)
                        .addComponent(btnFolder5))
                    .addGroup(panelFolderSpaceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDir, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFolderSpaceLayout.setVerticalGroup(
            panelFolderSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFolderSpaceLayout.createSequentialGroup()
                .addComponent(labelDir)
                .addGap(43, 43, 43)
                .addGroup(panelFolderSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFolder4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(btnFolder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFolder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFolder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFolder5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFolderSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelFolderSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelCreateFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCreateFolderMouseClicked
        // TODO add your handling code here:
         createFolderClicked++;
         
         if(createFolderClicked <= 5){
             folderName = JOptionPane.showInputDialog(null, "Give a folder name");
             if(createFolderClicked == 1){
                  showFolderIcon(btnFolder1);
                  
             }
             else if(createFolderClicked == 2){
                  showFolderIcon(btnFolder2);
                  
             }
             else if(createFolderClicked == 3){
                  showFolderIcon(btnFolder3);
                  
             }
              else if(createFolderClicked == 4){
                  showFolderIcon(btnFolder4);
                  
             }
             else if(createFolderClicked == 5){
                  showFolderIcon(btnFolder5);
                  
             }
             else{
                 JOptionPane.showMessageDialog(null, "Can not create a new folder", "Error", JOptionPane.ERROR_MESSAGE);
             }
            
            
            
         }
         else{
              JOptionPane.showMessageDialog(null, "You can not create more than 5 folders", "Error", JOptionPane.ERROR_MESSAGE);
         }
         
         
         String command = "mkdir "+folderName;
         Client client = new Client();
         //Server server = new Server();
        try {
            //client.sendPacket(command);
           
            client.clientNewFolder(command);
        } catch (Exception ex) {
            Logger.getLogger(ClientDirectoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         

    }//GEN-LAST:event_labelCreateFolderMouseClicked

    private void labelDownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDownloadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDownloadMouseClicked

    private void labelUploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUploadMouseClicked
        // TODO add your handling code here:
        String currentDir =  System.getProperty("user.dir");
        String chooserFilePath = String.join("/", ".","userProfile",loginForm.username);
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView());
        //chooser.setCurrentDirectory(new File(((FileSystemView.getFileSystemView()));
        //chooser.
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
            String command = "upload " + chooser.getSelectedFile();
            //JOptionPane.showMessageDialog(null, command);
            Client client = new Client();
            try {
                client.clientUploadFile(command);
            } catch (IOException ex) {
                Logger.getLogger(ClientDirectoryForm.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
        
    }//GEN-LAST:event_labelUploadMouseClicked

    private void labelUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsernameMouseClicked
       
       
       int confirm = JOptionPane.showConfirmDialog(null,"Do you want to log out?","Log out", JOptionPane.YES_NO_OPTION);
       if(confirm == 0){
           HomeDirectoryForm homeDir = new HomeDirectoryForm();
           homeDir.setVisible(true);
           this.dispose();
       
       }
           
       
    }//GEN-LAST:event_labelUsernameMouseClicked

    private void btnFolder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolder1ActionPerformed
        setDirectory(btnFolder1);
    }//GEN-LAST:event_btnFolder1ActionPerformed

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
            java.util.logging.Logger.getLogger(ClientDirectoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientDirectoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientDirectoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientDirectoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientDirectoryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFolder1;
    private javax.swing.JButton btnFolder2;
    private javax.swing.JButton btnFolder3;
    private javax.swing.JButton btnFolder4;
    private javax.swing.JButton btnFolder5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JLabel labelCreateFolder;
    private javax.swing.JLabel labelDir;
    private javax.swing.JLabel labelDownload;
    private javax.swing.JLabel labelUpload;
    private javax.swing.JLabel labelUsername;
    public javax.swing.JPanel panelFolderSpace;
    // End of variables declaration//GEN-END:variables
}
