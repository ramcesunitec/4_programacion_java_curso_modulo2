
package aaj_domain_ConversionObjetos;





public class EmpleadoConversionObj {
    protected String nombre;
    protected double sueldo;

    public EmpleadoConversionObj(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+"\nSueldo: "+this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
            
    
    
}
