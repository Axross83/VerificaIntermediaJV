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
public class Decespugliatori extends Macchina{
    
    Boolean accElettronica;

    public Decespugliatori(String marca, ArrayList<Riparazione> elencoRip, Boolean accEletttronica) {
        super(marca, elencoRip);
        this.accElettronica = accEletttronica;
    }

    public Boolean getAccElettronica() {
        return accElettronica;
    }
    
    
}
