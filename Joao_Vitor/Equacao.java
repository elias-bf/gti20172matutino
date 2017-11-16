package ex10listaoo;
public class Equacao {
    public double a;
    public double b;
    public double c;
    public double x;
    
    public Equacao(){
        
    }
    
    public Equacao(double a, double b, double c, double x){
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    public void setA(double a){
        this.a = a;
    }
    
    public void setB(double b){
        this.b = b;
    }
    
    public void setC(double c){
        this.c = c;
    }
    
}
