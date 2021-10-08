package br.com.zup.Lista1ModelagemDeClasses.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Carro carroPopular = new Carro(4, "Celta", "Chevrolet");
        carroPopular.potencia = 2.0;

        System.out.println("O carro que você escolheu tem " + carroPopular.quantidadeDePortas + " portas");
        System.out.println("O modelo do seu carro é: " + carroPopular.modelo);
        System.out.println("A marca do carro é: " + carroPopular.marca);
        System.out.println("A pôtencia do carro é: " + carroPopular.potencia);
    }
}
