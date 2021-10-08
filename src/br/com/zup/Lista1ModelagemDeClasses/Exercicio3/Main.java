package br.com.zup.Lista1ModelagemDeClasses.Exercicio3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("848449894986", "Lurrégia");
        conta.saldo = 0;

        System.out.println("Número da conta: " + conta.numeroDaConta);
        System.out.println("Nome do correntista: " + conta.nome);
        System.out.println("Saldo: " + conta.saldo);
    }
}
