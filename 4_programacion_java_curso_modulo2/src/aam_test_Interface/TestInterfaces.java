
package aam_test_Interface;

import aam_Interface.ImplementacionMySql;
import aam_Interface.ImplementacionOracle;
import aam_Interface.iAccesoDatos;

public class TestInterfaces {
    public static void main(String[] args) {
        iAccesoDatos datos=new ImplementacionMySql();
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
        
        imprimir(datos);
        
        datos=new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
        
        imprimir(datos);
    }
    
    public static void imprimir(iAccesoDatos datos){
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
    }
}
