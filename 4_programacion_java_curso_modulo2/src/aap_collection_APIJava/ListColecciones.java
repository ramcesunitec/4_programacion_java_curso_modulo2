//List permite guardar elementos en el orden en el que se ingresan los datos y permiten duplicar elementos

package aap_collection_APIJava;

import java.util.*;

public class ListColecciones {
    public static void main(String[] args) {
        List miLista=new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        for(Object elemento:miLista){
            System.out.println("Elemento="+elemento);
        }
        
        miLista.forEach((elemento) -> {
            System.out.println("Elemento="+elemento);
        });
        
        
    }
}
