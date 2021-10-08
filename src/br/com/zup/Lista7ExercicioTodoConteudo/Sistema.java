package br.com.zup.Lista7ExercicioTodoConteudo;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    private static boolean validarCpfExistente(Imobiliaria imobiliaria, Morador morador) {
        // Percorrer minha lista de imóveis
        String cpf = morador.getCpf();

        for (Imovel percorrerImoveis : imobiliaria.getImoveis()) {
            // Percorrer todas as listas dos moradores
            for (Morador percorrerMoradores : percorrerImoveis.getMoradores()) {
                if (percorrerMoradores.getCpf().equals(cpf)) {
                    // Este morador possui um CPF já cadastrado
                    return true;
                }
            }
        }
        return false;
    }


    // Exibir possibilidades
    public static void menu() {
        System.out.println("------------------------------------ ");
        System.out.println("Seja bem vindo a Imobiliária Barretos");
        System.out.println("Digite 1 - Para cadastrar um imóvel. ");
        System.out.println("Digite 2 - Para exibir os imóveis cadastrados. ");
        System.out.println("Digite 3 - Para remover um morador utilizando o CPF");
        System.out.println("Digite 4 - Para sair");

    }

    // Método responsável por cadastrar moradores
    public static Morador receberDadosDosMoradores() {
        String nome = capturarDados("Digite seu nome: ").nextLine();
        String cpf = capturarDados("Digite seu cpf: ").nextLine();
        String telefone = capturarDados("Digite o seu telefone: ").nextLine();
        double renda = capturarDados("Digite o salario: ").nextDouble();

        Morador morador = new Morador(nome, cpf, telefone, renda);
        return morador;
    }

    public static void cadastrarMoradores(Imobiliaria imobiliaria, Imovel imovel) {

        int qtdMoradores = capturarDados("Digite a quantidade de moradores: ").nextInt();
        int contadorDeMoradores = 0;

        while (contadorDeMoradores < qtdMoradores) {
            Morador morador = receberDadosDosMoradores();
            boolean cpfExistente = validarCpfExistente(imobiliaria, morador);

            if (cpfExistente == true) {
                System.out.println("CPF já cadastrado no sistema");
            } else {
                imovel.adicionarMorador(morador);
                contadorDeMoradores++;
            }
        }
    }

    public static String removerMoradorPorCpf(Imobiliaria imobiliaria) {
        String cpf = capturarDados("Digite o CPF do morador a ser removido: ").nextLine();

        for (Imovel percorrerImoveis : imobiliaria.getImoveis()) {
            // Percorrer todas as listas dos moradores
            for (Morador percorrerMoradores : percorrerImoveis.getMoradores()) {
                if (percorrerMoradores.getCpf().equals(cpf)) {
                    percorrerImoveis.getMoradores().remove(percorrerMoradores);
                    return "Morador removido com sucesso";
                }
            }
        }
        return "Morador não cadastrado no sistema";
    }

    // Método responsável por cadastrar funcionários
    public static Funcionario cadastrarFuncionario() {
        String nome = capturarDados("Digite o nome do funcionário responsável: ").nextLine();
        String cpf = capturarDados("Digite o cpf do funcionário responsável: ").nextLine();
        String ctps = capturarDados("Digite a carteira de trabalho do funcionário responsável: ").nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, ctps);
        return funcionario;
    }

    // Método responsável por cadastrar imóvel
    public static Imovel cadastrarImovel() {
        String endereco = capturarDados("Digite seu endereço: ").nextLine();
        double valorAluguel = capturarDados("Digite o valor do aluguel: ").nextDouble();

        Imovel imovel = new Imovel(endereco, valorAluguel);
        imovel.setEndereco(endereco);
        imovel.setValorDoAluguel(valorAluguel);
        return imovel;
    }

    // Método responsável juntar tudo
    public static void executar() {
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (menu) {


            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();

            switch (opcaoDoUsuario) {
                case 1:
                    Imovel imovel = cadastrarImovel();
                    imobiliaria.adicionarImovel(imovel);
                    Funcionario funcionario = cadastrarFuncionario();
                    imovel.setFuncionarioResponsavel(funcionario);
                    cadastrarMoradores(imobiliaria, imovel);
                    break;
                case 2:
                    System.out.println(imobiliaria);
                    break;
                case 3:
                    String statusDeRemocao = removerMoradorPorCpf(imobiliaria);
                    System.out.println(statusDeRemocao);
                    break;
                case 4:
                    System.out.println("Obrigado e volte sempre");
                    menu = false;
                    break;
            }
        }
    }
}
