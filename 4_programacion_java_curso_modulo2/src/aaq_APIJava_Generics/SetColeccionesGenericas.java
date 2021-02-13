package aaq_APIJava_Generics;

import static aap_collection_APIJava.SetColecciones.imprimir;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetColeccionesGenericas {
    public static void main(String[] args) {
        Set<String> miSet=new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        
        imprimir(miSet);
    }
    
    public static void imprimir(Collection<String> coleccion){
        for(Object elemento:coleccion){
           System.out.println("elemento="+elemento);
       } 
        
//        coleccion.forEach((elemento) -> {
//            System.out.println("elemento="+elemento);
//        }); 
    }
}
