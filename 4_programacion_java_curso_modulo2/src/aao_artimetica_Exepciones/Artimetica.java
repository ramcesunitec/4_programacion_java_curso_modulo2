
package aao_artimetica_Exepciones;

import aao_test_Exepciones.Operacion_Excepcion;

public class Artimetica {
    public static int division(int numerador, int denominador) throws Operacion_Excepcion{
        if(denominador==0){
            throw new Operacion_Excepcion("Division entre 0");
        }
        
        return numerador/denominador;
    }
}
