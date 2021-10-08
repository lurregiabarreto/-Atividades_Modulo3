package br.com.zup.Lista2ModelagemDeClasses.Exercicio2;

public class ContaBancaria {
    String numeroDaConta;
    double saldo;
    String nomeDoCorrentista;

    public ContaBancaria(String numeroDaConta, double saldo, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }


    public void mostrarDados() {
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Nome: " + nomeDoCorrentista);
    }

    public void liberaSaque(double valorSaque) {
        saldo = saldo - valorSaque;
    }

    public void saque(double valorDoSaque) {
        if (valorDoSaque > saldo) {
            System.out.println("Você não tem saldo para esse saque.");
        } else {
            System.out.println("Saque com sucesso.");
            liberaSaque(valorDoSaque);
        }
    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

}

