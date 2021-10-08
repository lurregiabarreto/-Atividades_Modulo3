package br.com.zup.Lista2ModelagemDeClasses.Exercicio3;

public class Elevador {
    int terreo = 0;
    int andares;
    double capacidade;
    int pessoas;
    int andarAtual;

    public Elevador(int andarAtual, int andares, double capacidade, int pessoas) {
        this.andarAtual = andarAtual;
        this.andares = andares;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
    }

    public void mostrarDados() {
        System.out.println("Você está no " + andarAtual + "º andar");
        System.out.println("O prédio tem " + andares + "º andar");
        System.out.println("O elevador tem capacidade de: " + capacidade + " pessoas por vez");
        System.out.println("No momento tem " + pessoas + " pessoas no elevador");
    }

    public void entrar(int pessoaEntrando) {
        if (capacidade >= pessoas + pessoaEntrando) {
            pessoas = pessoas + pessoaEntrando;
            System.out.println("Entrou " + pessoaEntrando + " pessoas");
            System.out.println("Agora tem " + pessoas + " dentro do elevador");
        } else {
            System.out.println("Ocupação maxima permitida, por favor espere o proximo elevador");
        }
    }

    public void sair(int pessoaSaindo) {
        if (pessoaSaindo > 0) {
            if (pessoas >= pessoaSaindo) {
                pessoas = pessoas - pessoaSaindo;
                System.out.println("Saiu " + pessoaSaindo + " pessoas do elevador");
                System.out.println("Agora tem " + pessoas + " dentro do elevador");
            } else {
                System.out.println("Não tem esse número de pessoas no elevador");
            }
        } else {
            System.out.println("O elevador está vazio.");
        }
    }

    public void sobe(int subindo) {
        if (subindo >= terreo) {
            if (andares >= andarAtual + subindo) {
                andarAtual = andarAtual + subindo;
                System.out.println(" ↑ Você subiu para o " + andarAtual + "º andar");
            } else {
                System.out.println("O prédio só tem " + andares + "º andares");
            }
        }
    }

    public void desce(int descer) {
        if (andarAtual > terreo) {
            if (andarAtual - descer > terreo) {
                andarAtual = andarAtual - descer;
                System.out.println(" ↓ Você desceu para o " + andarAtual + "º andar");
            }
            if (andarAtual - descer == terreo) {
                System.out.println(" ↓ Você desceu " + descer + "º andares e agora está no terreo");
            } else {
                System.out.println("Não existe andares abaixo");
            }
        }
    }
}
