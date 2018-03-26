/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Izbornik extends javax.swing.JFrame {
        

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
       
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIzvoz = new javax.swing.JButton();
        btnIspravi = new javax.swing.JButton();
        btnUvoz = new javax.swing.JButton();
        btnPregledRobe = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnIzgledSkladista = new javax.swing.JButton();
        jlbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setResizable(false);

        btnIzvoz.setText("IZVOZ");
        btnIzvoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvozActionPerformed(evt);
            }
        });

        btnIspravi.setText("ISPRAVI");
        btnIspravi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspraviActionPerformed(evt);
            }
        });

        btnUvoz.setText("UVOZ");
        btnUvoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUvozActionPerformed(evt);
            }
        });

        btnPregledRobe.setText("PREGLED ROBE");

        btnInfo.setText("INFO");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnIzgledSkladista.setText("IZGLED SKLADIŠTA");
        btnIzgledSkladista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzgledSkladistaActionPerformed(evt);
            }
        });

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skladistenje/view/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIzgledSkladista)
                    .addComponent(btnUvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIspravi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPregledRobe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jlbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(btnUvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIzvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIspravi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPregledRobe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnIzgledSkladista, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

    new Info().setVisible(true);

    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnUvozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUvozActionPerformed
     new Uvoz().setVisible(true);
    }//GEN-LAST:event_btnUvozActionPerformed

    private void btnIzvozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzvozActionPerformed
        new Izvoz().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzvozActionPerformed

    private void btnIspraviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIspraviActionPerformed
       new Ispravi().setVisible(true);
    }//GEN-LAST:event_btnIspraviActionPerformed

    private void btnIzgledSkladistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzgledSkladistaActionPerformed
       new IzgledSkladista().setVisible(true);
    }//GEN-LAST:event_btnIzgledSkladistaActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnIspravi;
    private javax.swing.JButton btnIzgledSkladista;
    private javax.swing.JButton btnIzvoz;
    private javax.swing.JButton btnPregledRobe;
    private javax.swing.JButton btnUvoz;
    private javax.swing.JLabel jlbLogo;
    // End of variables declaration//GEN-END:variables


    
}
