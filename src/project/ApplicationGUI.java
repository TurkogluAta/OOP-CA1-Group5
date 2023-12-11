/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;
import project.CoursesGUI;
import project.LoginGUI;
import project.ProjectGUI;
import project.SignupGUI;
import project.feedbackGUI;
import project.mathGUI;
import project.teacherGUI;
/**
 *
 * @author dongyiyoo
 */
public class ApplicationGUI extends javax.swing.JFrame {

    /**
     * Creates new form ApplicationGUI
     */
    public ApplicationGUI() {
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

        STCb = new javax.swing.JComboBox<>();
        AppLbl = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
        AffiliationLbl = new javax.swing.JLabel();
        Nametf = new javax.swing.JTextField();
        NaxtBtn = new javax.swing.JButton();
        AppInfoLbl = new javax.swing.JLabel();
        POLbl = new javax.swing.JLabel();
        STLbl = new javax.swing.JLabel();
        AffiliationCb1 = new javax.swing.JComboBox<>();
        GoalLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GoalTf = new javax.swing.JTextArea();
        DetailLbl = new javax.swing.JLabel();
        SNLbl = new javax.swing.JLabel();
        EsstudentLbl = new javax.swing.JLabel();
        EsteacherLbl = new javax.swing.JLabel();
        SNTf = new javax.swing.JTextField();
        EsStudentCb = new javax.swing.JComboBox<>();
        EsTeacherCb = new javax.swing.JComboBox<>();
        AFNameTf = new javax.swing.JTextField();
        ANLbl = new javax.swing.JLabel();
        navBar1 = new javax.swing.JMenuBar();
        homeF1 = new javax.swing.JMenu();
        homeItem1 = new javax.swing.JMenuItem();
        coursesF = new javax.swing.JMenu();
        coursesItem = new javax.swing.JMenuItem();
        signupMenu = new javax.swing.JMenuItem();
        loginItem = new javax.swing.JMenuItem();
        schoolF = new javax.swing.JMenu();
        applicationItem = new javax.swing.JMenuItem();
        donationItem = new javax.swing.JMenuItem();
        contactT = new javax.swing.JMenu();
        forum = new javax.swing.JMenuItem();
        volunteerT = new javax.swing.JMenu();
        volunteerItem = new javax.swing.JMenuItem();
        mathT = new javax.swing.JMenu();
        mathItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        STCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elementary", "Secondary", "Other" }));
        STCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STCbActionPerformed(evt);
            }
        });

        AppLbl.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        AppLbl.setText("Application");

        NameLbl.setText("Name");

        AffiliationLbl.setText("Affiliation");

        NaxtBtn.setText("Next");
        NaxtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaxtBtnActionPerformed(evt);
            }
        });

        AppInfoLbl.setText("**Applicant Information**");

        POLbl.setText("**Project Overview**");

        STLbl.setText("School Type");

        AffiliationCb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organization", "Group", "Individual" }));
        AffiliationCb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AffiliationCb1ActionPerformed(evt);
            }
        });

        GoalLbl.setText("Project goals and reasons:");

        GoalTf.setColumns(20);
        GoalTf.setRows(5);
        jScrollPane1.setViewportView(GoalTf);

        DetailLbl.setText("**School Details:**");

        SNLbl.setText("School Name");

        EsstudentLbl.setText("Estimated number of students");

        EsteacherLbl.setText("Estimated number of teachers");

        EsStudentCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1~25", "26~50", "50~100", "100~150", "Over 150" }));

        EsTeacherCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5~10", "11~20", "21~30", "31~40", "Over 40" }));

        ANLbl.setText("Name");

        navBar1.setBackground(new java.awt.Color(204, 204, 255));

        homeF1.setText("Home");

        homeItem1.setText("Home");
        homeItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeItem1ActionPerformed(evt);
            }
        });
        homeF1.add(homeItem1);

        navBar1.add(homeF1);

        coursesF.setText("Courses");

        coursesItem.setText("Courses");
        coursesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesItemActionPerformed(evt);
            }
        });
        coursesF.add(coursesItem);

        signupMenu.setText("Sign Up");
        signupMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupMenuActionPerformed(evt);
            }
        });
        coursesF.add(signupMenu);

        loginItem.setText("Log In");
        loginItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginItemActionPerformed(evt);
            }
        });
        coursesF.add(loginItem);

        navBar1.add(coursesF);

        schoolF.setText("School");

        applicationItem.setText("Application");
        applicationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationItemActionPerformed(evt);
            }
        });
        schoolF.add(applicationItem);

        donationItem.setText("Donation");
        donationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationItemActionPerformed(evt);
            }
        });
        schoolF.add(donationItem);

        navBar1.add(schoolF);

        contactT.setText("Contact");

        forum.setText("Forum");
        forum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forumActionPerformed(evt);
            }
        });
        contactT.add(forum);

        navBar1.add(contactT);

        volunteerT.setText("Volunteer");

        volunteerItem.setText("Volunteer Teacher");
        volunteerItem.setToolTipText("");
        volunteerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volunteerItemActionPerformed(evt);
            }
        });
        volunteerT.add(volunteerItem);

        navBar1.add(volunteerT);

        mathT.setText("Math Game");

        mathItem.setText("Math Game");
        mathItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathItemActionPerformed(evt);
            }
        });
        mathT.add(mathItem);

        navBar1.add(mathT);

        setJMenuBar(navBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AppLbl)
                        .addGap(196, 196, 196))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(SNLbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SNTf, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(GoalLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DetailLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(EsteacherLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(EsstudentLbl, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(EsStudentCb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(EsTeacherCb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(POLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(STLbl)
                                                .addGap(70, 70, 70)
                                                .addComponent(STCb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(61, 61, 61))
                                .addComponent(NaxtBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(AppInfoLbl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(ANLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AFNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NameLbl)
                                        .addComponent(AffiliationLbl))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(AffiliationCb1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(AppLbl)
                .addGap(27, 27, 27)
                .addComponent(AppInfoLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLbl)
                    .addComponent(Nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AffiliationLbl)
                    .addComponent(AffiliationCb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ANLbl)
                    .addComponent(AFNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(POLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(STLbl)
                    .addComponent(STCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(GoalLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DetailLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SNLbl)
                    .addComponent(SNTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EsstudentLbl)
                    .addComponent(EsStudentCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EsteacherLbl)
                    .addComponent(EsTeacherCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(NaxtBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STCbActionPerformed

    private void AffiliationCb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AffiliationCb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AffiliationCb1ActionPerformed

    private void NaxtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaxtBtnActionPerformed
        // Check if everything is filled out
    if (AFNameTf.getText().isEmpty() || SNTf.getText().isEmpty()|| Nametf.getText().isEmpty()|| GoalTf.getText().isEmpty()|| AffiliationCb1.getSelectedItem() == null|| EsStudentCb.getSelectedItem() == null|| EsTeacherCb.getSelectedItem() == null|| STCb.getSelectedItem() == null) {
        // Show an error message 
        JOptionPane.showMessageDialog(null, "Please fill out all the fields");
        return;
    }

        
        Application2GUI newApplication2 = new Application2GUI();
        
        // make the new ui appear
        newApplication2.setVisible(true);
        
         // close the Project GUI
        this.dispose();
    
    }//GEN-LAST:event_NaxtBtnActionPerformed

    private void homeItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeItem1ActionPerformed
        // TODO add your handling code here:
        ProjectGUI appGUI = new ProjectGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_homeItem1ActionPerformed

    private void coursesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesItemActionPerformed
        // TODO add your handling code here:
        CoursesGUI appGUI = new CoursesGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_coursesItemActionPerformed

    private void signupMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupMenuActionPerformed
        // creates a new instance of the Sign Up GUI
        SignupGUI newSignupGUI = new SignupGUI();

        // makes the new ui appear
        newSignupGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_signupMenuActionPerformed

    private void loginItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginItemActionPerformed

        // creates a new instance of the Sign Up GUI
        LoginGUI newLogin = new LoginGUI();

        // makes the new ui appear
        newLogin.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_loginItemActionPerformed

    private void applicationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationItemActionPerformed
        // creates a new instance of the Application GUI
        ApplicationGUI newApp = new ApplicationGUI();

        // makes the new ui appear
        newApp.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_applicationItemActionPerformed

    private void donationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationItemActionPerformed
        // creates a new instance of the Donation GUI
        DonationGUI newDonation = new DonationGUI();

        // makes the new ui appear
        newDonation.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_donationItemActionPerformed

    private void forumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forumActionPerformed
        // creates a new instance of the feedback GUI
        feedbackGUI newFeedback = new feedbackGUI();

        // makes the new ui appear
        newFeedback.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_forumActionPerformed

    private void volunteerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volunteerItemActionPerformed
        // creates a new instance of the Sign Up GUI
        teacherGUI newTeacher = new teacherGUI();

        // makes the new ui appear
        newTeacher.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_volunteerItemActionPerformed

    private void mathItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathItemActionPerformed
        // creates a new instance of the Sign Up GUI
        mathGUI newMath = new mathGUI();

        // makes the new ui appear
        newMath.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_mathItemActionPerformed

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
            java.util.logging.Logger.getLogger(ApplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AFNameTf;
    private javax.swing.JLabel ANLbl;
    private javax.swing.JComboBox<String> AffiliationCb1;
    private javax.swing.JLabel AffiliationLbl;
    private javax.swing.JLabel AppInfoLbl;
    private javax.swing.JLabel AppLbl;
    private javax.swing.JLabel DetailLbl;
    private javax.swing.JComboBox<String> EsStudentCb;
    private javax.swing.JComboBox<String> EsTeacherCb;
    private javax.swing.JLabel EsstudentLbl;
    private javax.swing.JLabel EsteacherLbl;
    private javax.swing.JLabel GoalLbl;
    private javax.swing.JTextArea GoalTf;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField Nametf;
    private javax.swing.JButton NaxtBtn;
    private javax.swing.JLabel POLbl;
    private javax.swing.JLabel SNLbl;
    private javax.swing.JTextField SNTf;
    private javax.swing.JComboBox<String> STCb;
    private javax.swing.JLabel STLbl;
    private javax.swing.JMenuItem applicationItem;
    private javax.swing.JMenu contactT;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JMenuItem forum;
    private javax.swing.JMenu homeF1;
    private javax.swing.JMenuItem homeItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem loginItem;
    private javax.swing.JMenuItem mathItem;
    private javax.swing.JMenu mathT;
    private javax.swing.JMenuBar navBar1;
    private javax.swing.JMenu schoolF;
    private javax.swing.JMenuItem signupMenu;
    private javax.swing.JMenuItem volunteerItem;
    private javax.swing.JMenu volunteerT;
    // End of variables declaration//GEN-END:variables
}