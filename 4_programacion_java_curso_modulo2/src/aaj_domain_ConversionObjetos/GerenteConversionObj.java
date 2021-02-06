
package aaj_domain_ConversionObjetos;

public class GerenteConversionObj extends EmpleadoConversionObj{
   private String departamento;

    public GerenteConversionObj(String departamento, String nombre, double sueldo) {
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
