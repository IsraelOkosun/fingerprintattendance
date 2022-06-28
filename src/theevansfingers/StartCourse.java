/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theevansfingers;

import database.Database;
import java.util.HashMap;
import java.util.List;
import logic.Courses;
import logic.HoldVariables;

/**
 *
 * @author Paulous
 */
public class StartCourse extends javax.swing.JPanel {
      private HashMap<String, String> hash;

    /**
     * Creates new form StartCourse
     */
    public StartCourse() {
        initComponents();
        setSize(900,500);
    setLocation(250,150);
    setResizable(false);
        
    }
    
    private void loadCombo(){
        Database db = new Database();
        List<Courses> courses = db.getAllCourses();
           hash = new HashMap<>();
        
        for(int i=0; i<courses.size();i++){
            String courseName = courses.get(i).getCourseName();
            String courseCodes = courses.get(i).getCourseCode();
            
            courseCode.addItem(courseCodes);
            hash.put(courseCodes, courseName);
            System.out.print(courseName + " Nothing");
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

        courseCode = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        courseLecturer = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setName("Start a Course"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        courseCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ICT 401", "ICT 487", "ICT 345" }));
        courseCode.setPreferredSize(new java.awt.Dimension(160, 70));
        add(courseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIOMETRIC CLASS ATTENDANCE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 39));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/close.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(842, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(137, 137, 137)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Course Code:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 90, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Course Lecturer");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, 100));

        courseLecturer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        courseLecturer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr. Simfukwe", "Dr. Chembe", "Dr. Zimba" }));
        courseLecturer.setPreferredSize(new java.awt.Dimension(160, 70));
        courseLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseLecturerActionPerformed(evt);
            }
        });
        add(courseLecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Start Course");
        jButton1.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/1A.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(900, 500));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 500));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 500));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HoldVariables.courseCode = courseCode.getSelectedItem().toString();
        HoldVariables.courseLecturer = courseLecturer.getSelectedItem().toString();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void courseLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseLecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseLecturerActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox courseCode;
    private javax.swing.JComboBox courseLecturer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void setResizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}