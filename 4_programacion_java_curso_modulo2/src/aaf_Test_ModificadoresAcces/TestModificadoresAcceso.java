
package aaf_Test_ModificadoresAcces;

import aaf_Paquete1_ModificadoresAcceso.*;
import aaf_Paquete1_ModificadoresAcceso.Clase1_1Protected;
import aaf_Paquete2_ModificadoresAcceso.ClaseHija_1Protected;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1Public clase1=new Clase1Public();//Se puede ocupar la clase por ser publico
        System.out.println("clase1= "+clase1.atributoPublico);
        clase1.metodoPublico();
       
        System.out.println("");
        System.out.println("");
        
        Clase1_1Protected clase1_1=new Clase1_1Protected("Publico"); 
        //No podemos acceder a todo lo que esta protected debido a que test esta fuera del paquete
        System.out.println("");
        
        ClaseHija_1Protected clasehija_1=new ClaseHija_1Protected();
        
        
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("No se puede acceder a Clase1_2 porque esta Clase no esta dentro del mismo paquete por eso seguimos ocupando clase hija");
        ClaseHija_2Default claseHija_2=new ClaseHija_2Default();
        
        
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("Al ser private la Clase1_3Private no tiene parametros para leer en otra clase");
        System.out.println("Ocupamos un contructor publico con un parametro para leer el contructor principal");
        Clase1_3Private clase1_3Private=new Clase1_3Private("Publico");
        
        System.out.println("Ocupamos metodos get y ser para la alterar o leer la variable");
        System.out.println("atributoPrivate: "+clase1_3Private.getAtributoPrivate());
        clase1_3Private.setAtributoPrivate("Cambio de valor private por metodo set");
        System.out.println("atributoPrivate: "+clase1_3Private.getAtributoPrivate());
    }
            
}
