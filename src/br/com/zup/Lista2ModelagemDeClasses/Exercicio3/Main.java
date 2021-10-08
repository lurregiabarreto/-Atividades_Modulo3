/*3. Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
quantas pessoas estão presentes nele. A classe deve também disponibilizar os
seguintes métodos:
- Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
- Sobe : para subir um andar (não deve subir se já estiver no último
andar); - Desce : para descer um andar (não deve descer se já estiver no
térreo);
 */

package br.com.zup.Lista2ModelagemDeClasses.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Elevador zupper = new Elevador(1, 10, 10, 2);
        //Mostrar dados
        zupper.mostrarDados();
        System.out.println("-----");

        //Entrada de pessoas
        zupper.entrar(4);
        System.out.println("-----");

        //Saída de  pessoas
        zupper.sair(2);
        System.out.println("-----");

        //Elevador subindo
        zupper.sobe(2);
        System.out.println("-----");

        //Elevador descendo
        zupper.desce(3);
    }
}

