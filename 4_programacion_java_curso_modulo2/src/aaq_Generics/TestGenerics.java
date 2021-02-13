package aaq_Generics;

public class TestGenerics {
    public static void main(String[] args) {
        ClasesGenerica<Integer> objeto=new ClasesGenerica(15);
        objeto.obtenerTipo();
        
        ClasesGenerica<String> objectoString=new ClasesGenerica("Ramces");
        objectoString.obtenerTipo();
    }
}
