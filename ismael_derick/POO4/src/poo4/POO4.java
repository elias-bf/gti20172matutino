/*4.Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto
paralelepípedo em conformidade com o paradigma orientado a objeto. 
Posteriormente implemente esta classe. A classe deverá ter as seguintes 
características: altura, largura, comprimento, calcular volume e calcular área. 
O cálculo do volume (altura * comprimento * largura) e o cálculo da área 
( 2 * (altura * largura + altura * comprimento + largura * comprimento)).
 */
package poo4;
import java.util.Scanner;
public class POO4 {
    public static void main(String[] args) {
        double altura,largura,comprimento;
        Scanner leia =new Scanner(System.in);
        Parale x = new Parale();
        System.out.println("Digite a altura");
        altura = leia.nextDouble();
        x.setAltura(altura);
        System.out.println("Digite a largura");
        largura = leia.nextDouble();
        x.setLargura(largura);
        System.out.println("Digite a comprimento");
        comprimento = leia.nextDouble();
        x.setComprimento(comprimento);
        System.out.println(x.toString());
        System.out.println("Volume é..: "+x.Volume());
        System.out.println("Area é..: "+x.Area());
        
    }
    
}
