/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CommunityAdminWorkspace;

import Hospital.City.CityDirectory;
import Hospital.Community.Community;
import Hospital.Community.CommunityDirectory;
import Hospital.House.House;
import Hospital.House.HouseDirectory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author chinm
 */
public class CommunityHousePanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityHousePanel
     */
    private HouseDirectory houseList;
    private CityDirectory cityList;
    private CommunityDirectory communityList;
    
    public CommunityHousePanel(HouseDirectory houseList, CityDirectory cityList, CommunityDirectory communityList) {
        initComponents();
        this.houseList = houseList;
        this.cityList = cityList;
        this.communityList = communityList;
        populateTable();
        populateCity();
        populateState();
        populateCountry();
        populateComm();
        btnClear.setVisible(false);
        btnSave.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tableHouse = new javax.swing.JTable();
        lblCountry = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunityId = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtHouseNo = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCity = new javax.swing.JComboBox<>();
        lblState = new javax.swing.JLabel();
        txtHouseId = new javax.swing.JTextField();
        lblHouseId = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtState = new javax.swing.JComboBox<>();
        txtCountry = new javax.swing.JComboBox<>();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("House Screen");

        tableHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "House Id", "House No/Name", "Community", "State", "Zip Code", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPane.setViewportView(tableHouse);

        lblCountry.setText("Country:");

        lblCity.setText("City:");

        lblCommunityId.setText("House No/Name:");

        lblZipCode.setText("Zip Code:");

        txtHouseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseNoActionPerformed(evt);
            }
        });

        txtZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipCodeKeyPressed(evt);
            }
        });

        lblCommunity.setText("Community:");

        txtCity.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtCityComponentShown(evt);
            }
        });
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblState.setText("State:");

        txtHouseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseIdActionPerformed(evt);
            }
        });
        txtHouseId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHouseIdKeyPressed(evt);
            }
        });

        lblHouseId.setText("House Id:");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

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
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCommunityId)
                                    .addComponent(lblHouseId))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHouseId, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCommunity)
                                    .addComponent(lblCity)
                                    .addComponent(lblState)
                                    .addComponent(lblZipCode)
                                    .addComponent(lblCountry))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearch)
                                .addGap(29, 29, 29)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(73, 73, 73)
                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityId)
                    .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        try {
            Integer hou = Integer.parseInt(txtHouseId.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this,"Please enter House Id");
            return;
        }
        Integer houseId = Integer.parseInt(txtHouseId.getText());
        if(houseList.uiqueHouseId(houseId) == false){
            JOptionPane.showMessageDialog(this, "House Id already exist");
            return;
        }
        String houseNo = txtHouseNo.getText();
        if (houseNo.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the House No/Name.");
            return;
        }
        String community = String.valueOf(txtCommunity.getSelectedItem());
        if (txtCommunity.getSelectedItem().equals("--Select--")){
            JOptionPane.showMessageDialog(this, "Please select the Community.");
            return;
        }
        //        String city = txtCity.getText();
        String city = String.valueOf(txtCity.getSelectedItem());
        if (txtCity.getSelectedItem().equals("--Select--")){
            JOptionPane.showMessageDialog(this, "Please select the City.");
            return;
        }
        String state = String.valueOf(txtState.getSelectedItem());
        if (txtCity.getSelectedItem().equals("--Select--")){
            JOptionPane.showMessageDialog(this, "Please select the State.");
            return;
        }
        String zipCode = txtZipCode.getText();
        if (zipCode.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the Zip Code.");
            return;
        }
        String country = String.valueOf(txtCountry.getSelectedItem());

        House newHouse = houseList.addHouse();

        newHouse.setHouseId(houseId);
        newHouse.setHouseNo(houseNo);
        newHouse.setCommunityName(community);
        newHouse.setCityName(city);
        newHouse.setState(state);
        newHouse.setZipCode(WIDTH);
        newHouse.setCountry(country);

        JOptionPane.showMessageDialog(this, "House Created Successfully");

        txtHouseId.setText("");
        txtHouseNo.setText("");
        txtCommunity.setSelectedIndex(0);
        txtCity.setSelectedIndex(0);
        txtState.setSelectedIndex(0);
        txtZipCode.setText("");
        txtCountry.setSelectedIndex(0);

        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        btnClear.setVisible(true);
        btnSave.setVisible(false);

        Integer selectedRowIndex = tableHouse.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableHouse.getModel();
            House selectedHouse = (House) model.getValueAt(selectedRowIndex,0);

            txtHouseId.setText(String.valueOf(selectedHouse.getHouseId()));
            txtHouseNo.setText(selectedHouse.getHouseNo());
            txtCommunity.setSelectedItem(selectedHouse.getCommunityName());
            txtCity.setSelectedItem(selectedHouse.getCityName());
            txtState.setSelectedItem(selectedHouse.getState());
            txtZipCode.setText(String.valueOf(selectedHouse.getZipCode()));
            txtCountry.setSelectedItem(selectedHouse.getCountry());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnSave.setVisible(true);
        Integer selectedRowIndex = tableHouse.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableHouse.getModel();
            House selectedHouse = (House) model.getValueAt(selectedRowIndex,0);

            txtHouseId.setText(String.valueOf(selectedHouse.getHouseId()));
            txtHouseNo.setText(selectedHouse.getHouseNo());
            txtCommunity.setSelectedItem(selectedHouse.getCommunityName());
            txtCity.setSelectedItem(selectedHouse.getCityName());
            txtState.setSelectedItem(selectedHouse.getState());
            txtZipCode.setText(String.valueOf(selectedHouse.getZipCode()));
            txtCountry.setSelectedItem(selectedHouse.getCountry());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnClear.setVisible(false);
        Integer selectedRowIndex = tableHouse.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableHouse.getModel();
            House selectedHouse = (House) model.getValueAt(selectedRowIndex,0);

            houseList.deleteHouse(selectedHouse);

            JOptionPane.showMessageDialog(this, "House deleted successfully.");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableHouse.getModel();
        model.setRowCount(0);
        
        for(House house : houseList.getHouseList()){
            
            Object[] row = new Object[6];
            row[0] = house; 
            row[1] = house.getHouseId();
            row[2] = house.getCommunityName();
            row[3] = house.getCityName();
            row[4] = house.getZipCode();
            row[5] = house.getCountry();
          
             
            model.addRow(row);
        }
    }
    
    public void populateCity(){
        String[] cityArr = cityList.cityArray();
        DefaultComboBoxModel c = new DefaultComboBoxModel(cityArr);
        txtCity.setModel(c);
    }
    
    public void populateState(){
        String[] stateArr = cityList.stateArray();
        DefaultComboBoxModel s = new DefaultComboBoxModel(stateArr);
        txtState.setModel(s);
    }
    
    public void populateCountry(){
        String[] countryArr = cityList.countryArray();
        DefaultComboBoxModel c = new DefaultComboBoxModel(countryArr);
        txtCountry.setModel(c);
    }
    
    public void populateComm(){
        String[] commArr = communityList.commArray();
        DefaultComboBoxModel c = new DefaultComboBoxModel(commArr);
        txtCommunity.setModel(c);
    }
    
    private void txtHouseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseNoActionPerformed

    private void txtCityComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtCityComponentShown
        // TODO add your handling code here:
        //         txtCity.setModel(new DefaultComboBoxModel<String>(cityList.cityArray()));
    }//GEN-LAST:event_txtCityComponentShown

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
        //        System.out.println(cityList.cityArray());

    }//GEN-LAST:event_txtCityActionPerformed

    private void txtHouseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtHouseId.setText("");
        txtHouseNo.setText("");
        txtCommunity.setSelectedIndex(0);
        txtCity.setSelectedIndex(0);
        txtState.setSelectedIndex(0);
        txtZipCode.setText("");
        txtCountry.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Integer selectedRowIndex = tableHouse.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) tableHouse.getModel();
            House selectedHouse = (House) model.getValueAt(selectedRowIndex,0);

            selectedHouse.setHouseId(Integer.parseInt(txtHouseId.getText()));
            selectedHouse.setHouseNo(txtHouseNo.getText());
            selectedHouse.setCommunityName(String.valueOf(txtCommunity.getSelectedItem()));
            selectedHouse.setCityName(String.valueOf(txtCity.getSelectedItem()));
            selectedHouse.setState(String.valueOf(txtState.getSelectedItem()));
            selectedHouse.setZipCode(Long.parseLong(txtZipCode.getText()));
            selectedHouse.setCountry(String.valueOf(txtCountry.getSelectedItem()));

            JOptionPane.showMessageDialog(this, "House details updated successfully.");

            populateTable();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String searchQuery = txtSearch.getText();
        Search(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtHouseIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHouseIdKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txtHouseId.setEditable(false);
        }
        else{
            txtHouseId.setEditable(true);
        }
    }//GEN-LAST:event_txtHouseIdKeyPressed

    private void txtZipCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipCodeKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txtZipCode.setEditable(false);
        }
        else{
            txtZipCode.setEditable(true);
        }
    }//GEN-LAST:event_txtZipCodeKeyPressed

    private void Search(String searchQuery){
        DefaultTableModel model = (DefaultTableModel) tableHouse.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        tableHouse.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchQuery));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblHouseId;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tableHouse;
    private javax.swing.JComboBox<String> txtCity;
    private javax.swing.JComboBox<String> txtCommunity;
    private javax.swing.JComboBox<String> txtCountry;
    private javax.swing.JTextField txtHouseId;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JComboBox<String> txtState;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}