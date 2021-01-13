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
public class Auto extends Veicolo{

    private int porte;
 
    
    public enum Alimentazione{
        benzina,
        diesel;
    }
  
    Alimentazione alimentazione;
    

    public Auto(String marca, int anno, double cilindrata) {
        super(marca, anno, cilindrata);
    }
    
     public Auto(String marca, int anno, double cilindrata, int porte) {
        super(marca, anno, cilindrata);
        this.porte = porte;
    }
     
     public Auto(String marca, int anno, double cilindrata, int porte, Alimentazione alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione= alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    @Override
    public String toString() {
      
        return super.toString() +  " Porte: " + porte + " - Alimentazione: " + alimentazione;
    }

  
     

   
    
     
     
}
