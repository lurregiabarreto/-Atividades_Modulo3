package br.com.zup.Lista6ModelagemDeClassesComHeranca2.Exercicio1;

public class Funcionarios {
    // Aplicando atributos

    private String nome;
    private String Cpf;
    private String numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario;

    //Método construtor

    public Funcionarios(String nome, String Cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        this.nome = nome;
        this.Cpf = Cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }


    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCPF(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Método para aumentar o salário

    public double aumentoSalario() {
        double novoSalario = salario + (salario * 0.1);
        return novoSalario;
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " +nome);
        retorno.append("CPF: " +Cpf);
        retorno.append("Numero de registro: " + numeroDeRegistro);
        retorno.append("Orgão de lotação: " +orgaoDeLotacao);
        retorno.append("Salário: " +salario);
        return retorno.toString();
    }

}
