/*  Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o
volume e trocar os canais da televisão. O controle de volume permite:
- Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
- Aumentar e diminuir o número do canal em uma unidade;
- Trocar para um canal indicado;
- Consultar o valor do volume de som e o canal selecionado*/
package br.com.zup.Lista4Encapsulamento.LevelUp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Televisao tv = new Televisao(0, 0);
        ControleRemoto controle = new ControleRemoto(tv);
        boolean menu = true;
        int entrada = 0;

        while (menu) {
            System.out.println("------------------------------------ ");
            controle.mostrarDados();
            System.out.println("------------------------------------ ");
            System.out.println("Seja bem vindo a TV");
            System.out.println("Digite 1 para aumentar o volume");
            System.out.println("Digite 2 para diminuir o volume");
            System.out.println("Digite 3 para avançar um canal");
            System.out.println("Digite 4 para voltar um canal");
            System.out.println("Digite 5 para trocar o canal");
            System.out.println("Digite 6 para desligar a TV. ");
            System.out.println("------------------------------------ ");

            entrada = leitor.nextInt();

            switch (entrada) {
                case 1:
                    controle.aumentarVolume();
                    break;
                case 2:
                    controle.diminuirVolume();
                    break;
                case 3:
                    controle.aumentarCanal();
                    break;
                case 4:
                    controle.diminuirCanal();
                    break;
                case 5:
                    System.out.println("Digite o novo canal: ");
                    int novoCanal = leitor.nextInt();
                    controle.trocarCanal(novoCanal);
                    break;
                case 6:
                    controle.desligarTV();
                    menu = false;
                    break;
                default:
                    System.out.println("Por favor, digite uma opção válida");
                    break;
            }


        }
    }
}
