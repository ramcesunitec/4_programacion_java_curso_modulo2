
package aao_artimetica_Exepciones;


import aao_test_Exepciones.Operacion_RunTimeExcepcion;

public class ArtimeticaRunTimeException {
    public static int division(int numerador, int denominador) {
        if(denominador==0){
            throw new Operacion_RunTimeExcepcion("Division entre 0");
        }
        
        return numerador/denominador;
    }
}
