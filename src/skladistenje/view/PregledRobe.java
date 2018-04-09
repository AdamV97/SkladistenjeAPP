/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import skladistenje.model.Roba;
import skladistenje.pomocno.HibernateUtil;

/**
 *
 * @author Adam
 */
public class PregledRobe extends javax.swing.JFrame {

    public PregledRobe() {
        initComponents();
        
         DefaultTableModel m = (DefaultTableModel)tblRoba.getModel();
        
        
         List<Roba> lista = HibernateUtil.getSession().createQuery(
                "from Roba").list();
         Object niz[]=new Object[4];
        
         for (Roba r : lista) {
           niz[0]=r.getOznaka();
           niz[1]=r.getVrijednost();
           niz[2]=r.getMasa();
           niz[3]=r.getPolica();
          
           m.addRow(niz);
           m.setValueAt(r, m.getRowCount()-1, 0);

        }
        
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 3);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTrazilica = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnPovratak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoba = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Traži");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPovratak.setBackground(java.awt.Color.white);
        btnPovratak.setForeground(new java.awt.Color(255, 0, 51));
        btnPovratak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skladistenje/view/left-arrow.jpg"))); // NOI18N
        btnPovratak.setAlignmentX(0.5F);
        btnPovratak.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        btnPovratak.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPovratak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPovratakActionPerformed(evt);
            }
        });

        tblRoba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oznaka", "Vrijednost", "Masa", "Polica"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRoba);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPovratak, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtTrazilica, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPovratak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrazilica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPovratakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovratakActionPerformed
        dispose();
    }//GEN-LAST:event_btnPovratakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      trazilica();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPovratak;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoba;
    private javax.swing.JTextField txtTrazilica;
    // End of variables declaration//GEN-END:variables


private void trazilica(){
    
    
    DefaultTableModel m = (DefaultTableModel)tblRoba.getModel();
        
            m.setRowCount(0);
        
         List<Roba> lista = HibernateUtil.getSession().createQuery(
                "from Roba a where a.oznaka like :uvjet")
                .setString("uvjet", "%" + txtTrazilica.getText().trim() + "%")
                .list();
         Object niz[]=new Object[4];
        for (Roba r : lista) {
           niz[0]= r.getOznaka();
           niz[1]= r.getVrijednost();
           niz[2]=r.getMasa();
           niz[3]=r.getPolica();
           
           m.addRow(niz);
           m.setValueAt(r, m.getRowCount()-1, 0);
        }

    }




}
