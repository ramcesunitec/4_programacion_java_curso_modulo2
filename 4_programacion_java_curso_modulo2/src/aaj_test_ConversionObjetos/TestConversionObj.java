package aaj_test_ConversionObjetos;

import aaj_domain_ConversionObjetos.*;


public class TestConversionObj {

    public static void main(String[] args) {
        EmpleadoConversionObj eco;

        eco = new EscritorConversionObj(TipoEscritura.CLASICO, "Ramces", 15000);

        System.out.println(eco.obtenerDetalles());

        //downcastig
        ((EscritorConversionObj) eco).getTipoEscritura();

        EscritorConversionObj escritorConversionObj = (EscritorConversionObj) eco;
        escritorConversionObj.getTipoEscritura();

        //Upcasting
        EmpleadoConversionObj eco2 = escritorConversionObj;

    }
}
