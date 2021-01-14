
package aaa_ArgumentosVariables_Test;


public class TestArgumentoVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5,6);
        imprimirNumeros(1,2);
        
        variosParametros("Ramces", 8,9,10);
        variosParametros("Nancy", 1,2,3);
        
    }
    
    private static void variosParametros(String nombre, int...numeros){ //El argumento variable debe ser el ultimo parametro
        System.out.println("Nombre= "+nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int...numeros){ //... Quieren decir que ocuparemos argumentos variables, se trata igual que un arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+numeros[i]);
        }
    }
}
