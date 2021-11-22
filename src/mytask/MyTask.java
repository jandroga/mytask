/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mytask;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import mytask.Client;
import mytask.Chef;
import mytask.Viewer;


/**
 *
 * @author bende
 */
public class MyTask extends JFrame {
    
    private Client client;
    private Chef chef;
    private Viewer v;
    private Boolean clientState;
    
    public MyTask(){
        
        super("Ristorante");
        this.setLayout(new GridBagLayout());
        this.setSize(800, 400);
        //this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
        Table t = new Table();
        
        client = new Client(t);
        chef = new Chef(t);
        v = new Viewer(t);
        Thread tcl1 = new Thread(client);
        System.out.println("Estat de thread client: " +tcl1.getState());
        tcl1.start();
        System.out.println("Estat de thread client: " +tcl1.getState());
        
        Thread tch1 = new Thread(chef);
        tch1.start();
        
        Thread tv = new Thread(v);
        tv.start();
        
    
//    public boolean getState(Thread tcl1){
//        
//        
//        Thread.State state = tcl1.getState();
//        System.out.println("Estat thread: " + state);
//        return true;
    }
    
   
    public static void main(String[] args){
        // TODO code application logic here
        new MyTask();
        //stateClient(tcl1);
        //estatChef();
        //getState();
    }
    
}
