


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class MainMenu extends javax.swing.JFrame {
    int rgbIn = 16711680, rgbOut = 10027008;
    
    public MainMenu() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Start = new javax.swing.JButton();
        About = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        Setting = new javax.swing.JButton();
        Deck = new javax.swing.JButton();
        Heropedia = new javax.swing.JButton();
        Shop = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" KUIS CERDAS MATEMATIKA       V 2.0.0");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Start.setBackground(new java.awt.Color(153, 0, 0));
        Start.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Start.setText("Main");
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartMouseExited(evt);
            }
        });
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 240, 50));

        About.setBackground(new java.awt.Color(153, 0, 0));
        About.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        About.setText("Tentang");
        About.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutMouseExited(evt);
            }
        });
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        getContentPane().add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 250, 50));

        Help.setBackground(new java.awt.Color(153, 0, 0));
        Help.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Help.setText("Bantuan");
        Help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpMouseExited(evt);
            }
        });
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        getContentPane().add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 250, 50));

        Quit.setBackground(new java.awt.Color(153, 0, 0));
        Quit.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Quit.setText("Keluar");
        Quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuitMouseExited(evt);
            }
        });
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        getContentPane().add(Quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 240, 50));

        Setting.setBackground(new java.awt.Color(153, 0, 0));
        Setting.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Setting.setText("Pengaturan");
        Setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingMouseExited(evt);
            }
        });
        Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingActionPerformed(evt);
            }
        });
        getContentPane().add(Setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 240, 50));

        Deck.setBackground(new java.awt.Color(153, 0, 0));
        Deck.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Deck.setText("Dek");
        Deck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeckMouseExited(evt);
            }
        });
        Deck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeckActionPerformed(evt);
            }
        });
        getContentPane().add(Deck, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 240, 50));

        Heropedia.setBackground(new java.awt.Color(153, 0, 0));
        Heropedia.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Heropedia.setText("Heropedia");
        Heropedia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Heropedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HeropediaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeropediaMouseExited(evt);
            }
        });
        Heropedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeropediaActionPerformed(evt);
            }
        });
        getContentPane().add(Heropedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 240, -1));

        Shop.setBackground(new java.awt.Color(153, 0, 0));
        Shop.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Shop.setText("Toko");
        Shop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Shop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShopMouseExited(evt);
            }
        });
        Shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopActionPerformed(evt);
            }
        });
        getContentPane().add(Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 240, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/battle/of/hero/Image/menu.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        Play Play = new Play();
        Play.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StartActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        ABOUT ABOUT = new ABOUT();
        ABOUT.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AboutActionPerformed

    private void StartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseEntered
        Start.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_StartMouseEntered

    private void StartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseExited
        Start.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_StartMouseExited

    private void AboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseEntered
        About.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_AboutMouseEntered

    private void AboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseExited
        About.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_AboutMouseExited

    private void HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseEntered
        Help.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_HelpMouseEntered

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        Help.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_HelpMouseExited

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Help Help = new Help();
        Help.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HelpActionPerformed

    private void QuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitMouseEntered
        Quit.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_QuitMouseEntered

    private void QuitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitMouseExited
        Quit.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_QuitMouseExited

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin ingin keluar?", "Warning", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION)
            System.exit(WIDTH);
    }//GEN-LAST:event_QuitActionPerformed

    private void SettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseEntered
        Setting.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_SettingMouseEntered

    private void SettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseExited
        Setting.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_SettingMouseExited

    private void SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingActionPerformed
        Setting Setting = new Setting();
        Setting.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SettingActionPerformed

    private void DeckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeckMouseEntered
        Deck.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_DeckMouseEntered

    private void DeckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeckMouseExited
        Deck.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_DeckMouseExited

    private void DeckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeckActionPerformed
        Deck Deck = new Deck();
        Deck.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeckActionPerformed

    private void HeropediaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeropediaMouseEntered
        Heropedia.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_HeropediaMouseEntered

    private void HeropediaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeropediaMouseExited
        Heropedia.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_HeropediaMouseExited

    private void HeropediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeropediaActionPerformed
        Heropedia Heropedia = new Heropedia();
        Heropedia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HeropediaActionPerformed

    private void ShopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopMouseEntered
        Shop.setBackground(new java.awt.Color(rgbIn));
    }//GEN-LAST:event_ShopMouseEntered

    private void ShopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopMouseExited
        Shop.setBackground(new java.awt.Color(rgbOut));
    }//GEN-LAST:event_ShopMouseExited

    private void ShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopActionPerformed
        Shop Shop = new Shop();
        Shop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShopActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JButton Deck;
    private javax.swing.JButton Help;
    private javax.swing.JButton Heropedia;
    private javax.swing.JButton Quit;
    private javax.swing.JButton Setting;
    private javax.swing.JButton Shop;
    private javax.swing.JButton Start;
    private javax.swing.JLabel bg;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
