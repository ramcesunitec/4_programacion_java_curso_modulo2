
package aah_test_Polimorfismo;

import aah_domain_Polimorfismo.Empleado_Polimorfismo;
import aah_domain_Polimorfismo.Gerente_Polimorfismo;



public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado_Polimorfismo empleado_Polimorfismo=new Empleado_Polimorfismo("Ramces", 15000);
        //System.out.println("empleado: \n"+empleado_Polimorfismo.obtenerDetalles());
        imprimir(empleado_Polimorfismo);
        
        System.out.println("");
        
        Gerente_Polimorfismo gerente_Polimorfismo=new Gerente_Polimorfismo("Docente","Nancy", 20000);
        //System.out.println("gerente: \n"+gerente_Polimorfismo.obtenerDetalles());
        imprimir(gerente_Polimorfismo);
    }
    
    public static void imprimir(Empleado_Polimorfismo empleado){
        System.out.println("Empleado=\n"+empleado.obtenerDetalles());
        
    }
    
}
