/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayreservation;

/**
 *
 * @author Acer
 */
public class PaymentPortal extends javax.swing.JFrame {

    /**
     * Creates new form PaymentPortal
     */
    public PaymentPortal() {
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

        jLabel1 = new javax.swing.JLabel();
        Paymentoptionlbl = new javax.swing.JLabel();
        continuebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        payMethod = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Payable Price is:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Paymentoptionlbl.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Paymentoptionlbl.setText("Select payment option ");

        continuebtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        continuebtn.setText("Continue");
        continuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuebtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        payMethod.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        payMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your Option", "Credit_Debit", "Net Banking", "Paytm" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Paymentoptionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(continuebtn)
                        .addGap(45, 45, 45)
                        .addComponent(backbtn)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(Paymentoptionlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuebtn)
                    .addComponent(backbtn))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuebtnActionPerformed
        String option = payMethod.getSelectedItem().toString();
     Credit_Debit_selection ob=new Credit_Debit_selection();
     Net_Banking_selection ao=new Net_Banking_selection();
     Paytm_selection ps=new Paytm_selection();
        if(option=="Credit_Debit")
        {
        this.dispose();
        ob.setVisible(true);
        ob.setTitle("Credit/Debit Form");
        }
        else if(option=="Net Banking")
        {
        this.dispose();
        ao.setVisible(true);
        ao.setTitle("Net Banking");
        }
        else if(option=="Paytm")
        {
        this.dispose();
        ps.setVisible(true);
        ps.setTitle("Paytm");
        }
        
    }//GEN-LAST:event_continuebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
      Details de=new Details();//It is used for linking the next frame
               de.setLocationRelativeTo(null);// GUI comes in center
                de.setTitle("Details");
                de.setSize(600,600);
                de.setResizable(false);
                de.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Paymentoptionlbl;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton continuebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> payMethod;
    // End of variables declaration//GEN-END:variables
}
