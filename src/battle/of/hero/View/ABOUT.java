package battle.of.hero.View;




import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 8.1
 */
public class ABOUT extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public ABOUT() {
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

        Info = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" KUIS CERDAS MATEMATIKA       V 2.0.0");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Info.setBackground(new java.awt.Color(51, 255, 51));
        Info.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Info.setText("DEVELOPPER TEAM");
        Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InfoMouseExited(evt);
            }
        });
        Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoActionPerformed(evt);
            }
        });
        getContentPane().add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, -1, 50));

        Back.setBackground(new java.awt.Color(51, 255, 51));
        Back.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        Back.setText("BACK");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/battle/of/hero/image/tentang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoActionPerformed
     JOptionPane.showMessageDialog(this,"Teknik Rekayasa Perangkat Lunak Kelompok 5B", "DEVELOPER TEAM", JOptionPane.INFORMATION_MESSAGE);       
    }//GEN-LAST:event_InfoActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MainMenu MainMenu = new MainMenu();
        MainMenu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackActionPerformed

    private void InfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoMouseEntered
        Info.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_InfoMouseEntered

    private void InfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoMouseExited
        Info.setBackground(new java.awt.Color(51, 255, 51));
    }//GEN-LAST:event_InfoMouseExited

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setBackground(new java.awt.Color(51, 255, 51));
    }//GEN-LAST:event_BackMouseExited

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
            java.util.logging.Logger.getLogger(Nama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABOUT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Info;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
