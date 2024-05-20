/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;

/**
 *
 * @author Windows
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled;
      
    public GeometricObject(){
        this.color = "white";
        this.filled = false;
    }
    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "GeometricObject[color=" + color +", filled=" + filled + "]";
    } 
}
