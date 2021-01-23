/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aab_Enumeracion;

/**
 *
 * @author ramce
 */
public enum Continentes {
    
    AFRICA(53),
    ASIA(46),
    OCEANIA(44),
    EUROPA(34),
    AMERICA(14);
    
    private final int paises;
          
    private Continentes(int paises) {
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}