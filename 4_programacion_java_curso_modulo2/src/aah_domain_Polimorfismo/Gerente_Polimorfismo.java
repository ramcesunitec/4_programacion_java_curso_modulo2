
package aah_domain_Polimorfismo;




public class Gerente_Polimorfismo extends Empleado_Polimorfismo{
   private String departamento;

    public Gerente_Polimorfismo(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
   
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+"\nDepartamento: "+this.departamento;
    }
   
}
