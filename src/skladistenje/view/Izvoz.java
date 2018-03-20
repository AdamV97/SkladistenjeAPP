/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import skladistenje.controller.Obrada;
import skladistenje.model.Roba;
import skladistenje.pomocno.HibernateUtil;
import skladistenje.pomocno.Pomocno;

/**
 *
 * @author Adam
 */
public class Izvoz extends javax.swing.JFrame {
    private NumberFormat nf;
    private DecimalFormat df;
    
 private Obrada<Roba> obrada;
    

    public Izvoz() {
        initComponents();
        
        obrada = new Obrada<>();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        nf=NumberFormat.getInstance(Pomocno.ZEMLJA);
        df=(DecimalFormat) nf;
        df.applyPattern(Pomocno.FORMAT_BROJA);
        
        ucitajPodatke();
    
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaRobe = new javax.swing.JList<>();
        jOznaka = new javax.swing.JLabel();
        txtOznaka = new javax.swing.JTextField();
        jVrijednost = new javax.swing.JLabel();
        txtVrijednost = new javax.swing.JTextField();
        jMasa = new javax.swing.JLabel();
        txtMasa = new javax.swing.JTextField();
        btnIzvezi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTrazilica = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        txtPolica = new javax.swing.JTextField();
        jPolica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaRobe.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaRobeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaRobe);

        jOznaka.setText("Oznaka");

        txtOznaka.setEditable(false);
        txtOznaka.setBackground(new java.awt.Color(255, 255, 255));

        jVrijednost.setText("Vrijednost");

        txtVrijednost.setEditable(false);
        txtVrijednost.setBackground(new java.awt.Color(255, 255, 255));

        jMasa.setText("Masa");

        txtMasa.setEditable(false);
        txtMasa.setBackground(new java.awt.Color(255, 255, 255));

        btnIzvezi.setText("Izvezi");
        btnIzvezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzveziActionPerformed(evt);
            }
        });

        jLabel4.setText("Tražilica");

        txtTrazilica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTrazilicaKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        txtPolica.setEditable(false);
        txtPolica.setBackground(new java.awt.Color(255, 255, 255));

        jPolica.setText("Polica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnTrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTrazilica, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnIzvezi, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOznaka)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jOznaka)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPolica, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMasa)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jMasa)
                                            .addComponent(jVrijednost)
                                            .addComponent(jPolica, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtVrijednost, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(txtPolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(btnIzvezi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
         
         txtPolica.setText(r.getPolica().toString());
  
    }//GEN-LAST:event_listaRobeValueChanged

    private void btnIzveziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzveziActionPerformed

        Roba r = listaRobe.getSelectedValue();
        if (r == null) {
            JOptionPane.showMessageDialog( null,"Prvo odaberite smjer", "GREŠKA",JOptionPane.INFORMATION_MESSAGE);
            return;}
            
        upit();
        
        obrada.delete(r);

        ucitajPodatke();
        
        reset();
    }//GEN-LAST:event_btnIzveziActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
    trazilica();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtTrazilicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrazilicaKeyPressed
    if(evt.getKeyChar() == KeyEvent.VK_ENTER){
           trazilica();
       }
    }//GEN-LAST:event_txtTrazilicaKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzvezi;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMasa;
    private javax.swing.JLabel jOznaka;
    private javax.swing.JLabel jPolica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jVrijednost;
    private javax.swing.JList<Roba> listaRobe;
    private javax.swing.JTextField txtMasa;
    private javax.swing.JTextField txtOznaka;
    private javax.swing.JTextField txtPolica;
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
   txtPolica.setText(null);
   txtTrazilica.setText(null);
}
private void upit(){

      if(
                JOptionPane.showConfirmDialog(
                        getRootPane(), 
                "Sigurno izvestii?", 
                "Upit?", 
                JOptionPane.YES_NO_OPTION)
                
                ==
                
                JOptionPane.YES_OPTION
                
                ){
            JOptionPane.showMessageDialog(getRootPane(), "Izveženo");
        }else{
            JOptionPane.showMessageDialog(getRootPane(), "X");;
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

}


 


