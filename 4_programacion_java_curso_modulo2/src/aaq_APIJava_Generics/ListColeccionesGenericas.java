package aaq_APIJava_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista=new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        
        
        imprimir(miLista);
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
