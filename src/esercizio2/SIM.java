/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author AxRos
 */
public class SIM {
   private int numeroTel;
   private double credito;
   private ArrayList<Chiamata> elencoChiamate;
    
  

    public SIM(int numeroTel, double credito, ArrayList<Chiamata> elencoChiamate) {
        this.numeroTel = numeroTel;
        this.credito = credito;
        this.elencoChiamate = elencoChiamate;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public double getCredito() {
        return credito;
    }

    public ArrayList<Chiamata> getElencoChiamate() {
        return elencoChiamate;
    }
    
    void addChiamate(Chiamata chiamata){ // Xchè ui param e sotto no??
        elencoChiamate.add(chiamata);
    }
    
    void totMinuti(){
      
        double minTot=0 ;
        for (Chiamata i : elencoChiamate) {
          minTot= i.getDurata() * minTot;
        }
        System.out.println("\nTot. minuti di chiamate: " + minTot);
    
    }

  void ricercaXnumero(){  //perchè qui nn si può fare return volte???
      String num= "";
      int volte=0;
       Scanner lettore = new Scanner(System.in);
        num = lettore.nextLine();
      for (Chiamata i : elencoChiamate) {
          if( i.getNumeroChiamato() == num);
          volte++;
      }
       System.out.println("\nIl numero " + num + "è stato chiamato " + volte + " volte.");
  }

 String stampaElencoChiamate(){
     String elenco="";
    for (Chiamata i : elencoChiamate) {
                elenco += elencoChiamate;
        }
        return elenco;
    }
 
 
 void stampaInfo() {
        System.out.println(" Numero SIM  " + numeroTel + "\n Credito Residuo: " + credito + "\nELENCO CHIAMATE" + "\n" + stampaElencoChiamate());
    }
 
 
 
}    
  


  
 

//Chiamata c = new Chiamata(1.5, 33876543);
   
  

