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
    private String alimentazione;
    private int porte;

    public Auto(String marca, int anno, double cilindrata) {
        super(marca, anno, cilindrata);
    }
    
     public Auto(String marca, int anno, double cilindrata, int porte) {
        super(marca, anno, cilindrata);
        this.porte=porte;
    }

    @Override
    public String toString() {
        return "Auto{" + "alimentazione=" + alimentazione + ", porte=" + porte + '}';
    }
    
     
     
}
