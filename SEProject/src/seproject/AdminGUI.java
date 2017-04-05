/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seproject;

import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author reticent
 */
public class AdminGUI extends javax.swing.JFrame {

    //Private member variables
    StaffGUI gui;   //StaffGUI gui
    Database db;    //Database db
    
    /**
     * Creates new form AdminGUI
     */
    public AdminGUI() {
        initComponents();
    }
    
    public AdminGUI(StaffGUI gui, Database db) {
        this.gui = gui;
        this.db = db;
        this.gui.setVisible(false); //StaffGUI becomes Hidden
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAddUser = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddUser = new javax.swing.JTable();
        btnAddNewUsers = new javax.swing.JButton();
        btnNewRemoveUser = new javax.swing.JButton();
        btnSubmitNewUsers = new javax.swing.JButton();
        pnlAddClasses = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddNewCourses = new javax.swing.JTable();
        btnAddNewCourse = new javax.swing.JButton();
        btnRemoveNewCourse = new javax.swing.JButton();
        btnSubmitNewCourses = new javax.swing.JButton();
        pnlManageUsers = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrator GUI");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tblAddUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Position", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAddUser);

        btnAddNewUsers.setText("Add Users");
        btnAddNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewUsersActionPerformed(evt);
            }
        });

        btnNewRemoveUser.setText("Remove User");
        btnNewRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRemoveUserActionPerformed(evt);
            }
        });

        btnSubmitNewUsers.setText("Submit New User");
        btnSubmitNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitNewUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddUserLayout = new javax.swing.GroupLayout(pnlAddUser);
        pnlAddUser.setLayout(pnlAddUserLayout);
        pnlAddUserLayout.setHorizontalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewRemoveUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddNewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmitNewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddUserLayout.setVerticalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddUserLayout.createSequentialGroup()
                        .addComponent(btnAddNewUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewRemoveUser)
                        .addGap(54, 54, 54)
                        .addComponent(btnSubmitNewUsers)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Users", pnlAddUser);

        tblAddNewCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Room No", "Time", "Day", "Staff ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAddNewCourses);

        btnAddNewCourse.setText("Add Course");
        btnAddNewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewCourseActionPerformed(evt);
            }
        });

        btnRemoveNewCourse.setText("Remove Course");
        btnRemoveNewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNewCourseActionPerformed(evt);
            }
        });

        btnSubmitNewCourses.setText("Submit New Courses");
        btnSubmitNewCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitNewCoursesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddClassesLayout = new javax.swing.GroupLayout(pnlAddClasses);
        pnlAddClasses.setLayout(pnlAddClassesLayout);
        pnlAddClassesLayout.setHorizontalGroup(
            pnlAddClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddClassesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAddClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddNewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveNewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmitNewCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddClassesLayout.setVerticalGroup(
            pnlAddClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddClassesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddClassesLayout.createSequentialGroup()
                        .addComponent(btnAddNewCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveNewCourse)
                        .addGap(53, 53, 53)
                        .addComponent(btnSubmitNewCourses)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Courses", pnlAddClasses);

        javax.swing.GroupLayout pnlManageUsersLayout = new javax.swing.GroupLayout(pnlManageUsers);
        pnlManageUsers.setLayout(pnlManageUsersLayout);
        pnlManageUsersLayout.setHorizontalGroup(
            pnlManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        pnlManageUsersLayout.setVerticalGroup(
            pnlManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Manage Users", pnlManageUsers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Manage Courses", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * btnAddNewUsers Action Performed
     * ---------------------------------------------------
     * Adds Users from JList according to how the information was filled.
     * Adding to the field of Position and Department indicates new user is
     * a staff. Else, it indicates that user is a Student is both are empty.
     * @param evt 
     */
    private void btnAddNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewUsersActionPerformed
        //Instanced Variables
        String firstName;
        String lastName;
        int sizeOfTable = tblAddUser.getRowCount();
        
        if (sizeOfTable == 0)
        {
            DefaultTableModel model = (DefaultTableModel)tblAddUser.getModel();
            model.addRow(new Object[]{null,null,null,null} );
            
        }
        else 
        {
            firstName = (String)tblAddUser.getValueAt(sizeOfTable-1, 0);
            lastName = (String)tblAddUser.getValueAt(sizeOfTable-1, 1);
            
            if ( !(firstName == null || lastName == null))
            {
                if (!(firstName.equals("") || lastName.equals("")))
                {
                    DefaultTableModel model = (DefaultTableModel)tblAddUser.getModel();
                    model.addRow(new Object[]{null,null,null,null} );
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "First and/or Last Name are empty","Failed Adding New Row!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "First and/or Last Name are null","Failed Adding New Row!!",
                                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnAddNewUsersActionPerformed

    /**
     * formWindowClosed
     * ----------------------------
     * Sets StaffGUI to visible.
     * @param evt 
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        gui.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * btnRemoveNewUser Action Performed
     * ---------------------------------------------
     * Removes selected new user from the table.
     * @param evt 
     */
    private void btnNewRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRemoveUserActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)tblAddUser.getModel();
        int selectedRow = tblAddUser.getSelectedRow();
        
        if(selectedRow != -1) 
        {
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnNewRemoveUserActionPerformed

    /**
     * btnSubmitNewUser Action Performed
     * ---------------------------------------------
     * Submits User with appropriate fields to User Table and follow by either
     * Student Table or SchoolStaff Table (depending on Position and Department field).
     * @param evt 
     */
    private void btnSubmitNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitNewUsersActionPerformed
        //Instanced Variables
        String firstName;   //First Name of New User
        String lastName;    //Last Name of New User
        String position;    //Position of New User (If applicable)
        String department;  //Department User Works (If applicable)
        int sizeOfTable = tblAddUser.getRowCount(); //Size of the table
        int dialogButton = JOptionPane.YES_NO_OPTION;   //Confirmation pop to proceed
        int result = JOptionPane.showConfirmDialog 
               (null, "Are you sure you want to submit?","Warning",dialogButton);
        Object [] o;    //Stores the content of the User (School Staff = 4 items / Student = 2 items)
        boolean b;  //Return true if create user was successful, else false
                        
        if(result == JOptionPane.YES_OPTION)
        {
            for (int x = 0; x < sizeOfTable; x++)
            {
                firstName = (String)tblAddUser.getValueAt(x, 0);
                lastName = (String)tblAddUser.getValueAt(x, 1);

                if (!(firstName == null || lastName == null))   //If both firstName and lastName are not null
                {
                    if (firstName.equals("") || lastName.equals("")) //If either firstName or lastName is blank "" (Error with row)
                    {
                        JOptionPane.showMessageDialog(null, "First Name: " + firstName + "\nLast Name: " + lastName ,"Error Adding User (Blank Name)",
                                        JOptionPane.ERROR_MESSAGE);
                    }
                    else //firstName and lastName are not blank
                    {
                        position = (String)tblAddUser.getValueAt(x, 2);
                        department = (String)tblAddUser.getValueAt(x, 3);
                        
                        if (!(position == null || department == null)) //Position and Department != null
                        {
                            if (position.equals("") && department.equals("")) //Adds New Student User to database (Login & Student)
                            {
                                int i = 2;
                                o = new Object[i];
                                o[0] = firstName;
                                o[1] = lastName;
                                try
                                {
                                    b = db.createUser(i, o);
                                    
                                    if (b)
                                    {
                                        System.out.println("Create Student User Successful("+ x +"): " + lastName + ", "+ firstName);
                                    }
                                    else
                                    {
                                        System.out.println("Create Student User Rejected("+ x +"): " + lastName + ", "+ firstName);
                                    }
                                }
                                catch(Exception e)
                                {
                                    System.out.println("Error adding New Student User (AdminGUI): " + e);
                                }
                            }
                            else if (position.equals("") || department.equals("")) //Position and Department contains blank String "" (Error with row)
                            {
                                JOptionPane.showMessageDialog(null, "First Name: " + firstName + "\nLast Name: " + lastName 
                                                                    + "\nDPosition: " + position + "\nDepartment: " + department
                                                                    ,"Error Adding Staff User", JOptionPane.ERROR_MESSAGE);
                            }
                            else //Add new Staff to database (Login & SchoolStaff)
                            {
                                int i = 4;
                                o = new Object[i];
                                o[0] = firstName;
                                o[1] = lastName;
                                o[2] = position;
                                o[3] =  department;
                                
                                try
                                {
                                    b = db.createUser(i, o);
                                    
                                    if (b)
                                    {
                                        System.out.println("Create Staff User Successful("+ x +"): " + lastName + ", "+ firstName);
                                    }
                                    else
                                    {
                                        System.out.println("Create Staff User Unsuccessful("+ x +"): " + lastName + ", "+ firstName);
                                    }
                                }
                                catch(Exception e)
                                {
                                    System.out.println("Error adding New User Staff(AdminGUI): " + e);
                                }
                            }
                        }
                        else //Adds New Student User to database (Login & Student)
                        {
                            int i = 2;
                            o = new Object[i];
                            o[0] = firstName;
                            o[1] = lastName;
                            
                            try
                            {
                                b = db.createUser(i, o);
                                
                                if (b)
                                {
                                    System.out.println("Create Student User Successful("+ x +"): " + lastName + ", "+ firstName);
                                }
                                else
                                {
                                    System.out.println("Create Student User Unsuccessful("+ x +"): " + lastName + ", "+ firstName);
                                }
                            }
                            catch(Exception e)
                            {
                                System.out.println("Error adding New Student User (AdminGUI): " + e);
                            }
                        }
                    }
                }
                else //else, firstName or lastName are null (Error with row)
                {
                    JOptionPane.showMessageDialog(null, "First Name: " + firstName + "\nLast Name: " + lastName ,
                                                        "Error Adding User(1 First/Last Name is Null)", JOptionPane.ERROR_MESSAGE);
                    
                }
                
                if (x == sizeOfTable-1)
                {
                    DefaultTableModel model = (DefaultTableModel)tblAddUser.getModel();
                    model.setRowCount(0);
                }
            }
            
        }
    }//GEN-LAST:event_btnSubmitNewUsersActionPerformed

    /**
     * btnAddNewCourse Action Performed
     * --------------------------------------------------------
     * Adds New Row to tblAddNewCourses.
     * @param evt 
     */
    private void btnAddNewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewCourseActionPerformed
       //Instanced Variables
        String courseID;    //Holds CourseID (ex. CS3304)
        String roomNo;  //Holds Class Room No.
        String time;    //Holds Class Time in String (temp)
        String day; //Holds Days (ex. MW = Monday & Wednesday)
        int id; //Holds selected staffID
        ArrayList<Integer> staffID = db.getAllProfessorID();    //Holds Staff teaching course/class
        int sizeOfTable = tblAddNewCourses.getRowCount();   //Holds current size of table (based on rows)
        JComboBox staffIDList = new JComboBox();    //Stores JComboBox of Teacher ID
        //JComboBox daysList = new JComboBox();   //Stores JComboBox of Class Days
        
        //Fill JCombo Box with Staff ID
        for (int x = 0; x < staffID.size(); x++)
        {
            staffIDList.addItem(staffID.get(x));
        }
        
        if (sizeOfTable == 0)
        {
            DefaultTableModel model = (DefaultTableModel)tblAddNewCourses.getModel();
            model.addRow(new Object[]{null,null,null,null,null} );
            
            TableColumn staffIDColumn = tblAddNewCourses.getColumnModel().getColumn(4);
            staffIDColumn.setCellEditor(new DefaultCellEditor(staffIDList));
        }
        else 
        {    
            courseID = (String)tblAddNewCourses.getValueAt(sizeOfTable-1, 0);
            roomNo = (String)tblAddNewCourses.getValueAt(sizeOfTable-1, 1);
            time = (String)tblAddNewCourses.getValueAt(sizeOfTable-1, 2);
            day = (String)tblAddNewCourses.getValueAt(sizeOfTable-1, 3);
            Object o = (Object)tblAddNewCourses.getValueAt(sizeOfTable-1, 4);
            
            if ( !(courseID == null || roomNo == null || time == null || day == null || o == null ))
            {
                id = (int)o;
                
                if (!(courseID.equals("") || roomNo.equals("") ||time.equals("") || day.equals("")))
                {
                    DefaultTableModel model = (DefaultTableModel)tblAddNewCourses.getModel();
                    model.addRow(new Object[]{null,null,null,null,null} );
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Testing 1","Failed Adding New Row!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Testing 2","Failed Adding New Row!!",
                                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddNewCourseActionPerformed

    /**
     * btnRemoveNewCourse Action Performed
     * ---------------------------------------------------
     * Removes selected new courses from the table.
     * @param evt 
     */
    private void btnRemoveNewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNewCourseActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblAddNewCourses.getModel();
        int selectedRow = tblAddNewCourses.getSelectedRow();
        
        if(selectedRow != -1) 
        {
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnRemoveNewCourseActionPerformed

    /**
     * btnSubmitNewCourses
     * ---------------------------------------------
     * Submits Courses with appropriate fields to Classes Table.
     * @param evt 
     */
    private void btnSubmitNewCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitNewCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitNewCoursesActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewCourse;
    private javax.swing.JButton btnAddNewUsers;
    private javax.swing.JButton btnNewRemoveUser;
    private javax.swing.JButton btnRemoveNewCourse;
    private javax.swing.JButton btnSubmitNewCourses;
    private javax.swing.JButton btnSubmitNewUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlAddClasses;
    private javax.swing.JPanel pnlAddUser;
    private javax.swing.JPanel pnlManageUsers;
    private javax.swing.JTable tblAddNewCourses;
    private javax.swing.JTable tblAddUser;
    // End of variables declaration//GEN-END:variables
}
