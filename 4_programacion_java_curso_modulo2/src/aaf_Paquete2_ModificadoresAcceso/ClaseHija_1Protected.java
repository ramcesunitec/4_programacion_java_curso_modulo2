
package aaf_Paquete2_ModificadoresAcceso;

import aaf_Paquete1_ModificadoresAcceso.Clase1_1Protected;


public class ClaseHija_1Protected extends Clase1_1Protected{

    public ClaseHija_1Protected() {
        
        super();
        this.atributoProtected=atributoProtected;
        this.metodoProtected();
              
        System.out.println("atributoProtected= "+this.atributoProtected);
        System.out.println("Por ser Hija de la clase1_1 se pueden acceder a los metodos protected");
    }
    
}
