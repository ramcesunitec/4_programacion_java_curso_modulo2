package aar_test_archivos;

import aar_archivos.Manejo_Archivos;

/**
 *
 * @author ramce
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo="prueba.txt";
        //Manejo_Archivos.crearArchivo(nombreArchivo);   Se crea el archivo
        
        Manejo_Archivos.escribirArchivo(nombreArchivo, "Hola desde Java"); //Se  inserta informacion al archivo
//        Manejo_Archivos.escribirArchivo(nombreArchivo, "Adios");  //Se inserta informacion al archivo pero se pierde la informacion que tenia
        
        Manejo_Archivos.anexarArchivo(nombreArchivo, "Adios desde Java"); //La informacion no se pierde solo se anexa 
        
        Manejo_Archivos.leerArchivo(nombreArchivo);//Se lee el archivo
    }
            
}
