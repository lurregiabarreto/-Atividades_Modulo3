/*Modele as classes referentes aos funcionários de uma universidade, que serão os
professores, coordenadores e funcionários administrativos.
Os atributos comuns de todos os funcionários são: Nome, CPF, número de
registro, órgão de lotação e salário.
Os professores possuem os atributos: Nível de graduação, disciplina ministrada ,
quantidade de alunos e quantidade de turmas.
Os coordenadores possuem os atributos: ProfessoresSupervisionados
Os funcionários administrativos possuem os atributos: Função Administrativa e
Senioridade.
Implemente, além dos getters e setters e os construtores, os seguintes métodos:
● aumentoSalario: para todos menos os coordenadores aumenta o salário em
10% e para os coordenadores o aumento é de 5%.
● adicionaTurma: para os professores.
● adicionaProfessor (para os coordenadores): Para adicionar um professor na
lista de professores supervisionados. */
package br.com.zup.Lista6ModelagemDeClassesComHeranca2.Exercicio1;


public class Main {


    public static void main(String[] args) {
        Coordenadores coordenador = new Coordenadores("Fernanda", "11223344-55", "125", "00001", 2500);
        // Professores professor1 = new Professores("Pablo", "667778899-00" , "3490","00002",2000,"Junior","Java",7,2,"maternal");
        Administrativos adm1 = new Administrativos("Robert", "99887766-55", "3476", "00003", 3000, "Tesoureiro", "Pleno");
        Turma turma1 = new Turma("6");

        adm1.aumentoSalario();
        System.out.println(adm1.aumentoSalario());
        turma1.getSerie();



    }
}
