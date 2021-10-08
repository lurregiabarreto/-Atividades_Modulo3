/* Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus
respectivos seletores (getters) e modificadores (setters). Atributos: String nome;
String endereco; String telefone;
Considere, como subclasse da classe Pessoa (desenvolvida no item anterior) a
classe Fornecedor. Considere que cada instância da classe Fornecedor tem, para
além dos atributos que caracterizam a classe Pessoa, os atributos valorCredito
(correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida
(montante da dívida para com o fornecedor).
Implemente na classe Fornecedor, para além dos usuais métodos seletores e
modificadores, um método obterSaldo() que devolve a diferença entre os valores
dos atributos valorCredito e valorDivida.
Depois de implementada a classe Fornecedor, crie um programa de teste adequado
que lhe permita verificar o funcionamento dos métodos implementados na classe
Fornecedor e os herdados da classe Pessoa.
Considere, como outra subclasse da classe Pessoa, a classe Colaborador.
Considere que cada instância da classe Colaborador tem, para além dos atributos
que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase
(double) e imposto (double).
Implemente a classe Colaborador com métodos seletores e modificadores e um
método calcularSalario.
Escreva um programa de teste adequado para a classe Colaborador .
Implemente a classe Administrador como subclasse da classe Colaborador. Um
determinado administrador tem como atributos, para além dos atributos da classe
Pessoa e da classe Colaborador, o atributo ajudaDeCusto (double). Note que
deverá redefinir na classe Administrador o método herdado calcularSalario (o
salário de um administrador é equivalente ao salário de um empregado usual
acrescido das ajuda de custo).
Escreva um programa de teste adequado para esta classe */
package br.com.zup.Lista5ModelagemDeClassesComHeranca;

public class Main {
    public static void main(String[] args) {

        //Instanciando as classes
        Pessoa pessoa = new Pessoa();
        Fornecedor fornecedor = new Fornecedor("Lurrégia", "Rua Pedro ", "99999", 1800, 600);
        Colaborador colaborador = new Colaborador("Ludimar", "Rua Edson", "33333", 100, 3500.0, 530.0);
        Administrador administrador = new Administrador("Gabriel", "Rua Clovis", "88888", 578, 1100, 500, 70);

        //Aplicando método para obter saldo do fornecedor
        System.out.println("O salário do fornecedor é : " +fornecedor.obterSaldo());

        //Aplicando método para calcular salário do colaborador
        System.out.println("O salário do colaborador é : " +colaborador.calcularSalario());

        //Aplicando método para calcular salário do administrador, que é um colaborador
        System.out.println("O salário do Administrador é  : " +administrador.calcularSalario());


    }

}
