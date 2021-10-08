package br.com.zup.Lista3Complementar.Exercicio4;

import javax.swing.*;

public class Pessoa {
    String nome;
    double idade;
    double peso;
    double altura;

    public Pessoa(String nome, double idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(double envelhecer) {
        double novaIdade = idade += +1;


    }

    public void engordar(double engordar) {
        double novoPeso = peso + engordar;

    }

    public void emagrecer(double emagrecer) {
        double nonoPeso = peso - emagrecer;

    }

    public void crescer(double crescer) {
        if (idade < 21) {
            double novaAltura = altura + 0.5;
        } else {
            System.out.println("Vocé está crescendo muito mais ");
        }
    }
}
