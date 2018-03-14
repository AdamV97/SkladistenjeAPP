/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje;

import skladistenje.controller.Obrada;
import skladistenje.model.Polica;
import skladistenje.model.Red;
import skladistenje.model.Skladiste;
import skladistenje.model.Trgovina;
import skladistenje.pomocno.HibernateUtil;
import skladistenje.view.Izbornik;
import skladistenje.view.Izbornik;

/**
 *
 * @author Admin
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       
       HibernateUtil.getSession();
  
    
     new Izbornik().setVisible(true);
    }
    
}
