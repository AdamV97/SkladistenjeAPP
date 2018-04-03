/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import skladistenje.controller.Obrada;
import skladistenje.model.Polica;
import skladistenje.model.Roba;
import skladistenje.pomocno.HibernateUtil;
import skladistenje.pomocno.Pomocno;

/**
 *
 * @author Adam
 */
public class Uvoz extends javax.swing.JFrame {

    private Border obrub;
    private Obrada<Roba> obrada;
    private NumberFormat nf;
    private DecimalFormat df;
    
    public Uvoz() {
        initComponents();
       
        
        nf=NumberFormat.getInstance(Pomocno.ZEMLJA);
        df=(DecimalFormat) nf;
        df.applyPattern(Pomocno.FORMAT_BROJA);
        obrub = txtOznaka.getBorder();
        obrada = new Obrada<>();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 3);
        
       
        
        dohvatiPolica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUvezi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtOznaka = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVrijednost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMasa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        downPolica = new javax.swing.JComboBox<>();
        btnPovratak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        btnUvezi.setText("Uvezi");
        btnUvezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUveziActionPerformed(evt);
            }
        });

        jLabel1.setText("Oznaka");

        jLabel2.setText("Vrijednost");

        jLabel3.setText("Masa");

        jLabel5.setText("Polica");

        downPolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downPolicaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUvezi, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addComponent(downPolica, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMasa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVrijednost, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOznaka, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPovratak, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnPovratak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOznaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVrijednost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downPolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnUvezi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnUveziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUveziActionPerformed
        resetirajGreske();
        if (!kontrola()) {
        return;
        }
        Roba r = new Roba();
        r = napuniObjekt(r);
        obrada.save(r);  
        JOptionPane.showMessageDialog( rootPane,"Uveženo!","",JOptionPane.INFORMATION_MESSAGE);
        dohvatiPolica();
        reset();
    }//GEN-LAST:event_btnUveziActionPerformed

    private void btnPovratakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovratakActionPerformed
      dispose();
    }//GEN-LAST:event_btnPovratakActionPerformed

    private void downPolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downPolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downPolicaActionPerformed

    private Roba napuniObjekt(Roba r) {
        r.setOznaka(txtOznaka.getText());
        try {
            r.setVrijednost(new BigDecimal(df.parse(txtVrijednost.getText()).toString()));
        } catch (ParseException ex) {
            
        }
        try {
            r.setMasa(new BigDecimal(df.parse(txtMasa.getText()).toString()));
        } catch (ParseException ex) {
              
        }
        r.setPolica(downPolica.getItemAt(downPolica.getSelectedIndex()));
        return r;
    }
    
    private void oznaciGresku(JTextField polje) {
        polje.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        polje.requestFocus();
    }
    
    private void dohvatiPolica(){
 
               List<Polica> lista = HibernateUtil.getSession().createQuery(
                " select a "
                        + " from Polica a left outer join "
                        + " a.robaNaPolici as roba where roba is null").list();
        DefaultComboBoxModel<Polica> p = new DefaultComboBoxModel<>();
        for (Polica polica : lista) {
            p.addElement(polica);
        }
        
        downPolica.setModel(p);
        
    
}
    
    private void resetirajGreske() {
        txtOznaka.setBorder(obrub);
        txtVrijednost.setBorder(obrub);
        txtMasa.setBorder(obrub);
    }
   
    private boolean kontrola() {
        if (txtOznaka.getText().trim().length() == 0) {
            oznaciGresku(txtOznaka);
            JOptionPane.showMessageDialog( null,"Obavezno unijeti naziv!", "GREŠKA",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (txtVrijednost.getText().trim().length() == 0) {
            txtVrijednost.setText("0");
        } else {
            try {
                
                df.parse(txtVrijednost.getText());
                
            } catch (Exception e) {
                oznaciGresku(txtVrijednost);
                e.printStackTrace();
                JOptionPane.showMessageDialog( null,"Unesena Vrijednost mora biti broj!", "GREŠKA",JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
            
            if (txtMasa.getText().trim().length() == 0) {
            txtMasa.setText("0");
        } else {
            try {
               df.parse(txtMasa.getText());
        } catch (Exception e) {
            oznaciGresku(txtMasa);
            JOptionPane.showMessageDialog( null,"Unesena Masa mora biti broj!", "GREŠKA",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        return true;
            }
            return true;
    }
        
    
    
   private void reset() {
   txtOznaka.setText(null);
   txtVrijednost.setText(null);
   txtMasa.setText(null); 
   downPolica.setSelectedIndex(0);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPovratak;
    private javax.swing.JButton btnUvezi;
    private javax.swing.JComboBox<Polica> downPolica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtMasa;
    private javax.swing.JTextField txtOznaka;
    private javax.swing.JTextField txtVrijednost;
    // End of variables declaration//GEN-END:variables



    }


