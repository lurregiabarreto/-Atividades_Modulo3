package br.com.zup.Lista5ModelagemDeClassesComHeranca;

public class Administrador extends Colaborador {

    private double ajudaDeCusto;


    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double salario = (getSalarioBase() + ajudaDeCusto) - getImposto();
        return salario;

    }

}
