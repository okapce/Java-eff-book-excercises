/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestliterals;

/**
 *
 * @author nickp_000
 */
public class JavaTestLiterals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i1 = 123456789;
        int i2 = 123_456_789;
        System.out.println(i1==i2);
        System.out.println(i2); //gives 123456789
        
        long hexBytes = 0xFF_EC_DE_5E;
        long hexByt_es = 0xFFECDE5E;
        System.out.println(hexBytes+ " "+ hexByt_es);
        System.out.println("nobody\tis with me");//\n does a line jump
        System.out.println("test");
        double dd = 077;
        System.out.println(dd); //gives out 63 -> (7x8+7)
        
        String usuk="usuk";
        boolean result = usuk instanceof String;
        System.out.println("is usuk an instance of String? "+result);
    }
    

}
    

