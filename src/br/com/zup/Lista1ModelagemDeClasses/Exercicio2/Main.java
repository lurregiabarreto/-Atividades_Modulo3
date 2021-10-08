package br.com.zup.Lista1ModelagemDeClasses.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lurrégia", 24, 1.64);
        pessoa.peso = 0;

        System.out.println("Seu nome é: " + pessoa.nome);
        System.out.println("Sua idade é: " + pessoa.idade);
        System.out.println("Seu peso é: " + pessoa.peso);
        System.out.println("Sua altura é: " + pessoa.altura);
    }
}

