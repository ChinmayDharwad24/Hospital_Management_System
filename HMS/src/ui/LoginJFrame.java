/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Hospital.City.CityDirectory;
import Hospital.Community.CommunityDirectory;
import Hospital.Doctor.Doctor;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Encounter.EncounterDirectory;
import Hospital.Hospital.HospitalDirectory;
import Hospital.House.HouseDirectory;
import Hospital.Patient.Patient;
import Hospital.Patient.PatientDirectory;
import Hospital.VitalSigns.VitalSignDirectory;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;
import ui.CommunityAdminWorkspace.CommunityAdminDashboard;
import ui.DoctorWorkspace.DoctorDashboard;
import ui.HospitalAdminWorkspace.HospitalAdminDashboard;
import ui.PatientWorkspace.PatientDashboard;
import ui.SystemAdminWorkspace.SystemAdminDashboard;

/**
 *
 * @author chinm
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    PatientDirectory patientList;
    DoctorDirectory doctorList;
    CityDirectory cityList;
    CommunityDirectory communityList;
    HospitalDirectory hospitalList;
    HouseDirectory houseList;
    EncounterDirectory encounterList;
    VitalSignDirectory vitalSignList;
    
    public LoginJFrame(PatientDirectory patientList,DoctorDirectory doctorList,CityDirectory cityList,CommunityDirectory communityList,HospitalDirectory hospitalList,HouseDirectory houseList,EncounterDirectory encounterList,VitalSignDirectory vitalSignList) {
        initComponents();
        this.patientList = patientList;
        this.doctorList = doctorList;
        this.cityList = cityList;
        this.communityList = communityList;
        this.hospitalList = hospitalList;
        this.houseList = houseList;
        this.encounterList =encounterList;
        this.vitalSignList = vitalSignList;
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
        jTextField2 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        cmbRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Hospital Management System");

        lblUsername.setText("Username : ");

        lblPassword.setText("Password : ");

        lblRole.setText("Role :");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Hospital Admin", "Community Admin", "Doctor", "Patient" }));
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblRole))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword)
                                    .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLogin)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClose)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnClose))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbRoleActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        char[] pass = txtPassword.getPassword();
        String password = new String(pass);
        String role = String.valueOf(cmbRole.getSelectedItem());
        Patient patient = patientList.findPatient(username, password);
        Doctor doctor = doctorList.findDoctor(username, password);
        
        if ( role.equals("Doctor")){
            if (username.equals((doctor.getUsername())) && password.equals(doctor.getPassword())){
                DoctorDashboard doctorPanel = new DoctorDashboard(doctor, patientList, doctorList, hospitalList, cityList, communityList, houseList, encounterList, vitalSignList);
                doctorPanel.setVisible(true);
                dispose();
            }
        }
        else if (role.equals("Patient")){
            if(username.equals(patient.getUsername()) && password.equals(patient.getPassword())){
                PatientDashboard patientPanel = new PatientDashboard(patient,patientList, doctorList,hospitalList, cityList,communityList,houseList,encounterList,vitalSignList);
                patientPanel.setVisible(true);
                dispose();
            }
        }
        else if ((username.equals("system") && password.equals("admin")) && role.equals("System Admin")){
//            JOptionPane.showMessageDialog(this, "Successfully logged in");
            SystemAdminDashboard systemAdminPanel = new SystemAdminDashboard(patientList, doctorList,hospitalList,cityList,communityList,houseList,encounterList,vitalSignList);
            systemAdminPanel.setVisible(true);
            dispose();
        }
        else if ((username.equals("hospital") && password.equals("admin")) && role.equals("Hospital Admin")){
            HospitalAdminDashboard hospitalAdminPanel = new HospitalAdminDashboard(patientList, doctorList,hospitalList,cityList,communityList,houseList,encounterList,vitalSignList);
            hospitalAdminPanel.setVisible(true);
            dispose();
        }
        else if ((username.equals("community") && password.equals("admin")) && role.equals("Community Admin")){
            CommunityAdminDashboard communityAdminPanel = new CommunityAdminDashboard(patientList, doctorList,hospitalList, cityList,communityList,houseList,encounterList,vitalSignList);
            communityAdminPanel.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
        }
  
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
