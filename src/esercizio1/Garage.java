/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;
import java.util.ArrayList;
/**
 *
 * @author AxRos
 */
public class Garage {
   
    
    static ArrayList<Veicolo>VeicoliInGarage = new ArrayList<Veicolo>();

    public void aggiungiVeicolo(Veicolo veicolo) {
    VeicoliInGarage.add(veicolo);
}
    
    public String uscitaVeicolo(int posto){
        VeicoliInGarage.remove(posto);
        return VeicoliInGarage.toString();
    }
    
    void stampaGarage(){
         for (Veicolo i : VeicoliInGarage) {
            System.out.println(i.toString());
         }
    }
    
}
    


 
