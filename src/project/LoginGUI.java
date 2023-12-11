/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joshokeeffe
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
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

        mainLbl = new javax.swing.JLabel();
        searchLbl = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        emailTxt = new javax.swing.JTextField();
        displayBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
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

        mainLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        mainLbl.setText("Already have an account?");

        searchLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        searchLbl.setText("Enter your email to search for your account");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display Users");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete User");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
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
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainLbl)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchBtn)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchLbl)
                        .addGap(122, 122, 122))))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(displayBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(mainLbl)
                .addGap(18, 18, 18)
                .addComponent(searchLbl)
                .addGap(35, 35, 35)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayBtn)
                    .addComponent(deleteBtn))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // search button
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // stores the retrieved email in a variable called email
        // uses .trim() to remove unneccesary whitespace
        String email = emailTxt.getText();

        // creates a string to store the current line in
        String line;

        // creates a string array to hold the account details
        String[] accountDetails;

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an email to search.");
        } else {
            try {
                // creates file object for the accountDetails.csv
                File file = new File("accountDetails.csv");

                // create filereader and bufferedreader object to read the file
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                // boolean to track whether the email is found
                boolean accountFound = false;

                // loop through each line in the file
                while ((line = br.readLine()) != null) {
                    // separates the values of the file with ","
                    accountDetails = line.split(",");

                    // if a matching email is found
                    if (accountDetails[2].equals(email)) {
                        // creates a new instances of account
                        // passes the details stored in the accountDetails array as the parameters
                        Account account = new Account(accountDetails[0], accountDetails[1], accountDetails[2], accountDetails[3]);

                        accountFound = true;

                        // creates a new instance of the accountGUI class
                        // passes the account instance as the parameter
                        AccountGUI accountGUI = new AccountGUI(account);

                        // sets the visibilty of the new instance to true
                        accountGUI.setVisible(true);

                        // closes the LoginGUI
                        this.dispose();

                        // exit the loop once a match is found
                        break;
                    }
                }

                if (!accountFound) {
                    // display if a matching email isn't found
                    JOptionPane.showMessageDialog(null, "No account found with this email.");
                }

                // closes the bufferedreader
                br.close();

            } catch (IOException e) {
                // error displays if the file doesnt exist
                JOptionPane.showMessageDialog(null, "Error reading from file: " + e);
            }
        }


    }//GEN-LAST:event_searchBtnActionPerformed

    // display users button
    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // creates a string to store the current line in
        String line;

        boolean accountFound = false;

        try {
            // creates file object for the accountDetails.csv
            File file = new File("accountDetails.csv");

            // creates filereader and bufferedreader object to read the file
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // checks to see if the current line is not empty
            while ((line = br.readLine()) != null) {
                // creates a string array called accountDetails
                // separates the values with a ","
                String[] accountDetails = line.split(",");

                // assigns the values to variables
                String firstName = accountDetails[0];
                String lastName = accountDetails[1];
                String email = accountDetails[2];
                String course = accountDetails[3];

                // shows a formatted message with the account details
                JOptionPane.showMessageDialog(null,
                        "First Name: " + firstName
                        + "\nLast Name: " + lastName
                        + "\nEmail: " + email
                        + "\nCourse: " + course
                );

                accountFound = true;
            }

            // the first line is empty, signalling an empty csv file
            if (!accountFound) {
                // if there is no accounts
                JOptionPane.showMessageDialog(null, "No users accounts found.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    // delete user button
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // get the email and store it
        String email = emailTxt.getText().trim();
        boolean accountFound = false;

        // an arraylist to hold the accounts that aren't the searched email
        ArrayList<String> lines = new ArrayList<>();

        try {
            // creates file object for the accountDetails.csv
            File file = new File("accountDetails.csv");

            // creates filereader and bufferedreader object to read the file
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // asks the user to enter an email to search and stores it in a variable
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter the email of the account to delete");

            // creates a string to store the current line in
            String line;

            // checks to see if the current line is not empty
            while ((line = br.readLine()) != null) {
                // creates a string array called accountDetails
                // separates the values with a ","
                String[] accountDetails = line.split(",");

                // if the search term equals the email stored in the accountDetails array
                if (accountDetails[2].equals(searchTerm)) {
                    // sets the boolean variable to true indicating that the account was found
                    accountFound = true;
                } else {
                    // add the line to the lines arraylist if it doesn't match
                    lines.add(line);
                }
            }

            br.close();

            if (!accountFound) {
                // if an account with the searched email isn't found
                JOptionPane.showMessageDialog(null, "No account found with this email.");
            } else {
                // creates a filewriter object to write to the file
                FileWriter fw = new FileWriter(file);

                // creates a bufferedwriter object to write efficiently to the filewriter
                BufferedWriter writer = new BufferedWriter(fw);

                // loops through the lines arraylist and writes the stored accounts to the file
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }

                // closes the bufferedwriter object
                writer.close();

                JOptionPane.showMessageDialog(null, "Account deleted successfully.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem applicationItem;
    private javax.swing.JMenu contactT;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JMenuItem forum;
    private javax.swing.JMenu homeF1;
    private javax.swing.JMenuItem homeItem1;
    private javax.swing.JMenuItem loginItem;
    private javax.swing.JLabel mainLbl;
    private javax.swing.JMenuItem mathItem;
    private javax.swing.JMenu mathT;
    private javax.swing.JMenuBar navBar1;
    private javax.swing.JMenu schoolF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JMenuItem signupMenu;
    private javax.swing.JMenuItem volunteerItem;
    private javax.swing.JMenu volunteerT;
    // End of variables declaration//GEN-END:variables
}
