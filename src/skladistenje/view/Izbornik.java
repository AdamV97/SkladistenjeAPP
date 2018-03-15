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
        btnSlobodniProstor = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnSlobodniProstor.setText("SLOBODNI PROSTOR");

        btnInfo.setText("INFO");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPregledRobe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSlobodniProstor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIspravi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIzvoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUvoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInfo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnUvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnIzvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIspravi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSlobodniProstor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPregledRobe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInfo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

JOptionPane.showMessageDialog( null,"       Trgovina: \nIme:   HyperX \nAdresa: tamodaleko2 \nTelefon: 0989898989898 ", "INFO",JOptionPane.INFORMATION_MESSAGE); 

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

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnIspravi;
    private javax.swing.JButton btnIzvoz;
    private javax.swing.JButton btnPregledRobe;
    private javax.swing.JButton btnSlobodniProstor;
    private javax.swing.JButton btnUvoz;
    // End of variables declaration//GEN-END:variables


    
}
