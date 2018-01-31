/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryleaktestautobox;

/**
 *
 * @author nickp_000
 */
public class MemoryLeakTestAutobox {

   public long addIncremental(long l)
       {
              Long sum=0L; //long runs in 10sec, Long takes minutes and tenured goes up
              
               sum =sum+l;
               return sum;
       }
       public static void main(String[] args) {
              MemoryLeakTestAutobox adder = new MemoryLeakTestAutobox();
              System.out.println("Long max value is : "+Integer.MAX_VALUE);
              for(int i=0;i<2147483647;i++)
              {
                     adder.addIncremental(i);
              }
       }
    
    
}
