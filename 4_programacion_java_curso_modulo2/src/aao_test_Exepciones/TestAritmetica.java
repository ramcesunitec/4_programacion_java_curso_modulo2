package aao_test_Exepciones;
import static aao_artimetica_Exepciones.Artimetica.division;

public class TestAritmetica {
    public static void main(String[] args) {
        int resultado=0;
        try{
            resultado=division(10, 0);
        }catch(Exception e){
            System.out.println("Ocurrio un error: ");
            e.printStackTrace(System.out);
            System.out.println(""+e.getMessage());
        }
        
    }
 
}
