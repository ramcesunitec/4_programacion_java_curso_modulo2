
package aal_test_ClasesAbstractras;

import aal_domain_ClasesAbstractras.FiguraGeometrica;
import aal_domain_ClasesAbstractras.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //No se puede crear objetos clase padre pero si hija
        
        FiguraGeometrica figura=new Rectangulo("Rectangulo");
        figura.dibujar();
        
    }
}
