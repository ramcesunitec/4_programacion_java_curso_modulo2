package zzz_catalogoPeliculas_LABORATORIOFINAL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import zzz_accesoDatos_LABORATORIOFINAL.accesoDatos;
import zzz_accesoDatos_LABORATORIOFINAL.iAccesoDatos;
import zzz_domain_LABORATORIOFINAL.Pelicula;
import zzz_excepciones_LABORATORIOFINAL.AccesoDatosException;
import zzz_excepciones_LABORATORIOFINAL.LecturaDatosEx;

public class catalogoPeliculas implements iCatalgoPelicula {

    private static String mensaje;
    private final iAccesoDatos datos;
    accesoDatos ad = new accesoDatos();

    public catalogoPeliculas() {
        this.datos = new accesoDatos();
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_ARCHIVO)) {
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
                this.mensaje = "Archivo creado";

            } else {
                datos.crear(NOMBRE_ARCHIVO);
                this.mensaje = "Archivo creado";
            }
        } catch (AccesoDatosException ex) {
            System.out.println("Error al iniciar catalogos de peliculas");
            ex.printStackTrace(System.out);
        }
        System.out.println("MENSAJE " + getMensaje());
    }

    @Override
    public void agregarPeliculas(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_ARCHIVO);
            datos.escribir(pelicula, NOMBRE_ARCHIVO, anexar);
            this.mensaje = ad.getMensaje();
        } catch (AccesoDatosException ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPelicula() {
        this.mensaje = "";
        try {
            var peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            for (var pelicula : peliculas) {
                System.out.println("Pelicula= " + pelicula + "\n");
                this.mensaje = mensaje + " Pelicula= " + pelicula;
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_ARCHIVO, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }

        if (resultado == null) {
            System.out.println("Pelicula no encontrada");
            this.mensaje = "Pelicula no encontrada, favor de agregar";
        } else {
            System.out.println("Resultado= " + resultado);
            this.mensaje = "Resultado= " + resultado;
        }
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
