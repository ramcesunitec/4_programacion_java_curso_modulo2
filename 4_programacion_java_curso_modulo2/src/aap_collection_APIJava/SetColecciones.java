//Set guardara elementos en diferente orden de como se ingresan y no permiten duplicar elementos

package aap_collection_APIJava;

import java.util.*;

public class SetColecciones {
    public static void main(String[] args) {
        Set miSet=new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        
        imprimir(miSet);
        
        
    }
    
    public static void imprimir(Collection coleccion){
        for(Object elemento:coleccion){
           System.out.println("elemento="+elemento);
       } 
        
//        coleccion.forEach((elemento) -> {
//            System.out.println("elemento="+elemento);
//        }); 
    }
    
 
}
