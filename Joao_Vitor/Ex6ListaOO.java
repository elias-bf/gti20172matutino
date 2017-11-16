/*
Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto
cone em conformidade com o paradigma orientado a objeto. Posteriormente implemente
esta classe. A classe deverá ter as seguintes características: raio, altura e cálculo
da geratriz, área lateral, área total e o volume.
    Obs.: 	os valores do raio e da altura não podem ser negativos.
    o cálculo da geratriz é (Raiz Quadrada((altura*altura)+(raio*raio)))
    o cálculo da área lateral é (3.14*raio*geratriz)
    o cálculo da área total é (3.14*raio*(geratriz()+raio))
    o cálculo do volume é (1.0/3.0*3.14*raio*raio*altura).

 */
package ex6listaoo;
public class Ex6ListaOO {
    public static void main(String[] args) {
        Cone x = new Cone(7, 6);
        System.out.println(x.toString());
        System.out.println("Geratriz: "+x.geratriz()+" Área lateral "+ x.areaLateral()+ " Área total: "+ x.areaTotal()+ "volume: "+x.volume());
        
        
        Cone y = new Cone();
        y.setRaio(9);
        y.setAltura(8);
        System.out.println("Raio: "+y.getRaio()+" altura: "+y.getAltura());
        System.out.println("Geratriz: "+y.geratriz()+" Área lateral "+ y.areaLateral()+ " Área total: "+ y.areaTotal()+ "volume: "+y.volume());
    }
    
}
