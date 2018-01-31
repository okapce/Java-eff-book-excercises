/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryleaktestlist;

/**
 *
 * @author nickp_000
 */
public class MemoryLeakTestList {
        
       private int maxSize;
       private int[] stackArray;
       private int pointer;
       public MemoryLeakTestList(int s) {
              maxSize = s;
              stackArray = new int[maxSize];
              pointer = -1;
       }
       public void push(int j) {
              stackArray[++pointer] = j;
       }
       public int pop() {
              return stackArray[pointer--];
       }
       public int peek() {
              return stackArray[pointer];
       }
       public boolean isEmpty() {
              return (pointer == -1);
       }
       public boolean isFull() {
              return (pointer == maxSize - 1);
       }
       public static void main(String[] args) {
              MemoryLeakTestList stack = new MemoryLeakTestList(200000);
              for(int i=0;i<200000;i++)
              {
                     stack.push(i);
              }
              for(int i=0;i<200000;i++)
              {
                     int element = stack.pop();
                     System.out.println("Poped element is "+ element);
              }
       }

}
