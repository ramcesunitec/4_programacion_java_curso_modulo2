
package aaf_Paquete1_ModificadoresAcceso;


public class Clase1_1Protected {
    //public se puede ocupar en cualquier lado del proyecto
   protected String atributoProtected="Valor atributo protected";

    protected Clase1_1Protected() {
        System.out.println("Constructor protected");
    }
    
    public Clase1_1Protected(String arg) {
        System.out.println("Constructor publico con un argumento para poder entrar a la clase ya que protected no lo permite porque esta fuera del paquete");
    }
   
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
