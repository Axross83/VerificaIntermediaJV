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
public class Moto extends Veicolo {
   private int tempi;    

    public Moto(String marca, int anno, double cilindrata) {
        super(marca, anno, cilindrata);
    }
    
      public Moto(String marca, int anno, double cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi=tempi;
    }

    @Override
    public String toString() {
        return "Moto{" + "tempi=" + tempi + '}';
    }
      
      
}
