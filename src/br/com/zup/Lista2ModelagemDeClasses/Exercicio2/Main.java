/* Crie uma classe referente à uma conta bancária, que possui como atributos o seu
número, saldo e o nome do correntista. Crie também o método saque() que serve
para retirar o certo valor do saldo, o método depósito() que serve para adicionar um
valor ao saldo e o método extrato() que serve para mostrar na tela o nome do
correntista, o número da conta e o saldo. Crie um programa principal e demonstre a
utilização dos métodos implementados. */

package br.com.zup.Lista2ModelagemDeClasses.Exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria itau = new ContaBancaria("282870", 10000, "Lurrégia");
        //Extrato
        itau.mostrarDados();

        //Saque da conta
        itau.saque(400);
        System.out.println("------");

        //Extrato
        itau.mostrarDados();
        System.out.println("-----");

        //Deposito
        itau.depositar(300);
        itau.mostrarDados();
    }
}


