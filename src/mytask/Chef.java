/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytask;


/**
 *
 * @author bende
 */
public class Chef implements Runnable {
    
    private Table t;
    
    
    
    public Chef(Table t){
        this.t = t;
        System.out.println("chef llegit");
    }
    @Override
    public void run() {        
        while(true){
//            System.out.println("Estat de thread client: " +tcl1.getState());
            try {
                t.placeMeal();
            } catch (InterruptedException ex) {
            }
        }
    }
}
