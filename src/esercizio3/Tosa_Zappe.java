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
public class Tosa_Zappe extends Macchina{
    
     public enum Ruote{
        due,
        quattro;
    }
  
    Ruote ruote;
    
    public Tosa_Zappe(String marca, ArrayList<Riparazione> elencoRip, Ruote ruote) {
        super( marca, elencoRip);
        this.ruote= ruote;
    }

    public Ruote getRuote() {
        return ruote;
    }
    
    
    
}
