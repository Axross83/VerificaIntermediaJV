/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author AxRos
 */
public class Riparazione {
    
    String riparazione;
    double costoRip;

    public Riparazione(String riparazione, double costoRip) {
        this.riparazione = riparazione;
        this.costoRip = costoRip;
    }

    public String getRiparazione() {
        return riparazione;
    }

    public void setRiparazione(String riparazione) {
        this.riparazione = riparazione;
    }

    public double getCostoRip() {
        return costoRip;
    }

    public void setCostoRip(double costoRip) {
        this.costoRip = costoRip;
    }
    
 
    
}
