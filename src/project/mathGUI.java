/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ataturkoglu
 */
public class mathGUI extends javax.swing.JFrame {

    /**
     * Creates new form mathGUI
     */
    math myGame = new math();

    public mathGUI() {
        initComponents();

        // Show the default level button selected when the page is opened
        level1Btn.setSelected(true);
        submitBtn.setEnabled(false);
        answerTf.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mathBtnGroup = new javax.swing.ButtonGroup();
        mathLb = new javax.swing.JLabel();
        level1Btn = new javax.swing.JRadioButton();
        level2Btn = new javax.swing.JRadioButton();
        level3Btn = new javax.swing.JRadioButton();
        nameLb = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        scorePane = new javax.swing.JScrollPane();
        scoreTa = new javax.swing.JTextArea();
        top10Lb = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        answerTf = new javax.swing.JTextField();
        startBtn = new javax.swing.JButton();
        warningLb = new javax.swing.JLabel();
        scoreTf = new javax.swing.JLabel();
        questionTf = new javax.swing.JLabel();
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

        mathLb.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mathLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mathLb.setText("Math Game");

        mathBtnGroup.add(level1Btn);
        level1Btn.setText("Level 1");
        level1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1BtnActionPerformed(evt);
            }
        });

        mathBtnGroup.add(level2Btn);
        level2Btn.setText("Level 2");
        level2Btn.setToolTipText("");
        level2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2BtnActionPerformed(evt);
            }
        });

        mathBtnGroup.add(level3Btn);
        level3Btn.setText("Level 3");
        level3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3BtnActionPerformed(evt);
            }
        });

        nameLb.setText("Name:");

        scoreTa.setEditable(false);
        scoreTa.setColumns(20);
        scoreTa.setLineWrap(true);
        scoreTa.setRows(5);
        scoreTa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scorePane.setViewportView(scoreTa);

        top10Lb.setText("Top 10 Scores");

        submitBtn.setText("submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        warningLb.setText("• If you want the play with different level start the game again.");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mathLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameLb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(scoreTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(questionTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(answerTf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(scorePane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(level1Btn)
                                .addGap(18, 18, 18)
                                .addComponent(level2Btn)
                                .addGap(18, 18, 18)
                                .addComponent(level3Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(top10Lb)
                                .addGap(13, 13, 13)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(mathLb)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(level1Btn)
                    .addComponent(level2Btn)
                    .addComponent(level3Btn)
                    .addComponent(top10Lb))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLb)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startBtn))
                        .addGap(36, 36, 36)
                        .addComponent(scoreTf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answerTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scorePane)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(warningLb)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void level1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1BtnActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_level1BtnActionPerformed

    private void level2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level2BtnActionPerformed

    private void level3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3BtnActionPerformed
        // TODO add your handling code here:*
    }//GEN-LAST:event_level3BtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:
        if (nameTf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the name field.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            scoreTf.setText(" ");
            if (level1Btn.isSelected()) {
                myGame.setLevel(1);
            } else if (level2Btn.isSelected()) {
                myGame.setLevel(2);
            } else if (level3Btn.isSelected()) {
                myGame.setLevel(3);
            }
            myGame.setPlayerName(nameTf.getText().toLowerCase());
            myGame.questionGenerate();
            questionTf.setText(myGame.getQuestion());
            nameTf.setText(" ");
            level1Btn.setEnabled(false);
            level2Btn.setEnabled(false);
            level3Btn.setEnabled(false);
            startBtn.setEnabled(false);
            nameTf.setEnabled(false);
            submitBtn.setEnabled(true);
            answerTf.setEnabled(true);

        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:

        try {
            // if answer correct
            if (myGame.check(Integer.parseInt(answerTf.getText()))) {
                questionTf.setText(myGame.getQuestion());
                answerTf.setText("");
                scoreTf.setText("Your score is: " + myGame.getCurrentScore());
            } // if answer was wrong
            else {
                questionTf.setText(" ");
                level1Btn.setEnabled(true);
                level2Btn.setEnabled(true);
                level3Btn.setEnabled(true);
                startBtn.setEnabled(true);
                nameTf.setEnabled(true);
                answerTf.setText("");

                // show last score
                scoreTf.setText("GAME OVER last score: " + myGame.getLastScore());

                StringBuilder scoresText = new StringBuilder();

                // Retrieve the player scores from the 'myGame' object and store them in an ArrayList
                ArrayList<String> scores = myGame.playerScores();

                for (int i = 0; i < scores.size(); i++) {
                    // Append the rank (i + 1), followed by the score, to 'scoresText'
                    // 'i + 1' is used to show ranking starting from 1 instead of 0
                    // '.trim()' is used to remove any leading or trailing spaces from the score string
                    // '\n' is added to move to the next line after each score
                    scoresText.append(i + 1).append(". ").append(scores.get(i).trim()).append("\n");
                }

                scoreTa.setText(scoresText.toString());
                scoreTa.setLineWrap(false);
                submitBtn.setEnabled(false);
                answerTf.setEnabled(false);
            }
        } catch (NumberFormatException err) {
            // If a NumberFormatException error is received, warn the user..
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the answer field.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(mathGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mathGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mathGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mathGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mathGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTf;
    private javax.swing.JMenuItem applicationItem;
    private javax.swing.JMenu contactT;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JMenuItem forum;
    private javax.swing.JMenu homeF1;
    private javax.swing.JMenuItem homeItem1;
    private javax.swing.JRadioButton level1Btn;
    private javax.swing.JRadioButton level2Btn;
    private javax.swing.JRadioButton level3Btn;
    private javax.swing.JMenuItem loginItem;
    private javax.swing.ButtonGroup mathBtnGroup;
    private javax.swing.JMenuItem mathItem;
    private javax.swing.JLabel mathLb;
    private javax.swing.JMenu mathT;
    private javax.swing.JLabel nameLb;
    private javax.swing.JTextField nameTf;
    private javax.swing.JMenuBar navBar1;
    private javax.swing.JLabel questionTf;
    private javax.swing.JMenu schoolF;
    private javax.swing.JScrollPane scorePane;
    private javax.swing.JTextArea scoreTa;
    private javax.swing.JLabel scoreTf;
    private javax.swing.JMenuItem signupMenu;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel top10Lb;
    private javax.swing.JMenuItem volunteerItem;
    private javax.swing.JMenu volunteerT;
    private javax.swing.JLabel warningLb;
    // End of variables declaration//GEN-END:variables
}
