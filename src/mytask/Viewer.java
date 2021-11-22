/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mytask;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import mytask.Chef;
import mytask.Client;
import mytask.Table;

/**
 *
 * @author bende
 */
public class Viewer extends Canvas implements Runnable{
    
    private Table t;
    
    private BufferedImage plat;
    private BufferedImage cuiner;
    private BufferedImage cliente;
    
    public Viewer(Table t){
        this.t = t;
        setSize(400,400);
        setVisible(true);
        System.out.println("viewer in");
        //g.paint();
    }
    
    @Override
    public void paint(Graphics g){
        //if()
        
//        super.paint(g);
//        Graphics2D draw = (Graphics2D) g;
//        draw.setColor(Color.GREEN);
//        g.setColor(Color.BLACK);
//        g.drawImage(cuiner,0,0 200, 200);
//        System.out.println("paint in");
   
    /*
    Posar cada imatge a lloc amb finestretes damunt es fons i després
    anar posant es llumets dins es viewer amb cada objecte responent a un
    thread
    */}
    private void getImages(){
    
        try{
            plat = ImageIO.read(new File("res/plat.jpg"));
            cuiner = ImageIO.read(new File("res/cuiner.jpg"));
            cliente = ImageIO.read(new File("res/cliente.jpg"));
        
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void estatClient(MyTask tcl1){
        System.out.println("Estat de thread client: " +tcl1.getState());
    }
    
    


    @Override
    public void run(){

        while (true) {
            //System.out.println("e");
            if (this.getGraphics() != null){
                paint(this.getGraphics());
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
