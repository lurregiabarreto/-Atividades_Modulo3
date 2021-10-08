package br.com.zup.Lista3Complementar.Exercicio2;

public class Quadrado {
    Double tamanhoDoLado;


    public Quadrado(Double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public void mudarValorLado(Double novoLado) {
        tamanhoDoLado = novoLado;
        System.out.println("O novo valor do lado é : " + tamanhoDoLado);

    }

    public void retornarValor() {
        System.out.println("O valor do lado da bola é " + tamanhoDoLado);

    }

    public void calculoArea() {
        double area = tamanhoDoLado * tamanhoDoLado;
        System.out.println("O valor da area quadrado é " + area);

    }

}
