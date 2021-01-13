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
public class Veicolo {
   private String marca;
   private int anno;
   private double cilindrata;

    public Veicolo(String marca, int anno, double cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }
   

    
   @Override 
   public String toString() {
        String ris = "";
        ris += "Marca: " + marca + " - Anno: " + anno+ " - Cilindrara: " + cilindrata;
        return ris;
    }
   
}
