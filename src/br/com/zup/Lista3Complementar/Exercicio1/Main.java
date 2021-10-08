/* 1. Classe Bola: Crie uma chamada Jabulani
1. Atributos: Cor, circunferência, material
2. Métodos: trocaCor e mostraCor */
package br.com.zup.Lista3Complementar.Exercicio1;

public class Main {
    public static void main(String[] args) {
        //Instanciando a classe Bola
        Bola jabulani = new Bola("azul", 67, "Plástico");

        jabulani.mostraCor();
        jabulani.trocaCor("rosa");
        System.out.println("--------------------------");
    }
}
