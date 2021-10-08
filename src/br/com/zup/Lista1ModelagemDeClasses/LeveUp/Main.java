package br.com.zup.Lista1ModelagemDeClasses.LeveUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais> continente = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        Pais pais1 = new Pais("Brasil", 8516000, 211000000);
        Pais pais2 = new Pais("Argentina", 2780000, 44940000);
        Pais pais3 = new Pais("Peru", 1285000, 32510000);
        Pais pais4 = new Pais("Colômbia", 1143000, 50340000);

        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        boolean menu = true;
        int opcao = 0;

        while (menu) {
            System.out.println("Digite 1: Para ver os paises");
            System.out.println("Digite 2: Para sair do programa");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                for (Pais referencia : continente) {
                    System.out.println("O nome do pais é: ");
                    System.out.println(referencia.nome);
                    System.out.println("A extensão territorial do pais é: ");
                    System.out.println(referencia.territorio);
                    System.out.println("A populção do pais é: ");
                    System.out.println(referencia.populacao);
                }
            } else if (opcao == 2) {
                System.out.println("Programa finalizado.");
                menu = false;
            } else {
                System.out.println("Número invalido");
            }
        }
    }
}

