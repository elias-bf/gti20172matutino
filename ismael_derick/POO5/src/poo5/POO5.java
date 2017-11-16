/*5.Desenvolva, usando a UML (diagrama de classe), uma classe que modele um 
objeto cilindro em conformidade com o paradigma orientado a objeto. Posteriormente
implemente esta classe. A classe deverá ter as seguintes características: raio, 
altura e cálculo da área lateral, área total e volume.
Obs.:	os valores do raio e da altura não podem ser negativos.
o cálculo da área lateral é (2*3.14*raio*altura)
o cálculo da área total (2*3.14*raio*(altura+raio))
o cálculo do volume (3.14*raio*raio*altura).
 */
package poo5;
import java.util.Scanner;
public class POO5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double altura,raio;
        Cilindro x=  new Cilindro();
        System.out.println("Digite o raio:");
        raio=leia.nextDouble();
        x.setRaio(raio);
        System.out.println("Digite a altura:");
        altura=leia.nextDouble();
        x.setAltura(altura);
        System.out.println(x.toString());
        System.out.println("o cálculo da área lateral é ..:" +x.Lateral());
        System.out.println("o cálculo da área total é ..:" +x.Total());
        System.out.println("o cálculo do volume é ..:" +x.volume());
        
    }
    
}
