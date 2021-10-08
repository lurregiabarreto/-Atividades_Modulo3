/* 1. Crie uma classe que represente um carro, que tenha como características o
nome, o peso, a fabricante, a cor e o valor do carro. Crie também o método
darDesconto() que servirá para diminuir o preço do carro e o método pintar(), que
será responsável por mudar a cor do carro. Crie um carro no seu programa principal,
utilize os métodos criados e mostre na tela o preço e a cor do carro antes e depois
da utilização dos métodos */

package br.com.zup.Lista2ModelagemDeClasses.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro exemplo = new Carro("Ford ka", 500, "Ford", "Vermelho", 50000);
        Scanner leitor = new Scanner(System.in);

        // Exibindo informações do carro
        exemplo.mostrarCarro();
        System.out.println("----------------");

        // Lendo valor do desconto
        System.out.println("Por favor, digite um valor de desconto: ");
        double desconto = leitor.nextDouble();
        leitor.nextLine();

        // Lendo valor da nova cor
        System.out.println("Por favor, digite a nova cor: ");
        String cor = leitor.nextLine();

        exemplo.darDesconto(desconto);
        exemplo.pintar(cor);

        System.out.println("----------------");
        exemplo.mostrarCarro();
    }
}

