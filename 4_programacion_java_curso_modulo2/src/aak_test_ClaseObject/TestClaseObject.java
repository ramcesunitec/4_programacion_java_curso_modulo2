package aak_test_ClaseObject;

import aak_domain_ClaseObject.EmpleadoClaseObj;

public class TestClaseObject {

    public static void main(String[] args) {
        EmpleadoClaseObj eco1 = new EmpleadoClaseObj("Ramces", 15000);
        EmpleadoClaseObj eco2 = new EmpleadoClaseObj("ramces", 15000);

        if (eco1 == eco2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if(eco1.equals(eco2)){
            System.out.println("Los objetos son iguales en contenido");
        }else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        if(eco1.hashCode()==eco2.hashCode()){
            System.out.println("El valor hashcode es igual");
        }else{
            System.out.println("El valor hashcode es distinto");
                    
        }
    }
}
