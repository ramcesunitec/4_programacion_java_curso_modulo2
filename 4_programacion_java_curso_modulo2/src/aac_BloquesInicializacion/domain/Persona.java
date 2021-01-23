
package aac_BloquesInicializacion.domain;

public class Persona {
    private int idPersona;
    private static int contadorPersonas;
    
    static{
        //Se ejecuta solo una vez
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        
    }
    
    {
        //Bloque de inicializacion no estatico, se ejecuta antes del constructor
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona=contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
    
    
    
    
}
