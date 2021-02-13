package aap_map_APIJava;

import java.util.*;

public class HashMap {

    public static void main(String[] args) {
        Map miMap = new java.util.HashMap();
        miMap.put("valor1", "Ramces");
        miMap.put("Valor2", "Nancy");
        miMap.put("Valor3", "Santiago");

        String elemento = (String) miMap.get("valor1");
        //System.out.println("elemento=" + elemento);

        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }

    public static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("elemento=" + elemento);
        }

//        coleccion.forEach((elemento) -> {
//            System.out.println("elemento="+elemento);
//        }); 
    }

}
