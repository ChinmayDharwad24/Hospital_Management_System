/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PatientWorkspace;

import Hospital.Doctor.DoctorDirectory;
import Hospital.Encounter.Encounter;
import Hospital.Encounter.EncounterDirectory;
import Hospital.Hospital.HospitalDirectory;
import Hospital.Patient.Patient;
import Hospital.Patient.PatientDirectory;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author chinm
 */
public class PatientEncounterPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientEncounters
     */
    
    Patient patient;
    EncounterDirectory encounterList;
    HospitalDirectory hospitalList;
    PatientDirectory patientList;
    DoctorDirectory doctorList;
    
    public PatientEncounterPanel(Patient patient,EncounterDirectory encounterList,HospitalDirectory hospitalList,PatientDirectory patientList,DoctorDirectory doctorList) {
        initComponents();
        this.patient = patient;
        this.encounterList = encounterList;
        this.hospitalList = hospitalList;
        this.patientList = patientList;
        this.doctorList = doctorList;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneEncounter = new javax.swing.JScrollPane();
        tableEncounter = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        tableEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Encounter No", "Doctor", "Patient", "Room No", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPaneEncounter.setViewportView(tableEncounter);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Encounter Screen");

        lblSearch.setText("Search:");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPaneEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addGap(29, 29, 29)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(111, 111, 111)
                .addComponent(scrollPaneEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String searchQuery = txtSearch.getText();
        Search(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

 
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
        model.setRowCount(0);
        
        for(Encounter en : encounterList.getEncounterList()){
            
            if (en.getPatientUsername().equals(patient.getUsername())){
                Object[] row = new Object[6];
                row[0] = en; 
                row[1] = en.getHospital();
                row[2] = en.getDoctorName();
                row[3] = en.getRooomNo();
                row[4] = en.getDate();
                row[5] = en.getTime();
           
             
            model.addRow(row);
            }
        }
    }
    

    private void Search(String searchQuery){
        DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        tableEncounter.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchQuery));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollPaneEncounter;
    private javax.swing.JTable tableEncounter;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
