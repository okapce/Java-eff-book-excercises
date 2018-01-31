/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbargetest;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/**
 *
 * @author nickp_000
 */
public class ClassLoaderLeakExample {
static Scanner leer = new Scanner(System.in);
String inpu = leer.next();

    public static void main(String[] args) throws InterruptedException, IOException {
       
        
        //long startTime = System.currentTimeMillis(); //fetch starting time
        //while((System.currentTimeMillis()-startTime)<100000)
        //{
            //System.out.println("Ingrese: ");
            //String inpu = leer.next();  
            String one, two;
            one = "a";
            String three = one;
            two = "b";
            one = two;
            
            //one = null; //null out reference
            System.out.println(one+", "+two+" and "+three+" is being used");
            //System.in.read();
        //}
        System.out.println("Terminating");
            

        
        
  
        
        
        //System.out.println("Press to continue");
        //System.in.read();
        
       
        //TimeUnit.SECONDS.sleep(1);
        

    }
}
//}
    

