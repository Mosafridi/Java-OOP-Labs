/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemethodex;

/**
 *
 * @author Shoaib
 */
public class HouseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      System.out.println("Wooden House built");
      House house1 = new WoodenHouse();
      house1.buildHouse();
     
      System.out.println("Glass House built");
      House house2 = new GlassHouse();
      house2.buildHouse();
        
        
        
    }// end of main
    
}// end of class
