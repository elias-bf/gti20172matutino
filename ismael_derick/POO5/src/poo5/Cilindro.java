/* 5.Desenvolva, usando a UML (diagrama de classe), uma classe que modele um 
objeto cilindro em conformidade com o paradigma orientado a objeto. Posteriormente
implemente esta classe. A classe deverá ter as seguintes características: raio, 
altura e cálculo da área lateral, área total e volume.
Obs.:	os valores do raio e da altura não podem ser negativos.
o cálculo da área lateral é (2*3.14*raio*altura)
o cálculo da área total (2*3.14*raio*(altura+raio))
o cálculo do volume (3.14*raio*raio*altura).
 */
package poo5;

public class Cilindro {
private double raio; 
private double altura;
//construtor
public Cilindro(){

}
public Cilindro(double raio,double altura){
    this.raio=raio;
    this.altura=altura;
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
        return "Altura "+altura+" ,Raio " +raio;
    }
public double volume(){
    return (3.14*raio*raio*altura);
}
public double Total(){
    return (2*3.14*raio*(altura+raio));
}
public double Lateral(){
    return (2*3.14*raio*altura);
}

}
