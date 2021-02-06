
package aaj_domain_ConversionObjetos;


public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
