/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethodex;

/**
 *
 * @author Shoaib
 */
public abstract class House {
    
public void buildFoundation(){
    System.out.println("Building Foundation");
}    
 public void buildFloor(){
     System.out.println("Putting Floors");
 }   
    
 public abstract void buildWalls();
 public abstract void addWindows();
 
 public final void buildHouse(){
     buildFoundation();
     buildFloor();
     buildWalls();
     addWindows();
     System.out.println("House Built");
 }
    
}// end of Class
