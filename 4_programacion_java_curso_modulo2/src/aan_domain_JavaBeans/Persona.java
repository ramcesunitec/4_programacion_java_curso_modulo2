/*
    Para que una clase se considere JavaBean debe cumplir las siguientes caracteristicas:
    *Un constructor vacio
    *Cada tributo debe ser privado con metodo get y set
    *Y una interface Serializable 
 */
package aan_domain_JavaBeans;

import java.io.Serializable;


public class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
        
}
