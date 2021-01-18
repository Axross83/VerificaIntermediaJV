/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author AxRos
 */
public class Chiamata {
    
    double durata;
    String numeroChiamato;

    public Chiamata(double durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }
    
    
    

    public double getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }
    
    
    
}
