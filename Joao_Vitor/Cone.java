package ex6listaoo;
public class Cone {
    private double raio;
    private double altura;
    
    public Cone(){
        
    }
    
    public Cone(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return "Raio:"+raio+" altura:"+altura;
    }
    
    public double geratriz(){
        return Math.sqrt((altura*altura)+(raio*raio));
    }
    
    public double areaLateral(){
        return 2*3.14*raio*geratriz();
    }
    
    public double areaTotal(){
        return 2*3.14*raio*(geratriz()+raio);
    }
    
    public double volume(){
        return 1.0/3.0*3.14*raio*raio*altura;
    }
}
