package br.com.zup.Lista3Complementar.Exercicio1;

public class Bola {
    String cor = "roxo";
    double circunferencia;
    String material;


    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }


    public void trocaCor(String novaCor) {
        cor = novaCor;
        System.out.println("Trocamos a cor da bola, agora é :" + cor);
    }

    public void mostraCor() {
        System.out.println("A cor atual da bola é: " + cor);

    }
}


