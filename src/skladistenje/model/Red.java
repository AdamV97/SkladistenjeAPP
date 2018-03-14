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
public class Red implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String duzina;
    private String visina;
    private String sirina;
    private String oznaka;
    
    @ManyToOne
    private Skladiste skladiste;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDuzina() {
        return duzina;
    }

    public void setDuzina(String duzina) {
        this.duzina = duzina;
    }

    public String getVisina() {
        return visina;
    }

    public void setVisina(String visina) {
        this.visina = visina;
    }

    public String getSirina() {
        return sirina;
    }

    public void setSirina(String sirina) {
        this.sirina = sirina;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public Skladiste getSkladiste() {
        return skladiste;
    }

    public void setSkladiste(Skladiste skladiste) {
        this.skladiste = skladiste;
    }
    
    @Override
    public String toString() {
        return getOznaka();
    }
    
}
