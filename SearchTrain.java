/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayreservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class SearchTrain extends javax.swing.JFrame {

    /**
     * Creates new form Loginform
     */
    public SearchTrain() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        BackBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Sourcelbl = new javax.swing.JLabel();
        Destinationlbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        Searchbtn = new javax.swing.JButton();
        Resetbtn = new javax.swing.JButton();
        Sourcetf = new javax.swing.JTextField();
        Destinationtf = new javax.swing.JTextField();
        Datetf = new javax.swing.JTextField();
        trainidtf = new javax.swing.JTextField();

        jRadioButton1.setText("Book Ticket");

        jRadioButton2.setText("jRadioButton2");

        jRadioButton3.setText("jRadioButton3");

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sourcelbl.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Sourcelbl.setText("Source:");
        getContentPane().add(Sourcelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 89, 140, -1));

        Destinationlbl.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Destinationlbl.setText("Destination:");
        getContentPane().add(Destinationlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 127, 140, -1));

        Datelbl.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Datelbl.setText("Departure Date:");
        getContentPane().add(Datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 165, 140, -1));

        Searchbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Searchbtn.setText("Search Trains");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        Resetbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Resetbtn.setText("Reset");
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, -1));

        Sourcetf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(Sourcetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 86, 97, -1));

        Destinationtf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(Destinationtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 124, 97, -1));

        Datetf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(Datetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 162, 97, -1));
        getContentPane().add(trainidtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 0, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
                Loginform loginform=new Loginform();//It is used for linking the next frame
                loginform.setLocationRelativeTo(null);// GUI comes in center
                loginform.setTitle("Login Form");
                loginform.setSize(600,600);
                loginform.setResizable(false);
                loginform.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
      Sourcetf.setText(""); 
      Destinationtf.setText(""); 
      Datetf.setText("");
      Sourcetf.requestFocus();
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        /* Details det=new Details();//It is used for linking the next frame
        det.setLocationRelativeTo(null);// GUI comes in center
        det.setTitle("Details");
        det.setSize(600,600);
        det.setResizable(false);
        det.setVisible(true); */  // TODO add your handling code here:
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwayreservation", "root", "");
            String sql = "SELECT * FROM `traindetails` WHERE SOURCE=? && DESTINATION=? && DEPARTUREDATE=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Sourcetf.getText());
            pst.setString(2, Destinationtf.getText());
            pst.setString(3, Datetf.getText());
            
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                trainidtf.setText(rs.getString("TRAINNO"));
                String str=trainidtf.getText().toString();
                System.out.print(str);
                trainidtf.setText("");
                
                trainidtf.setVisible(false);
                
                JOptionPane.showMessageDialog(null, "Train Found");
                
                this.dispose();
                Displaytrain obj2 = new Displaytrain(str);
                obj2.setVisible(true);
                obj2.setTitle("Display Trains");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Train Not Found");
               
                Sourcetf.setText("");
                Destinationtf.setText("");
                Datetf.setText("");
            }
            con.close();
       }
       catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_SearchbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchTrain search=new SearchTrain();
                search.setVisible(true);
                search.setTitle("Search Train");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JTextField Datetf;
    private javax.swing.JLabel Destinationlbl;
    private javax.swing.JTextField Destinationtf;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JLabel Sourcelbl;
    private javax.swing.JTextField Sourcetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField trainidtf;
    // End of variables declaration//GEN-END:variables
}
