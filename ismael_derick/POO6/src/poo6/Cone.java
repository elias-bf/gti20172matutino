/*6.Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto 
cone em conformidade com o paradigma orientado a objeto. Posteriormente implemente 
esta classe. A classe deverá ter as seguintes características: raio, altura e cálculo
da geratriz, área lateral, área total e o volume.
Obs.: 	os valores do raio e da altura não podem ser negativos.
o cálculo da geratriz é (Raiz Quadrada((altura*altura)+(raio*raio)))
o cálculo da área lateral é (3.14*raio*geratriz)
o cálculo da área total é (3.14*raio*(geratriz()+raio))
o cálculo do volume é (1.0/3.0*3.14*raio*raio*altura).
*/
package poo6;
public class Cone {
    private double raio;
    private double altura;

public Cone (){

}
public Cone(double raio,double altura){
    this.altura=altura;
    this.raio=raio;
}
public double getRaio(){
    return raio;
}
public void setRaio(double raio){
    this.raio=raio;
}
public double getAltura(){
    return altura;
}
public void setAltura(double altura){
    this.altura=altura;
}
@Override
public String toString(){
    return "Raio é ..:"+raio+" Altura é ..:"+altura;
}
public double Geratriz(){
    return (Math.sqrt((altura*altura)+(raio*raio)));
}
public double Lateral(){
    return (3.14*raio*(Math.sqrt((altura*altura)+(raio*raio))));
}
public double Total(){
    return (3.14*raio*((Math.sqrt((altura*altura)+(raio*raio)))+raio));
}
public double Volume(){
    return (1.0/3.0*3.14*raio*raio*altura);
}
}