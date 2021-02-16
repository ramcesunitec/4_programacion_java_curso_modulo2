package zzz_accesoDatos_LABORATORIOFINAL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import zzz_domain_LABORATORIOFINAL.Pelicula;
import zzz_excepciones_LABORATORIOFINAL.AccesoDatosException;
import zzz_excepciones_LABORATORIOFINAL.EscrituraDatosEx;
import zzz_excepciones_LABORATORIOFINAL.LecturaDatosEx;

public class accesoDatos implements iAccesoDatos{

    private static String mensaje;

    public accesoDatos() {
    }
    
    
    
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosException {
        File archivo=new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo=new File(nombreArchivo);
        List<Pelicula> peliculas=new ArrayList<>();
        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String linea=null;
            linea=entrada.readLine();
            while(linea!=null){
                Pelicula pelicula=new Pelicula(linea);
                peliculas.add(pelicula);
                linea=entrada.readLine();
            }
            entrada.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Exception al listar peliculas "+ex.getMessage());
        }
        
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo=new File(nombreArchivo);
        try {
            var salida=new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();
            this.mensaje="Se ha insertado correctamente la pelicula";
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Exception al escribir peliculas "+ex.getMessage());
        }
        
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo=new File(nombreArchivo);
        String resultado=null;
        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String linea=null;
            linea=entrada.readLine();
            int indice=1;
            while(linea!=null){
                if(buscar !=null&&buscar.equalsIgnoreCase(linea)){
                    resultado="Pelicula encontrada "+linea+" encontrada en el indice "+indice;
                    break;
                }
                linea=entrada.readLine();
                indice++;
            }
        entrada.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Exception al buscar pelicula "+ex.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosException {
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida=new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
            this.mensaje="Se ha creado el archivo";
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosException("Exception al buscar pelicula "+ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosException {
        File archivo=new File(nombreArchivo);
        if(archivo.exists()){
        archivo.delete();
            System.out.println("Se ha borrado el archivo");
            this.mensaje="Se ha borrado el archivo";
        }
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
