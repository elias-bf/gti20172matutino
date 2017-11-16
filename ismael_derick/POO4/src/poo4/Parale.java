/*4.Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto
paralelepípedo em conformidade com o paradigma orientado a objeto. 
Posteriormente implemente esta classe. A classe deverá ter as seguintes 
características: altura, largura, comprimento, calcular volume e calcular área. 
O cálculo do volume (altura * comprimento * largura) e o cálculo da área 
( 2 * (altura * largura + altura * comprimento + largura * comprimento)).
 */
package poo4;
public class Parale {
    private double altura;
    private double comprimento;
    private double largura;

public Parale(){

}
public Parale(double altura, double comprimento, double largura){
    this.altura = altura;
    this.comprimento = comprimento;
    this.largura = largura;
}
//métodos acessores
    public double getAltura(){
        return altura;
    }
    public void  setAltura(double altura){
        this.altura = altura;
    }
    public double getComprimento(){
    return comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento=comprimento;
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    //Métodos específicos
    @Override
    public String toString(){
        return "altura "+altura+" ,Largura"+largura+ ", comprimento"+comprimento;
    
    }
    public double Volume(){
        return (altura * comprimento * largura);
    }
    public double Area(){
        return ( 2 * (altura * largura + altura * comprimento + largura * comprimento));
    }
}