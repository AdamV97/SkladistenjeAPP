/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladistenje.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
    private BigDecimal masa;
    private String oznaka;
    private BigDecimal vrijednost;
   
    @ManyToOne
    private Polica polica;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public BigDecimal getMasa() {
        return masa;
    }

    public void setMasa(BigDecimal masa) {
        this.masa = masa;
    }

    public BigDecimal getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(BigDecimal vrijednost) {
        this.vrijednost = vrijednost;
    }

    public Polica getPolica() {
        return polica;
    }

    public void setPolica(Polica polica) {
        this.polica = polica;
    }
    @Override
    public String toString() {
        return getOznaka();
    }
    
}
