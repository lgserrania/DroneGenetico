/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

/**
 *
 * @author Gustavo
 */
public class Ponto {
    
    public double px;
    public double py;
    public boolean visitado = false;
    public int num;
    
    public Ponto(double px, double py, int num){
        this.px = px;
        this.py = py;
        this.num = num;
    }
    
    public Ponto(double px, double py){
        this.px = px;
        this.py = py;
    }
    
    public void imprime(){
        System.out.println("(" + px + "," + py + ")");
    }
    
    public boolean equals(Ponto p2){      
        return p2.px == px && p2.py == py;
    }
    
    public void visitou(){
        visitado = true;
    }
    
    public void naoVisitou(){
        visitado = false;
    }
    
}
