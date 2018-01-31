/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egret;

/**
 *
 * @author nickp_000
 */
public class Egret {

    private String color;
    public Egret(){color="white";}
//this("white"); doesn't do anything, e.color=null
    public Egret(String color){
        color = color;
    }
    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color: "+e.color);
    }
    
}
