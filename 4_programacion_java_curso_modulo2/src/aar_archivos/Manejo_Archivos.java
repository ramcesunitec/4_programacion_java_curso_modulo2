package aar_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Manejo_Archivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado informacion al archivo");
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace(System.out);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.out);
//        }       
    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String lectura=entrada.readLine();
            while(lectura!=null){
                System.out.println("Lectura="+lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
