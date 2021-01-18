/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;

/**
 *
 * @author AxRos
 */
public class Macchina {
    
   private static int numOrdine;
   private String marca;
   private ArrayList<Riparazione> elencoRip;

    public Macchina( String marca, ArrayList<Riparazione> elencoRip) {
        numOrdine++;
        this.marca = marca;
        this.elencoRip = elencoRip;
    }

    
    
    public int getNumOrdine() {
        return numOrdine;
    }

    public void setNumOrdine(int numOrdine) {
        this.numOrdine = numOrdine;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Riparazione> getElencoRip() {
        return elencoRip;
    }

    public void setElencoRip(ArrayList<Riparazione> elencoRip) {
        this.elencoRip = elencoRip;
    }
    
    
    
    
    double totRip() {
        double rip = 0; 
        for (Riparazione i : elencoRip) {            
                rip += i.getCostoRip();
        }
        return rip;
    }
}
