package br.com.zup.Lista7ExercicioTodoConteudo;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();


    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Quantidade de imoveis: " +imoveis.size());
        retorno.append("Imoveis: ");
        retorno.append("\n " +imoveis);
        return retorno.toString();
    }
}
