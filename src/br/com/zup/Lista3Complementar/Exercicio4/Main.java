package br.com.zup.Lista3Complementar.Exercicio4;

import java.sql.SQLOutput;

/* 4. Classe Pessoa: Crie uma classe que modele uma pessoa:
1. Atributos: nome, idade, peso e altura
2. Métodos: Envelhecer, engordar, emagrecer, crescer. Obs: Por padrão,
a cada ano que nossa pessoa envelhece, sendo a idade dela menor
que 21 anos, ela deve crescer 0,5 cm */
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Lurrégia", 24, 55, 1.64);


        //Aniversário do usuário
        pessoa.envelhecer(1);
        System.out.println("Hoje é seu aniversário e sua idade é : " + pessoa.idade);

        //Pessoa engordando
        pessoa.engordar(10.0);
        System.out.println("Você engordou e seu peso agora é " + pessoa.peso);

        //Pessoa emagracendo
        pessoa.emagrecer(5.0);
        System.out.println("Você emagereceu e seu novo peso é " + pessoa.peso);

        //Pessoa crescendo
        pessoa.crescer(0.20);
        // System.out.println("Olá você cresceu seu tamanho agora é : " +);

    }
}
