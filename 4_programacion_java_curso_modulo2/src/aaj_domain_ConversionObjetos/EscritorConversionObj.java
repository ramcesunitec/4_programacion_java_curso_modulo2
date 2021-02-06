
package aaj_domain_ConversionObjetos;

public class EscritorConversionObj extends EmpleadoConversionObj{
    
    final TipoEscritura tipoEscritura;

    public EscritorConversionObj(TipoEscritura tipoEscritura, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return "Empleado escritor\n"+super.obtenerDetalles()+"\ntipoEscritura= "+tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
}
