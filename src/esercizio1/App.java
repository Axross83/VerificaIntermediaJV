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
public class App {
    
    
    public static void main(String args[]){
        
        Garage garage = new Garage();
        
        Veicolo veicolo0 = new Veicolo("Fiat", 1993, 11);
        Garage.VeicoliInGarage.add(veicolo0);
        Veicolo veicolo1 = new Veicolo("Audi", 2011, 18);
        Garage.VeicoliInGarage.add(veicolo1);
        Veicolo veicolo2 = new Veicolo("Porche", 1983, 22);
        Garage.VeicoliInGarage.add(veicolo2);
        
       Veicolo veicolo3= new Veicolo("Aprilia", 2000, 8);
   
        
       garage.aggiungiVeicolo(veicolo3);
       
       garage.uscitaVeicolo(1);
               
        garage.stampaGarage();
    }
    
}
