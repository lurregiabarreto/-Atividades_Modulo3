/* 2. Classe Quadrado: Crie uma classe que modele um quadrado:
1. Atributos: Tamanho do lado
2. Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área; */
package br.com.zup.Lista3Complementar.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);


        //Mostrando o valor antigo do quadrado
        quadrado.retornarValor();

        //Aletrando o valor do quadrado
        quadrado.mudarValorLado(15.0);

        //Valor da area do quadrado
        quadrado.calculoArea();


    }
}
