/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigDecimal;
import static java.util.Collections.list;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import skladistenje.model.Roba;
import skladistenje.pomocno.HibernateUtil;

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
        
        graf();
      
       
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
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        btnIzvoz.setText("IZVOZ");
        btnIzvoz.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnIzvoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvozActionPerformed(evt);
            }
        });

        btnIspravi.setText("ISPRAVI");
        btnIspravi.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnIspravi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspraviActionPerformed(evt);
            }
        });

        btnUvoz.setText("UVOZ");
        btnUvoz.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnUvoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUvozActionPerformed(evt);
            }
        });

        btnPregledRobe.setText("PREGLED ROBE");
        btnPregledRobe.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnPregledRobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregledRobeActionPerformed(evt);
            }
        });

        btnInfo.setText("INFO");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnIzgledSkladista.setText("IZGLED SKLADIŠTA");
        btnIzgledSkladista.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnIzgledSkladista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzgledSkladistaActionPerformed(evt);
            }
        });

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skladistenje/view/logo.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIspravi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPregledRobe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzgledSkladista))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIzvoz, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIspravi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPregledRobe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIzgledSkladista, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfo)
                .addContainerGap())
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

    private void btnPregledRobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregledRobeActionPerformed
       new PregledRobe().setVisible(true);
    }//GEN-LAST:event_btnPregledRobeActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
     graf();
    }//GEN-LAST:event_formWindowGainedFocus

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbLogo;
    // End of variables declaration//GEN-END:variables

private void graf(){
        
    DefaultPieDataset dataset = new DefaultPieDataset( );
      
       List<Roba> lista = HibernateUtil.getSession().createQuery(
                "from Roba").list();
       for (Roba r : lista){
       
         dataset.setValue(
        
         r.getOznaka(),
         r.getVrijednost()
                           );
            
       }
         JFreeChart chart = ChartFactory.createPieChart(
         "Vrijednost(% Ukupnog kapitala trgovine)",          
         dataset,                   
         true,                     
         true,           
         false );
    
         ChartPanel barPanel = new ChartPanel(chart);
         jPanel1.removeAll();
         jPanel1.add(barPanel,BorderLayout.CENTER);
         jPanel1.validate();
         
         
    
}

    
}
