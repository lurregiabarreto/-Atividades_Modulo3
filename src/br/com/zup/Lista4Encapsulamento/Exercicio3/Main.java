/*  3. Crie uma classe para representar uma pessoa, com os atributos privados de
nome, data de nascimento e altura. Crie os métodos públicos necessários para sets
e gets e também um método para imprimir todos dados de uma pessoa. Crie um
método para calcular a idade da pessoa.*/
package br.com.zup.Lista4Encapsulamento.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Entrada dos dados - Nome da pessoa
        System.out.println("Por favor, digite seu nome: ");
        String nome = leitor.nextLine();

        // Entrada dos dados - Idade da pessoa
        System.out.println("Por favor, digite sua data de nascimento: ");
        System.out.println("Dia: ");
        int dia = leitor.nextInt();
        System.out.println("Mês: ");
        int mes = leitor.nextInt();
        System.out.println("Ano: ");
        int ano = leitor.nextInt();
        Data dataDeNascimento = new Data(dia, mes, ano);

        // Entrada dos dados - Altura da pessoa
        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        // Instanciando objeto pessoa com todos seus atributos
        Pessoa objeto = new Pessoa(nome,dataDeNascimento , altura);

        // Calculando idade da pessoa
        objeto.calcularIdade(2021);

        // Exibindo dados
        objeto.imprimirDados();
    }
}

