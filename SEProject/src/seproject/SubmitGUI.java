package seproject;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SubmitGUI extends javax.swing.JDialog {

    //Private Member Variables
    private StaffGUI gui;   //Holds StaffGUI
    private User student;
    private int docNo;
    private Database db;    //Database db
    private int sectionNo;  //Courses SectionNo
    private File upload;    //File being uploaded
    private File dir;   //Directory of Folder
    
    /** Creates new form SubmitGUI */
    public SubmitGUI(java.awt.Frame parent, boolean modal, User student, int docNo, int sectionNo, Database db, String assignmentName) {
        super(parent, modal);
        initComponents();
        this.sectionNo = sectionNo;
        this.student = student;
        this.docNo = docNo;
        this.db = db;
        txtAssignmentName.setText(assignmentName);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        btnBrowseFile = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAssignmentName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("File Name:");

        txtFileName.setEditable(false);

        btnBrowseFile.setText("...");
        btnBrowseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseFileActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setText("Assignment:");

        txtAssignmentName.setEditable(false);
        txtAssignmentName.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFileName)
                            .addComponent(txtAssignmentName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAssignmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseFileActionPerformed
        JFileChooser fc = new JFileChooser();

        try
        {
            int x = fc.showOpenDialog(null);

            if (x == JFileChooser.APPROVE_OPTION)
            {
                upload = fc.getSelectedFile();
                txtFileName.setText(upload.getName());
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnBrowseFileActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try
        {
            System.out.println(docNo);
            if(db.uploadAssignment(upload.toPath(),
                new File("../CourseAssignment/"+sectionNo+"/"+student.getId()+"_"+txtFileName.getText()).toPath(),
                sectionNo, student.getId() ,docNo, upload.getName()))
            {
                JOptionPane.showMessageDialog(null, "Upload was successful.","Upload Successful",
                    JOptionPane.DEFAULT_OPTION);
                this.dispose();
            }
            else
            {
                throw new Exception("Error Uploading File");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseFile;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAssignmentName;
    private javax.swing.JTextField txtFileName;
    // End of variables declaration//GEN-END:variables

}
