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
import java.util.Scanner;
public class POO6 {
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     double altura,raio;
     Cone x= new Cone();
        System.out.println("Digite a altuara");
        altura = leia.nextDouble();
        if(altura>=0) x.setAltura(altura);
        else System.out.println("Não pode negativo");
        System.out.println("Digite o Raio..");
        raio=leia.nextDouble();
        if(raio>=0) x.setRaio(raio);
        else System.out.println("Somente aceitamos numeros possitivos");
        System.out.println(x.toString());
        System.out.println("O cálculo da geratriz é..:" +x.Geratriz());
        System.out.println("O cálculo da área lateral é..:" +x.Lateral());
        System.out.println("O cálculo da área total é..:" +x.Total());
        System.out.println("O cálculo do volume é..: " +x.Volume());
        
    }
    
}
