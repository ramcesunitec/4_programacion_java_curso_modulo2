
package aaf_Paquete1_ModificadoresAcceso;


   public class Clase1_3Private {
    //Private
   
   private String atributoPrivate="Valor atributo privado";

    private Clase1_3Private() {
        System.out.println("Constructor privado");
    }
    
    public Clase1_3Private(String arg) {
        this();
        System.out.println("Constructor publico");
    }
       
    private void metodoPrivate(){
        System.out.println("Metodo private");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
