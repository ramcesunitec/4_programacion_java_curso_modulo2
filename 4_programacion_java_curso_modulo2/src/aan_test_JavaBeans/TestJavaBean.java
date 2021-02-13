package aan_test_JavaBeans;

import aan_domain_JavaBeans.Persona;

public class TestJavaBean {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Ramces");
        persona.setApellido("Frutos");
        
        System.out.println("Persona:\n"+persona.toString());
        System.out.println("Persona nombre: "+persona.getNombre());
        System.out.println("Persona apellido: "+persona.getApellido());
    }
            
}
