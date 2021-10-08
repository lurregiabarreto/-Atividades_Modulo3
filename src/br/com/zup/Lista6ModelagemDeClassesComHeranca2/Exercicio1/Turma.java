package br.com.zup.Lista6ModelagemDeClassesComHeranca2.Exercicio1;

public class Turma {
    //Criando atributos
    private String serie;

    //Método construtor
    public Turma(String serie) {
        this.serie = serie;
    }

    //Getters e Setters

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                '}';
    }
}
