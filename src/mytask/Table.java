/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytask;

import java.util.LinkedList;
import java.util.Queue;
import javafx.scene.AccessibleAction;




/**
 *
 * @author bende
 */
public class Table {
    
    private int mealsMax = 10;
    
    private int mealsOnTable = 0;
    
//    public Table(){
//        
//        
//        }
    
//        public void prepararTaula(){
//        Client cl = new Client(this);
//        Chef cf = new Chef(this);
//        Thread t1 = new Thread(cl);
//        Thread t2 = new Thread(cf);
//          
//    }
    
    public synchronized void placeMeal() throws InterruptedException{//Cooking meal cap a s'altra banda, classe Chef
        if(espaiTaula()) {
            System.out.println("Chef preparant menjar");
            mealsOnTable++;
            notifyAll();
        } else {
            System.out.println("Chef esperant a que se buidi sa taula");
            wait();
        }
        Thread.sleep(500);
        System.out.println("Menjar llest! Deixant-lo a sa taula, hi ha " + (mealsOnTable) + " plats");
    }
    
    public synchronized void takeMeal() throws InterruptedException{
        //getEspaiTaula();
        notifyAll();
        if(mealsOnTable>0){
            mealsOnTable--;
            
            System.out.println("El client ha agafat un plat de la taula, ara en queden "+mealsOnTable);}
        else{System.out.println("Els clients no han trobat menjar");
        wait();
        }
        Thread.sleep(500);
        
    }
   
    
    public boolean espaiTaula(){
        return mealsOnTable<mealsMax;
    }

    
    //synchronized long BlockingQueue(){}
    
    
    /*
    Synchronize sense thread ni ná aquí
    Crear arraylist on placeMeal i takeMeal fiquin i llevin
    un número d'ordre. Una queue. 
    */
}