/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Adam
 */
@Entity
@Table
public class Roba implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String masa;
    private String oznaka;
    private String vrijednost;
    private Red red;
   
    @ManyToOne
    private Polica polica;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }

    public Polica getPolica() {
        return polica;
    }

    public void setPolica(Polica polica) {
        this.polica = polica;
    }
    
     public Red getRed() {
        return red;
    }

    public void setRed(Red red) {
        this.red = red;
    }
    
}
