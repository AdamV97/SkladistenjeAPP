/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import skladistenje.controller.Obrada;
import skladistenje.model.Polica;
import skladistenje.model.Roba;
import skladistenje.pomocno.HibernateUtil;
import skladistenje.pomocno.Pomocno;


public class Ispravi extends javax.swing.JFrame {
    
    private NumberFormat nf;
    private DecimalFormat df;
    
     private Obrada<Roba> obrada;
    

    public Ispravi() {
        initComponents();
        
        obrada = new Obrada<>();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        nf=NumberFormat.getInstance(Pomocno.ZEMLJA);
        df=(DecimalFormat) nf;
        df.applyPattern(Pomocno.FORMAT_BROJA);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMasa = new javax.swing.JLabel();
        txtMasa = new javax.swing.JTextField();
        btnIspravi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTrazilica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRobe = new javax.swing.JList<>();
        btnTrazi = new javax.swing.JButton();
        jOznaka = new javax.swing.JLabel();
        jPolica = new javax.swing.JLabel();
        txtOznaka = new javax.swing.JTextField();
        jVrijednost = new javax.swing.JLabel();
        txtVrijednost = new javax.swing.JTextField();
        downPolica = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMasa.setText("Masa");

        txtMasa.setBackground(new java.awt.Color(255, 255, 255));

        btnIspravi.setText("Ispravi");
        btnIspravi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspraviActionPerformed(evt);
            }
        });

        jLabel4.setText("Tražilica");

        txtTrazilica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTrazilicaKeyPressed(evt);
            }
        });

        listaRobe.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaRobeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaRobe);

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jOznaka.setText("Oznaka");

        jPolica.setText("Polica");

        txtOznaka.setBackground(new java.awt.Color(255, 255, 255));

        jVrijednost.setText("Vrijednost");

        txtVrijednost.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnTrazi, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTrazilica, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOznaka)
                            .addComponent(btnIspravi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMasa)
                            .addComponent(txtVrijednost, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jOznaka)
                                    .addComponent(jMasa)
                                    .addComponent(jVrijednost)
                                    .addComponent(jPolica, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(downPolica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                        .addGap(2, 2, 2)
                        .addComponent(txtTrazilica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jOznaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOznaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jVrijednost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVrijednost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jMasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPolica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downPolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnIspravi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIspraviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIspraviActionPerformed

        Roba r = listaRobe.getSelectedValue();
        if (r == null) {
            JOptionPane.showMessageDialog( null,"Prvo odaberite smjer", "GREŠKA",JOptionPane.INFORMATION_MESSAGE);
            return;}

        obrada.delete(r);

        ucitajPodatke();

        reset();
    }//GEN-LAST:event_btnIspraviActionPerformed

    private void txtTrazilicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrazilicaKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            trazilica();
        }
    }//GEN-LAST:event_txtTrazilicaKeyPressed

    private void listaRobeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaRobeValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Roba r = listaRobe.getSelectedValue();

        if (r == null) {
            return;
        }

        txtOznaka.setText(r.getOznaka());

        txtVrijednost.setText(df.format(r.getVrijednost()));

        txtMasa.setText(df.format(r.getMasa()));



    }//GEN-LAST:event_listaRobeValueChanged

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        trazilica();
    }//GEN-LAST:event_btnTraziActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIspravi;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Polica> downPolica;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMasa;
    private javax.swing.JLabel jOznaka;
    private javax.swing.JLabel jPolica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jVrijednost;
    private javax.swing.JList<Roba> listaRobe;
    private javax.swing.JTextField txtMasa;
    private javax.swing.JTextField txtOznaka;
    private javax.swing.JTextField txtTrazilica;
    private javax.swing.JTextField txtVrijednost;
    // End of variables declaration//GEN-END:variables


private void ucitajPodatke() {
        DefaultListModel<Roba> model = new DefaultListModel<>();

        List<Roba> lista = HibernateUtil.getSession().createQuery(
                "from Roba a").list();

        for (Roba r : lista) {
            model.addElement(r);
        }

        this.listaRobe.setModel(model);

    }

private void reset() {
   txtOznaka.setText(null);
   txtVrijednost.setText(null);
   txtMasa.setText(null);
   txtTrazilica.setText(null);
}

private void upit(){

        int odabir =JOptionPane.showConfirmDialog(null, 
   "Sigurno?",null, JOptionPane.YES_NO_OPTION);
    
        if(odabir == JOptionPane.YES_OPTION);{
        return;
     }
  }

 private void trazilica(){
        if(txtTrazilica.getText().trim().length()==0){
            JOptionPane.showMessageDialog(getRootPane(), "Obavezno uvjet pretraživanja");
            return;
        }
         DefaultListModel<Roba> model = new DefaultListModel<>();

        List<Roba> listaRobe = HibernateUtil.getSession().createQuery(
                "from Roba a where a.oznaka like :uvjet")
                .setString("uvjet", "%" + txtTrazilica.getText().trim() + "%")
                .list();

        for (Roba r : listaRobe) {
            model.addElement(r);
        }

        this.listaRobe.setModel(model);
    }
 
  private Roba ispraviRoba(Roba r) {
   r.setOznaka(txtOznaka.getText());
        try {
            r.setVrijednost(new BigDecimal(df.parse(txtVrijednost.getText()).toString()));
        } catch (ParseException ex) {
            
        }
        try {
            r.setMasa(new BigDecimal(df.parse(txtMasa.getText()).toString()));
        } catch (ParseException ex) {
              
        }
        return r;      
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
            try {
               df.parse(txtMasa.getText());
        } catch (Exception e) {
            oznaciGresku(txtMasa);
            JOptionPane.showMessageDialog( null,"Unesena Masa mora biti broj!", "GREŠKA",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        }
        return true;

    }
  
  private void oznaciGresku(JTextField polje) {
        polje.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        polje.requestFocus();
    }
}
