/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytask;

/**
 *
 * @author bende
 */
public class Client implements Runnable {
   
    private Table t;
    
    public Client(Table t){
        this.t = t; //t és nul, o sigui que se li passa sa taula de s'altra classe
        System.out.println("a");

    }

    
    @Override
    public void run() {
        while(true){
        try {
            t.takeMeal();
        } catch(InterruptedException e){
        }
    }
    }
    
}
    
    

