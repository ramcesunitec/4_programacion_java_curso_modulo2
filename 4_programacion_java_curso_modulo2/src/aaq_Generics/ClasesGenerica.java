package aaq_Generics;

public class ClasesGenerica<T> {
    
    T objeto;

    public ClasesGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+objeto.getClass().getSimpleName());
    }
    
}
