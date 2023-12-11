/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author joshokeeffe
 */
public class ProjectGUI extends javax.swing.JFrame {

    /**
     * Creates new form ProjectGUI
     */
    public ProjectGUI() {
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

        coursesBtn = new javax.swing.JButton();
        projectLbl = new javax.swing.JLabel();
        voluntierTeacherBtn = new javax.swing.JButton();
        notificationBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        DonateBtm = new javax.swing.JButton();
        applicationBtn1 = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        mathGameBtn = new javax.swing.JButton();
        bgLbl = new javax.swing.JLabel();
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
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(null);

        coursesBtn.setBackground(new java.awt.Color(0, 204, 255));
        coursesBtn.setForeground(new java.awt.Color(255, 255, 255));
        coursesBtn.setText("Courses");
        coursesBtn.setMinimumSize(new java.awt.Dimension(600, 450));
        coursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(coursesBtn);
        coursesBtn.setBounds(520, 200, 95, 23);

        projectLbl.setBackground(new java.awt.Color(255, 255, 255));
        projectLbl.setFont(new java.awt.Font("DIN Condensed", 1, 36)); // NOI18N
        projectLbl.setText("Project");
        getContentPane().add(projectLbl);
        projectLbl.setBounds(10, 60, 160, 40);

        voluntierTeacherBtn.setBackground(new java.awt.Color(102, 0, 204));
        voluntierTeacherBtn.setForeground(new java.awt.Color(255, 255, 255));
        voluntierTeacherBtn.setText("Volunteer");
        voluntierTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voluntierTeacherBtnActionPerformed(evt);
            }
        });
        getContentPane().add(voluntierTeacherBtn);
        voluntierTeacherBtn.setBounds(520, 160, 95, 23);

        notificationBtn.setBackground(new java.awt.Color(255, 255, 51));
        notificationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/notification.png"))); // NOI18N
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });
        getContentPane().add(notificationBtn);
        notificationBtn.setBounds(590, 10, 31, 31);

        signupBtn.setBackground(new java.awt.Color(255, 153, 0));
        signupBtn.setText("Sign Up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        getContentPane().add(signupBtn);
        signupBtn.setBounds(500, 20, 76, 23);

        DonateBtm.setBackground(new java.awt.Color(51, 51, 255));
        DonateBtm.setForeground(new java.awt.Color(255, 255, 255));
        DonateBtm.setText("Donate");
        DonateBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonateBtmActionPerformed(evt);
            }
        });
        getContentPane().add(DonateBtm);
        DonateBtm.setBounds(520, 120, 95, 23);

        applicationBtn1.setBackground(new java.awt.Color(0, 153, 0));
        applicationBtn1.setForeground(new java.awt.Color(255, 255, 255));
        applicationBtn1.setText("Application");
        applicationBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(applicationBtn1);
        applicationBtn1.setBounds(520, 80, 95, 23);

        feedbackBtn.setBackground(new java.awt.Color(204, 255, 204));
        feedbackBtn.setText("Contact");
        feedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(feedbackBtn);
        feedbackBtn.setBounds(520, 240, 95, 23);

        loginBtn.setBackground(new java.awt.Color(255, 0, 0));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn);
        loginBtn.setBounds(420, 20, 72, 23);

        mathGameBtn.setBackground(new java.awt.Color(255, 204, 204));
        mathGameBtn.setText("Math Game");
        mathGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathGameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mathGameBtn);
        mathGameBtn.setBounds(520, 280, 98, 23);

        bgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/img.jpeg"))); // NOI18N
        getContentPane().add(bgLbl);
        bgLbl.setBounds(0, -10, 670, 340);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // HOME SCREEN BUTTONS SECTION - Josh
    // volunteer button - Dongyi
    private void voluntierTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voluntierTeacherBtnActionPerformed
        // create an instance of the Teacher GUI
        teacherGUI newTeacher = new teacherGUI();

        // make the sign up screen visible
        newTeacher.setVisible(true);

        // close the project gui screen
        this.dispose();
    }//GEN-LAST:event_voluntierTeacherBtnActionPerformed

    // notification button - Dongyi
    private void notificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtnActionPerformed
        // create  a new instance of the Courses GUI
        SubscribeGUI newSub = new SubscribeGUI();

        // make the new ui appear
        newSub.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_notificationBtnActionPerformed

    // sign up button - Josh
    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // create an instance of the Sign Up GUI
        SignupGUI newSignUp = new SignupGUI();

        // make the sign up screen visible
        newSignUp.setVisible(true);

        // close the project gui screen
        this.dispose();
    }//GEN-LAST:event_signupBtnActionPerformed

    // courses button - Josh
    private void coursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesBtnActionPerformed
        // create  a new instance of the Courses GUI
        CoursesGUI appGUI = new CoursesGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_coursesBtnActionPerformed

    // Donation Button - Dongyi
    private void DonateBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonateBtmActionPerformed
        // create  a new instance of the Dontation GUI
        DonationGUI newDonate = new DonationGUI();

        // make the new ui appear
        newDonate.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_DonateBtmActionPerformed

    // application button - Dongyi
    private void applicationBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationBtn1ActionPerformed
        // creates a new instance of the Application GUI
        ApplicationGUI newApp = new ApplicationGUI();

        // makes the new ui appear
        newApp.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_applicationBtn1ActionPerformed

    // feedback button - Ata
    private void feedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackBtnActionPerformed
        // creates a new instance of the feedback GUI
        feedbackGUI newFeedback = new feedbackGUI();

        // makes the new ui appear
        newFeedback.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_feedbackBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        // creates a new instance of the Sign Up GUI
        LoginGUI newLogin = new LoginGUI();

        // makes the new ui appear
        newLogin.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

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

    private void forumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forumActionPerformed
        // creates a new instance of the feedback GUI
        feedbackGUI newFeedback = new feedbackGUI();

        // makes the new ui appear
        newFeedback.setVisible(true);

        // close the Project GUI
        this.dispose();

    }//GEN-LAST:event_forumActionPerformed

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

    private void mathGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathGameBtnActionPerformed
        // creates a new instance of the Donation GUI
        mathGUI newMathGame = new mathGUI();

        // makes the new ui appear
        newMathGame.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_mathGameBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonateBtm;
    private javax.swing.JButton applicationBtn1;
    private javax.swing.JMenuItem applicationItem;
    private javax.swing.JLabel bgLbl;
    private javax.swing.JMenu contactT;
    private javax.swing.JButton coursesBtn;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JMenuItem forum;
    private javax.swing.JMenu homeF1;
    private javax.swing.JMenuItem homeItem1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JMenuItem loginItem;
    private javax.swing.JButton mathGameBtn;
    private javax.swing.JMenuItem mathItem;
    private javax.swing.JMenu mathT;
    private javax.swing.JMenuBar navBar1;
    private javax.swing.JButton notificationBtn;
    private javax.swing.JLabel projectLbl;
    private javax.swing.JMenu schoolF;
    private javax.swing.JButton signupBtn;
    private javax.swing.JMenuItem signupMenu;
    private javax.swing.JMenuItem volunteerItem;
    private javax.swing.JMenu volunteerT;
    private javax.swing.JButton voluntierTeacherBtn;
    // End of variables declaration//GEN-END:variables
}