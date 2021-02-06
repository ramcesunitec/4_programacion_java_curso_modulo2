
package aai_domain_InstanceOf;




public class GerenteInstance extends EmpleadoInstance{
   private String departamento;

    public GerenteInstance(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
   
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+"\nDepartamento: "+this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
   
}
