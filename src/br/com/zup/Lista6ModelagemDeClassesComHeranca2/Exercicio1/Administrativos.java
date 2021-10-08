package br.com.zup.Lista6ModelagemDeClassesComHeranca2.Exercicio1;

public class Administrativos extends Funcionarios {
    //Aplicando atributos
    private String funcaoAdm;
    private String senioridade;

    //Método construtor
    public Administrativos(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcao, String senioridade) {
        super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdm = funcao;
        this.senioridade = senioridade;
    }

    //Getters e Setters
    public String getFuncao() {
        return funcaoAdm;
    }

    public void setFuncao(String funcao) {
        this.funcaoAdm = funcao;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
    @Override
    public String toString() {
        return "FuncionarioAdministrativo{" +
                "funcaoAdministrativa='" + funcaoAdm + '\'' +
                ", senioridade='" + senioridade + '\'' +
                '}';
    }

}
