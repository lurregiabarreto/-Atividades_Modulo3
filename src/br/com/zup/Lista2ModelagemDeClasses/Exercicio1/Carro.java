package br.com.zup.Lista2ModelagemDeClasses.Exercicio1;

public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    public Carro(String nome, double peso, String fabricante, String cor, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;
    }

    public void darDesconto(double valorDesconto) {
        valor = valor - valorDesconto;
    }

    public void pintar(String novaCor) {
        cor = novaCor;
    }


    public void mostrarCarro() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
        System.out.println("Valor do carro: R$ " + valor);
    }
}
