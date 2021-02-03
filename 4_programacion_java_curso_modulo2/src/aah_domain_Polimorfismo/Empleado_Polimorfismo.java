
package aah_domain_Polimorfismo;



public class Empleado_Polimorfismo {
    protected String nombre;
    protected double sueldo;

    public Empleado_Polimorfismo(String nombre, double sueldo) {
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
