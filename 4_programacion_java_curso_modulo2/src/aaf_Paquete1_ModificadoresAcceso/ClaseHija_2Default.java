
package aaf_Paquete1_ModificadoresAcceso;

import aaf_Paquete2_ModificadoresAcceso.*;
import aaf_Paquete1_ModificadoresAcceso.Clase1_1Protected;


public class ClaseHija_2Default extends Clase1_2Default{

    public ClaseHija_2Default() {
        
        super();
        this.atributoDefault=atributoDefault;
        this.metodoDefault();
              
        System.out.println("atributoProtected= "+this.atributoDefault);
        System.out.println("En este caso por ser default la clase Hija debe de estar en el mismo paquete que el Padre para que se pueda acceder a la clase Padre");
    }
    
}
