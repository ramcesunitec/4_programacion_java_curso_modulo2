package aao_test_Exepciones;

public class TestExcepciones {
    public static void main(String[] args) {
        int division=0;
        try{
            division=10/0;
           
        }catch(Exception e){
            System.out.println("Ocurrio un error: ");
            e.printStackTrace(System.out);
        }
        
        finally{
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("Resultado: "+division);
    }
            
            
}
