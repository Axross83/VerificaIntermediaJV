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
    
    public Veicolo uscitaVeicolo(int posto){
        Veicolo veicolo= VeicoliInGarage.get(posto); // X sapere che parcheggio si libera
        VeicoliInGarage.remove(posto);
        return veicolo; // ritorna il posto lasciato libero
    }
    
    void stampaGarage(){
         for (int posto =0; posto < VeicoliInGarage.size(); posto++) {
            System.out.println("Posto: " + posto);
            System.out.println(VeicoliInGarage.get(posto));
             System.out.println("-------------------------");
         }
    }
    
}
    


 
