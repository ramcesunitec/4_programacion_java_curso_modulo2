
package aag_test_Sobreescritura;

import aag_domain_Sobreescritura.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1=new Gerente("Sistemas", "Ramces", 15000);
        System.out.println("gerente1\n"+gerente1.obtenerDetalles());
    }
}
