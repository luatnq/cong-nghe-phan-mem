/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import model.User;

/**
 *
 * @author Admin
 */
public final class UserHomeView extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form UserHomeView
     */
   
    private static User user;
     public UserHomeView(User user) {
        initComponents();
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Login by: "+user.getUsername());
        if(user.getRole()==1){
            jLabel2.setText("Role: "+"Admin");
        }else if(user.getRole()==0){
            jLabel2.setText("Role: "+"Maneger");
        }else if(user.getRole()==-1){
            jLabel2.setText("Role: "+"User normal");
        }
        this.user = user;
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btnQLDKTD = new javax.swing.JButton();
        btnQLKQTD = new javax.swing.JButton();
        btnQLCD = new javax.swing.JButton();
        btnQLTK = new javax.swing.JButton();
        btnQLDD = new javax.swing.JButton();
        btnTeamStat = new javax.swing.JButton();
        btnRacerStat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                none(evt);
            }
        });

        btnQLDKTD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQLDKTD.setText("Quan ly dang ki thi dau");
        btnQLDKTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDKTDActionPerformed(evt);
            }
        });

        btnQLKQTD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQLKQTD.setText("Quan ly ket qua thi dau");
        btnQLKQTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKQTDActionPerformed(evt);
            }
        });

        btnQLCD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQLCD.setText("Quan ly chang dua");
        btnQLCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLCDActionPerformed(evt);
            }
        });

        btnQLTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQLTK.setText("Quan ly tai khoan");
        btnQLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTKActionPerformed(evt);
            }
        });

        btnQLDD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQLDD.setText("Quan ly doi dua");
        btnQLDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDDActionPerformed(evt);
            }
        });

        btnTeamStat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTeamStat.setText("Thong ke doi dua");
        btnTeamStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamStatActionPerformed(evt);
            }
        });

        btnRacerStat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRacerStat.setText("Thong ke tay dua");
        btnRacerStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRacerStatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Home view");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnQLCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQLDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRacerStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQLTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTeamStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQLKQTD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQLDKTD, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 91, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnQLDKTD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLKQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnQLCD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLDD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTeamStat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRacerStat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLTK, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void btnQLDKTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDKTDActionPerformed
        JOptionPane.showMessageDialog(this, "Chuc nang chua hoan thien");
    }//GEN-LAST:event_btnQLDKTDActionPerformed

    private void btnTeamStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamStatActionPerformed
        this.dispose();
        TeamStatView teamStatView = new TeamStatView(user);
        teamStatView.setVisible(true);
    }//GEN-LAST:event_btnTeamStatActionPerformed

    private void btnQLKQTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKQTDActionPerformed
        JOptionPane.showMessageDialog(this, "Chuc nang chua hoan thien");
    }//GEN-LAST:event_btnQLKQTDActionPerformed

    private void btnQLCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLCDActionPerformed
        JOptionPane.showMessageDialog(this, "Chuc nang chua hoan thien");
    }//GEN-LAST:event_btnQLCDActionPerformed

    private void btnQLDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDDActionPerformed
        JOptionPane.showMessageDialog(this, "Chuc nang chua hoan thien");
    }//GEN-LAST:event_btnQLDDActionPerformed

    private void btnRacerStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRacerStatActionPerformed
        JOptionPane.showMessageDialog(this, "Chuc nang chua hoan thien");
    }//GEN-LAST:event_btnRacerStatActionPerformed

    private void btnQLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKActionPerformed
        JOptionPane.showMessageDialog(this, "Chuc nang chua hoan thien");
    }//GEN-LAST:event_btnQLTKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomeView(user).setVisible(true);
                
   
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLCD;
    private javax.swing.JButton btnQLDD;
    private javax.swing.JButton btnQLDKTD;
    private javax.swing.JButton btnQLKQTD;
    private javax.swing.JButton btnQLTK;
    private javax.swing.JButton btnRacerStat;
    private javax.swing.JButton btnTeamStat;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
