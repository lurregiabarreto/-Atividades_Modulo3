package br.com.zup.Lista1ModelagemDeClasses.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Bola redonda = new Bola();
        Bola quadrada = new Bola();

        redonda.circunferencia = "Redonda";
        redonda.cor = "Rosa";
        redonda.marca = "Nike";
        redonda.velocidade = 5.0;

        quadrada.circunferencia = "Quadrada";
        quadrada.cor = "Verde";
        quadrada.marca = "Adidas";
        quadrada.velocidade = 10.0;

        System.out.println("Sua bola é: " + redonda.circunferencia);
        System.out.println("A cor da bola é: " + redonda.cor);
        System.out.println("A marca da bola é: " + redonda.marca);
        System.out.println("A velocidade que a bola atinge é: " + redonda.velocidade);
        System.out.println();
        System.out.println("Sua bola é: " + quadrada.circunferencia);
        System.out.println("A cor da bola é: " + quadrada.cor);
        System.out.println("A marca da bola é: " + quadrada.marca);
        System.out.println("A velocidade que a bola atinge é: " + quadrada.velocidade);
    }


}

