
package aae_AutoboxingUnboxing.Test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes
        /*
        int=Integer
        long= Long
        float= Float
        double= Double
        boolean= Boolean
        byte= Byte
        */
        
        //Autoboxing
        Integer entero=10;
        System.out.println("entero= "+entero);
        System.out.println("entero(String)= "+entero.toString());
        System.out.println("entero(Double)= "+entero.doubleValue());
        
        //Unboxing
        int entero2=entero;
        System.out.println("entero2= "+entero2);
    }
   
}
