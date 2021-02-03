
package aag_domain_Sobreescritura;


public class Gerente extends Empleado{
   private String departamento;

    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
   
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+"\nDepartamento: "+this.departamento;
    }
   
}
