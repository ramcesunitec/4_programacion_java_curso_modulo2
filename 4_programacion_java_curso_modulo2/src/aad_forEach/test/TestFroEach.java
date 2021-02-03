/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aad_forEach.test;

import aad_forEach.domain.Persona;

/**
 *
 * @author ramce
 */
public class TestFroEach {
    public static void main(String[] args) {
        int edades[]={5,6,7,8,9};
        for(int edad:edades){
            System.out.println("edad= "+edad);
        }
        
        
        Persona personas[]={new Persona("Ramces"),new Persona("Nancy"),new Persona("Santiago")};
        for(Persona persona: personas){
            System.out.println("Persona: "+persona);
        }
    }
}
