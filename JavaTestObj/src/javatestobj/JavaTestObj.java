/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestobj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nickp_000
 */
public class JavaTestObj {

static int[] testarray = {6, 8, 9};
static List<Integer> lista = new ArrayList<>();


    public static void main(String[] args) {
        long startTime = System.nanoTime();

        lista.add(testarray[0]);
        lista.add(testarray[2]);
        System.out.println(lista);
        lista.set(1, testarray[1]);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        //for (int i = 0; i < 10; i++) {
          //  String s = new String("Bikini");
            //System.out.println(s);
            //String a = "bikini";
             //System.out.println(a);
        //}
        
        String a1 = "teepeeTL";
        String a2 = "teepeetl";
        String a3 = "teepeeTL";
        String a4 = "teepee";
        String a5 = "1teepee";
        
        int result = a4.compareTo(a5);
        if(result==0){
            System.out.println("Match ");
        }else{
            System.out.println("Not match ... result is "+result);
        }
        
        System.out.println("Max value byte: "+Byte.MAX_VALUE);
        System.out.println("Max value Short: "+Short.MAX_VALUE);
        System.out.println("Max value Long: "+Long.MAX_VALUE);
        System.out.println("Max value Int: "+Integer.MAX_VALUE);
        System.out.println("Max value float: "+Float.MAX_VALUE);
        System.out.println("Max value double: "+Double.MAX_VALUE);
                

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Duration: "+duration);
            
            
        }
        
        
    }
    

