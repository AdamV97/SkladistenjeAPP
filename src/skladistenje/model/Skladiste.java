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
public class Skladiste implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String povrsina;
    private String adresa;
   
    @ManyToOne
    private Trgovina trgovina;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(String povrsina) {
        this.povrsina = povrsina;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Trgovina getTrgovina() {
        return trgovina;
    }

    public void setTrgovina(Trgovina trgovina) {
        this.trgovina = trgovina;
    }
}
