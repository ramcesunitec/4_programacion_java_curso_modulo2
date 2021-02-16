package zzz_accesoDatos_LABORATORIOFINAL;

import java.util.List;
import zzz_domain_LABORATORIOFINAL.Pelicula;
import zzz_excepciones_LABORATORIOFINAL.AccesoDatosException;
import zzz_excepciones_LABORATORIOFINAL.EscrituraDatosEx;
import zzz_excepciones_LABORATORIOFINAL.LecturaDatosEx;

public interface iAccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosException;
    
    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula,String nombreArchivo, boolean anexar)throws EscrituraDatosEx;
    
    String buscar(String nombreArchivo,String buscar) throws LecturaDatosEx;
    
    void crear(String nombreArchivo) throws AccesoDatosException;
    
    void borrar(String nombreArchivo) throws AccesoDatosException;
    
    
    
}
