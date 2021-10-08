package br.com.zup.Lista6ModelagemDeClassesComHeranca2.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {

    //Aplicando atributos

    List<Professores> professoresSupervisionados = new ArrayList<Professores>();

    //Método construtor

    public Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    //Método para adicionar professor na lista

    public void adicionaProfessor(Professores novoProfessor) {
        professoresSupervisionados.add(novoProfessor);
    }

    public void exibirLista() {
        for (Professores referencia : professoresSupervisionados) {
            System.out.println("Professor adicionado: " + referencia.getNome());
        }
    }

    //Sobrescrevendo método da superclasse

    @Override
    public double aumentoSalario() {
        double valorAumento = getSalario() + (getSalario() * 0.05);
        return valorAumento;
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("\n Nome: " +getNome());
        retorno.append("\n CPF: " +getCpf());
        retorno.append("\n Numero de registro: " + getNumeroDeRegistro());
        retorno.append("\n Orgão de lotação: " +getOrgaoDeLotacao());
        retorno.append("\n Salário: " +getSalario());
        retorno.append("\n Quantidade de professores que ele supervisiona: " +professoresSupervisionados.size());
        retorno.append("\n Professores supervisionados: " +professoresSupervisionados);

        return retorno.toString();
    }
}
