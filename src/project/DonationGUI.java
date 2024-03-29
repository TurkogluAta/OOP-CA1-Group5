/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;
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
public class DonationGUI extends javax.swing.JFrame {
        private ArrayList<Donation> DonationInfo = new ArrayList<>();
    /**
     * Creates new form DonationGUI
     */
    public DonationGUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        FundLbl = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
        EmailLbl = new javax.swing.JLabel();
        PhoneLbl = new javax.swing.JLabel();
        SNLbl = new javax.swing.JLabel();
        TypeLbl = new javax.swing.JLabel();
        MessageLbl = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        SNTxt = new javax.swing.JTextField();
        PhoneTxt = new javax.swing.JTextField();
        PrimaryRb = new javax.swing.JRadioButton();
        SecondaryRb = new javax.swing.JRadioButton();
        SubmitBtn = new javax.swing.JButton();
        MsgSp = new javax.swing.JScrollPane();
        MsgTa = new javax.swing.JTextArea();
        DisplayBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
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
        setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N

        FundLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        FundLbl.setText("Schools Fundraising");

        NameLbl.setText("Name*");

        EmailLbl.setText("E-mail*");

        PhoneLbl.setText("Phone");

        SNLbl.setText("School Name*");

        TypeLbl.setText("Type of School*");

        MessageLbl.setText("Message");

        NameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtActionPerformed(evt);
            }
        });

        EmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtActionPerformed(evt);
            }
        });

        SNTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SNTxtActionPerformed(evt);
            }
        });

        PhoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTxtActionPerformed(evt);
            }
        });

        PrimaryRb.setText("Primary");
        PrimaryRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimaryRbActionPerformed(evt);
            }
        });

        SecondaryRb.setText("Secondary");
        SecondaryRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondaryRbActionPerformed(evt);
            }
        });

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        MsgTa.setColumns(20);
        MsgTa.setRows(5);
        MsgSp.setViewportView(MsgTa);

        DisplayBtn.setText("Display");
        DisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FundLbl)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisplayBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EmailLbl)
                                    .addComponent(NameLbl)
                                    .addComponent(PhoneLbl)
                                    .addComponent(SNLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TypeLbl)
                                    .addComponent(MessageLbl))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(PrimaryRb)
                                        .addGap(18, 18, 18)
                                        .addComponent(SecondaryRb))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(EmailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PhoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SNTxt, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MsgSp, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubmitBtn)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FundLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DisplayBtn)
                        .addComponent(SearchBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLbl)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLbl))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SNLbl))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLbl)
                    .addComponent(PrimaryRb)
                    .addComponent(SecondaryRb))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MessageLbl)
                    .addComponent(MsgSp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(SubmitBtn)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTxtActionPerformed

    private void PhoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTxtActionPerformed

    private void NameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        if (NameTxt.getText().isEmpty() || EmailTxt.getText().isEmpty() || SNTxt.getText().isEmpty() || (!PrimaryRb.isSelected() && !SecondaryRb.isSelected())) {
        // Show a warning message if any of the required fields are empty
        JOptionPane.showMessageDialog(this, "Please fill out all the required fields", "Warning", JOptionPane.WARNING_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Thank you for your support! \n If you have any questions or queries, please don't hesitate to contact \nJosh at 'joshy@gmail.com' or on 01-000-0000.");
    }
        
        Donation d = new Donation();
            d.setEmail(EmailTxt.getText());
            d.setName(NameTxt.getText());
            // if PrimaryRb is selected shows "Primary"
                if (PrimaryRb.isSelected()) {
                    d.setSchoolType("Primary");
                }
                
               
                if (SecondaryRb.isSelected()) {
                    String existingType = d.getSchoolType(); 
                    // If other radio button is selected, it retrieves the current value of the schoolType from the object d and stores it in the variable existingType.
                    if (existingType == null) {
                        d.setSchoolType("Secondary"); // if only SecondaryRb is selected shows "Secondary"
                    } else {
                        d.setSchoolType(existingType + "& Secondary");
                    }   // if both of them are selected show both
                }
            DonationInfo.add(d);  
            
             File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            f = new File("Donation.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(DonationInfo);
            oStream.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void SNTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SNTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SNTxtActionPerformed

    private void PrimaryRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimaryRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrimaryRbActionPerformed

    private void SecondaryRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondaryRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondaryRbActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
         if(DonationInfo.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sorry, there are no Donor information to search");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter the name to search for");
            
            boolean found = false;
            for(Donation d:DonationInfo){
                if(d.getName().equalsIgnoreCase(searchTerm)){
                    JOptionPane.showMessageDialog(null, d.getDetails());
                    found = true;
                    break;  // if the email is found
                }
            }
            if(!found){
            JOptionPane.showMessageDialog(null, "No matching information found.");
        }
   
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void DisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBtnActionPerformed
        // TODO add your handling code here:
        
        for(Donation d:DonationInfo){
            JOptionPane.showMessageDialog(null,d.getDetails());
        }
         
         File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            f = new File("Donation.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            DonationInfo = (ArrayList<Donation>)oStream.readObject();
            oStream.close();
        }
        catch(IOException|ClassNotFoundException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DisplayBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayBtn;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel FundLbl;
    private javax.swing.JLabel MessageLbl;
    private javax.swing.JScrollPane MsgSp;
    private javax.swing.JTextArea MsgTa;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JLabel PhoneLbl;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JRadioButton PrimaryRb;
    private javax.swing.JLabel SNLbl;
    private javax.swing.JTextField SNTxt;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JRadioButton SecondaryRb;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel TypeLbl;
    private javax.swing.JMenuItem applicationItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenu contactT;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JMenuItem forum;
    private javax.swing.JMenu homeF1;
    private javax.swing.JMenuItem homeItem1;
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
