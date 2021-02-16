package zzz_catalogoPeliculas_LABORATORIOFINAL;

public interface iCatalgoPelicula {
    
    String NOMBRE_ARCHIVO="peliculas.txt";
    
    void iniciarCatalogoPeliculas();
    void agregarPeliculas(String nombrePelicula);
    void listarPelicula();
    void buscarPeliculas(String buscar);
    
    
}
