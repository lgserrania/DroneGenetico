/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarregarArquivo ca = new CarregarArquivo("instancia.csv");
        Globals.maxX();
        Globals.maxY();
        AlgoritmoGenetico ag = new AlgoritmoGenetico();
        Individuo indi = ag.resolver();
        
        System.out.println(indi.distancia());
        Exibir e = new Exibir(indi.getCromossomo());
    }
    
}
