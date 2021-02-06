package aai_test_InstanceOf;

import aai_domain_InstanceOf.EmpleadoInstance;
import aai_domain_InstanceOf.GerenteInstance;

public class TestInstanceOf {
    public static void main(String[] args) {
        EmpleadoInstance ei=new EmpleadoInstance("Ramces", 15000);
        determinarTipo(ei);
        ei=new GerenteInstance("Docente", "Nancy", 20000);
        determinarTipo(ei);
    }
    
    
    public static void determinarTipo(EmpleadoInstance empleadoInstance){
        if(empleadoInstance instanceof GerenteInstance){
            System.out.println("Es tipo Gerente");
            GerenteInstance gerente=(GerenteInstance)empleadoInstance;
            System.out.println("Departamento de gerente= "+gerente.getDepartamento());
        }else if(empleadoInstance instanceof EmpleadoInstance){
            System.out.println("Es tipo Empleado(Padre)");
            System.out.println("empleado="+empleadoInstance.getNombre());
        }else if(empleadoInstance instanceof Object){
            System.out.println("Es tipo Object");
        }
    }
}
