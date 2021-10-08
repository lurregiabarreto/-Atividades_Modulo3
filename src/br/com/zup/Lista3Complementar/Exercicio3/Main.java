/*  3. Classe Retangulo: Crie uma classe que modele um retângulo: 1. Atributos:
LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
2. Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular
Área e calcular Perímetro;*/
package br.com.zup.Lista3Complementar.Exercicio3;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(10.0, 20.0);


        //Mostrando os valores da altura e da base
        System.out.println("Os valores da altura e base são : ");
        retangulo.retornarValorLados();

        //Mudando os valores da altura e da base
        System.out.println("Valores alerados ...");
        retangulo.mudarValorLados(20.0, 10.0);

        //Valor da  area do retangulo
        retangulo.calculoArea();

        //Valor do perímetro
        retangulo.calculoPerimetro();


    }
}
