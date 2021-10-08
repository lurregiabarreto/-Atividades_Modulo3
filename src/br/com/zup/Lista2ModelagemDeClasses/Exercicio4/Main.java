/* 4. Crie uma classe que represente um cartão de crédito, que deve ter como atributos
o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos
aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma
compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o
valor da fatura */

package br.com.zup.Lista2ModelagemDeClasses.Exercicio4;

public class Main {
    public static void main(String[] args) {
        CartaoDeCredito exemplo = new CartaoDeCredito(500, 100, "Lurrégia");
        exemplo.imprimeFatura();

        //Aumentando limite
        exemplo.aumentarLimite(600);

        //Diminuindo limite
        exemplo.diminuirLimite(100);

        //Realizando compra
        exemplo.realizaComprar(200);
        System.out.println("-----");

        //Fatura do cartão
        exemplo.imprimeFatura();

    }
}

