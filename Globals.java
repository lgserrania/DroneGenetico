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
//MELHORES RESULTADOS:
//15000 gerações
//400 indivíduos
//0.05 de mutação

public class Globals {
    
    public static ArrayList<Ponto> pontosIniciais = new ArrayList();
    
    public static double raio = 10;
    public static double maiorx = 0.0;
    public static double maiory = 0.0;
    public static double taxaMutacao = 0.05;
    public static int numGeracoes = 15000;
    public static int tamPopulacao = 400;
    public static int numHill = 100;
    
    public static double calcDistancia(Ponto p1, Ponto p2){
        return Math.abs(Math.sqrt(Math.pow((p2.px - p1.px), 2) + Math.pow((p2.py - p1.py), 2)));
    }
    
    public static boolean verificaPonto(Ponto p1){
        
        for(Ponto p2 : pontosIniciais){
            if(calcDistancia(p1,p2) <= raio){
                return true;
            }
        }
        return false;
    }
    
    public static void maxX(){
        double maior = 0;
        for(Ponto p : pontosIniciais){
            if(p.px > maior){
                maior = p.px;
            }
        }
        maiorx = maior;
    }
    
    public static void maxY(){
        double maior = 0;
        for(Ponto p : pontosIniciais){
            if(p.py > maior){
                maior = p.py;
            }
        }
        maiory = maior;
    }
    
}
