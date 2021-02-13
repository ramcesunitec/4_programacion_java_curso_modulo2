package aaq_APIJava_Generics;

import static aap_map_APIJava.HashMap.imprimir;
import java.util.Collection;
import java.util.Map;

public class HashMapGenericas {
    public static void main(String[] args) {
        Map<String,String> miMap = new java.util.HashMap<>();
        miMap.put("valor1", "Ramces");
        miMap.put("Valor2", "Nancy");
        miMap.put("Valor3", "Santiago");
        miMap.put("Valor3", "Lulu");

        String elementoMapa = miMap.get("valor3");
        //System.out.println("elemento=" + elementoMapa);

        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }
    
     public static void imprimir(Collection<String> coleccion) {
        for (String elemento : coleccion) {
            System.out.println("elemento=" + elemento);
        }

//        coleccion.forEach((elemento) -> {
//            System.out.println("elemento="+elemento);
//        }); 
    }
}
