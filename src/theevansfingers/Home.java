/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theevansfingers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import logic.HoldVariables;
import logic.Identity;
import logic.Students;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.swing.JRootPane;


/**
 *
 * @author Paulous
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home2
     */
       int counter = 10;
       Boolean isIt = false;
    public Home() {
        initComponents();
        courseCode.setVisible(false);
        lecturer.setVisible(false);
        classStarted.setVisible(false);
        checkTheReturn();
        lateComer();
//        Toolkit toolkit = getToolkit();
//        Dimension size = toolkit.getScreenSize();
//        setLocation(size.width/2 - getWidth()/2, 
//        size.height/2 - getHeight()/2);
        setSize(900,500);
    setLocation(250,150);
    setResizable(false);
   setTitle("Evans Fingering");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        courseCode = new javax.swing.JLabel();
        lecturer = new javax.swing.JLabel();
        classStarted = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Screen");
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Register"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        courseCode.setText("Course Code:");
        getContentPane().add(courseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        lecturer.setText("Lecturer:");
        getContentPane().add(lecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        classStarted.setText("Class Started At");
        getContentPane().add(classStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        timeRemaining.setText("0:0");
        getContentPane().add(timeRemaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jButton1.setText("Start A Class");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, 50));

        jButton2.setText("Add Student");
        jButton2.setPreferredSize(new java.awt.Dimension(120, 70));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, -1));

        jButton3.setText("Add Finger");
        jButton3.setPreferredSize(new java.awt.Dimension(120, 70));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 150, -1));

        jButton4.setText("Add Courses");
        jButton4.setPreferredSize(new java.awt.Dimension(120, 70));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jButton5.setText("Register Courses");
        jButton5.setPreferredSize(new java.awt.Dimension(120, 70));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 150, -1));

        jButton6.setText("Reports");
        jButton6.setPreferredSize(new java.awt.Dimension(120, 70));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        jButton7.setText("Add Lecturer");
        jButton7.setPreferredSize(new java.awt.Dimension(120, 70));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIOMETRIC CLASS ATTENDANCE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
                .addContainerGap(852, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 910, 40));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel6.setText("BIOMETRIC CLASS ATTENDANCE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 420, 50));

        jLabel2.setText("Time Remaining:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/1A.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(900, 500));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 500));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        
        StartClass course = new StartClass();
        course.setVisible(rootPaneCheckingEnabled);
        this.dispose();
        
  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         AddStudent addStudent = new AddStudent();
        addStudent.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
 public void checkTheReturn(){
        if(HoldVariables.courseCode != null ){
              courseCode.setText("Course Code: "+HoldVariables.courseCode);
              courseCode.setVisible(true);
              
              lecturer.setVisible(true);
              lecturer.setText("Lecturer: "+ HoldVariables.courseLecturer);
              
              Timer timer = new Timer(); //new timer
              counter = 40; //setting the counter to 10 sec
                TimerTask task = new TimerTask() {         
                    public void run() {                
                        timeRemaining.setText(Integer.toString(counter)); //the timer lable to counter.
                        counter --;
                        if (counter == -1){
                            timer.cancel();                                       
                        } else if(isIt){
                            timer.cancel();
                            isIt = false;
                        }
                    }
                };
                timer.scheduleAtFixedRate(task, 1000, 1000); // =  timer.scheduleAtFixedRate(task, delay, period);
                HoldVariables.countDownTime = counter;
                
                
                runTheInternalScreen();
  
             
        }
    }
 
     private void lateComer() {
         if(HoldVariables.lateComers != null){
             System.out.print("Is this called");
             openVerify();
         }
    }
 
    private void runTheInternalScreen(){
        Runnable runnable = () -> {};
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

                
                final ScheduledFuture updateLog =  service.scheduleAtFixedRate(runnable, 5, 5, TimeUnit.SECONDS);
            service.schedule(new Runnable() {
                @Override
                public void run() {
                   openVerify();
                    System.out.println("Close the window in "+HoldVariables.countDownTime);
                    
                    service.shutdown();
                    System.out.println(service.isShutdown());
                    lateComer();
                }
            }, 2, TimeUnit.SECONDS);
    }
    
    private void openVerify(){
         try {
                VerificationForm form = new VerificationForm(this, (Students s, Identity id) -> {
                //                System.err.println(s.regNumber);
    
                //                verifiedIcon.setIcon(new ImageIcon(getClass()
                //                        .getResource("/res/biometrics_passed.png")));
                ////                if (id.picture != null) photo.setIcon(resize(id.picture));
                //                status.setText("VERIFIED");
                });
                    form.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
    //            verifiedIcon.setIcon(new ImageIcon(getClass()
    //                    .getResource("/res/biometrics_failed.png")));
            }
    }
 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InsertFinger ins = new InsertFinger();
        ins.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AddLecturer addLec = new AddLecturer();
        addLec.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        HoldVariables.sourceOfRequest = "registerCourses";
        SearchStudent ser = new SearchStudent();
//        this.add(ser);
        ser.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AddCourses addCourse = new AddCourses();
        addCourse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Reports reports = new Reports();
        reports.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classStarted;
    private javax.swing.JLabel courseCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lecturer;
    private final javax.swing.JLabel timeRemaining = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables


}
