/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author AxRos
 */
public class Furgone extends Veicolo{
    private int capacita;

    public Furgone(String marca, int anno, double cilindrata, int capacita) {
        super(marca, anno, cilindrata);
        this.capacita=capacita;
    }

    @Override
    public String toString() {
        return "Furgone{" + "capacita=" + capacita + '}';
    }
    
    
}
