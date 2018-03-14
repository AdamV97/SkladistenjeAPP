/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.pomocno;

import skladistenje.controller.Obrada;
import skladistenje.model.Polica;
import skladistenje.model.Red;
import skladistenje.model.Skladiste;
import skladistenje.model.Trgovina;

/**
 *
 * @author Profesor
 */
public class InicijalnoPunjenje {
    public static void main(String[] args) {
        
      Obrada<Trgovina> ot = new Obrada();
      
        Trgovina t = new Trgovina();
    t.setIme("HyperX");
    t.setAdresa("tamodaleko 2");
    t.setTelefon("0989898989898");
    
    ot.save(t);
    
    
    
     Obrada<Skladiste> os = new Obrada();
    
         Skladiste s = new Skladiste();
    s.setAdresa("skoroBlizu2");
    s.setPovrsina("60m2");
    s.setTrgovina(t);
    
    //ovako i ostale
    s=os.save(s);
    
    Obrada<Red> or = new Obrada();
    
        Red rA = new Red();
        rA.setOznaka("A");
        rA.setDuzina("1m");
        rA.setSirina("1m");
        rA.setVisina("0m");
        rA.setSkladiste(s);
 
        or.save(rA);
        
        Red rB = new Red();
        rB.setOznaka("B");
        rB.setDuzina("1m");
        rB.setSirina("1m");
        rB.setVisina("0m");
        rB.setSkladiste(s);
        
        or.save(rB);
        
        Red rC = new Red();
        rC.setOznaka("C");
        rC.setDuzina("1m");
        rC.setSirina("1m");
        rC.setVisina("0m");
        rC.setSkladiste(s);
    
        or.save(rC);
    
    Obrada<Polica> op = new Obrada();
        
        Polica p1 = new Polica();
        p1.setOznaka("1");
        p1.setDuzina("1m");
        p1.setSirina("1m");
        p1.setVisina("0m");
        p1.setRed(rA);
        op.save(p1);
        
         Polica p2 = new Polica();
        p2.setOznaka("2");
        p2.setDuzina("1m");
        p2.setSirina("1m");
        p2.setVisina("0m");
        p2.setRed(rA);
        op.save(p2);
        
         Polica p3 = new Polica();
        p3.setOznaka("3");
        p3.setDuzina("1m");
        p3.setSirina("1m");
        p3.setVisina("0m");
        p3.setRed(rA);
        op.save(p3);
        
        Polica p4 = new Polica();
        p4.setOznaka("4");
        p4.setDuzina("1m");
        p4.setSirina("1m");
        p4.setVisina("0m");
        p4.setRed(rA);
        op.save(p4);
        
         Polica p5 = new Polica();
        p5.setOznaka("5");
        p5.setDuzina("1m");
        p5.setSirina("1m");
        p5.setVisina("0m");
        p5.setRed(rA);
        op.save(p5);
        
         Polica p6 = new Polica();
        p6.setOznaka("6");
        p6.setDuzina("1m");
        p6.setSirina("1m");
        p6.setVisina("0m");
        p6.setRed(rA);
        op.save(p6);
        
         Polica p7 = new Polica();
        p7.setOznaka("7");
        p7.setDuzina("1m");
        p7.setSirina("1m");
        p7.setVisina("0m");
        p7.setRed(rA);
        op.save(p7);
        
        Polica p8 = new Polica();
        p8.setOznaka("8");
        p8.setDuzina("1m");
        p8.setSirina("1m");
        p8.setVisina("0m");
        p8.setRed(rB);
        op.save(p8);
        
         Polica p9 = new Polica();
        p9.setOznaka("9");
        p9.setDuzina("1m");
        p9.setSirina("1m");
        p9.setVisina("0m");
        p9.setRed(rB);
        op.save(p9);
        
         Polica p10 = new Polica();
        p10.setOznaka("10");
        p10.setDuzina("1m");
        p10.setSirina("1m");
        p10.setVisina("0m");
        p10.setRed(rB);
        op.save(p10);
        
        Polica p11 = new Polica();
        p11.setOznaka("11");
        p11.setDuzina("1m");
        p11.setSirina("1m");
        p11.setVisina("0m");
        p11.setRed(rB);
        op.save(p11);
        
         Polica p12 = new Polica();
        p12.setOznaka("12");
        p12.setDuzina("1m");
        p12.setSirina("1m");
        p12.setVisina("0m");
        p12.setRed(rB);
        op.save(p12);
        
         Polica p13 = new Polica();
        p13.setOznaka("13");
        p13.setDuzina("1m");
        p13.setSirina("1m");
        p13.setVisina("0m");
        p13.setRed(rB);
         op.save(p13);
        
         Polica p14 = new Polica();
        p14.setOznaka("14");
        p14.setDuzina("1m");
        p14.setSirina("1m");
        p14.setVisina("0m");
        p14.setRed(rB);
        op.save(p14);
    
          Polica p15 = new Polica();
        p15.setOznaka("15");
        p15.setDuzina("1m");
        p15.setSirina("1m");
        p15.setVisina("0m");
        p15.setRed(rC);
        op.save(p15);
        
        Polica p16 = new Polica();
        p16.setOznaka("16");
        p16.setDuzina("1m");
        p16.setSirina("1m");
        p16.setVisina("0m");
        p16.setRed(rC);
        
        op.save(p16);
        
         Polica p17 = new Polica();
        p17.setOznaka("17");
        p17.setDuzina("1m");
        p17.setSirina("1m");
        p17.setVisina("0m");
        p17.setRed(rC);
        op.save(p17);
        
         Polica p18 = new Polica();
        p18.setOznaka("18");
        p18.setDuzina("1m");
        p18.setSirina("1m");
        p18.setVisina("0m");
        p18.setRed(rC);
        op.save(p18);
        
         Polica p19 = new Polica();
        p19.setOznaka("19");
        p19.setDuzina("1m");
        p19.setSirina("1m");
        p19.setVisina("0m");
        p19.setRed(rC);
        op.save(p19);
        
         Polica p20 = new Polica();
        p20.setOznaka("20");
        p20.setDuzina("1m");
        p20.setSirina("1m");
        p20.setVisina("0m");
        p20.setRed(rC);
        op.save(p20);
        
         Polica p21 = new Polica();
        p21.setOznaka("21");
        p21.setDuzina("1m");
        p21.setSirina("1m");
        p21.setVisina("0m");
        p21.setRed(rC);
         op.save(p21);
    
    }
}
