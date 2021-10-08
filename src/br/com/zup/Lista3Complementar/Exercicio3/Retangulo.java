package br.com.zup.Lista3Complementar.Exercicio3;

public class Retangulo {
    double ladoAltura;
    double ladoBase;


    public Retangulo(double ladoAltura, double ladoBase) {
        this.ladoAltura = ladoAltura;
        this.ladoBase = ladoBase;
    }

    public void mudarValorLados(double mudarValorA, double mudarValorB) {
        ladoAltura = mudarValorA;
        ladoBase = mudarValorB;
        System.out.println("O valor da altura é : " + ladoAltura + "O valor da base é : " + ladoBase);

    }

    public void retornarValorLados() {
        System.out.println(ladoAltura + " , " + ladoBase);

    }

    public void calculoArea() {
        double area = ladoAltura * ladoBase;
        System.out.println("A area do retangulo é " + area);

    }

    public void calculoPerimetro() {
        double perimetro = ladoAltura + ladoBase;
        System.out.println("O perimetro  do retangulo é " + perimetro);

    }
}
