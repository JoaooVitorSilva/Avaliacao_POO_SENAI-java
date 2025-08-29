package br.com.senai.view;

import br.com.senai.model.Cliente;
import br.com.senai.model.Produto;
import br.com.senai.service.Pedido;

import java.util.List;
import java.util.Scanner;

public class PedidoView {

    private Scanner tec = new Scanner(System.in);
    private Pedido pedido = new Pedido();

    public void menu() {
        boolean exec = true;

        do {
            System.out.println("\n--- MENU PRODUTOS ---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Buscar Produto");
            System.out.println("5 - Vender Produto");
            System.out.println("7 - Cadastrar Cliente");
            System.out.println("8 - Listar Cliente");
            System.out.println("9 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = tec.nextInt();
            tec.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    buscarProduto();
                    break;
                case 5:
                    venderProduto();
                    break;
                case 7:
                    cadastrarCliente();
                    break;
                case 8:
                    listarCliente();
                    break;
                case 9:
                    exec = false;
                    System.out.println("Sistema finalizado...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (exec);
    }

    private void cadastrarProduto() {
        System.out.print("Codigo: ");
        int codigo = tec.nextInt();
        System.out.print("Nome: ");
        tec.nextLine();
        String nomeprod = tec.nextLine();
        System.out.print("Preço: ");
        double preco = tec.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadeEstoque = tec.nextInt();
        tec.nextLine();

        pedido.cadastrarProduto(codigo, nomeprod, preco, quantidadeEstoque);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void listarProdutos() {
        List<Produto> produtos = pedido.listarProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.print("ID " + i + " - ");
                produtos.get(i).exibirInformacoesProduto();
            }
        }
    }

    private void removerProduto() {
        System.out.print("Informe o ID: ");
        int codigo = tec.nextInt();
        tec.nextLine();
        pedido.removerProduto(codigo);
    }

    private void buscarProduto() {
        System.out.print("Informe o codigo: ");
        int codigo = tec.nextInt();
        tec.nextLine();
        Produto produto = pedido.buscarProduto(codigo);
        if (produto != null) {
            produto.exibirInformacoesProduto();
        }
    }

    private void venderProduto() {
        System.out.print("Informe o ID: ");
        int codigo = tec.nextInt();
        System.out.print("Quantidade: ");
        int quantidadeEstoque = tec.nextInt();
        tec.nextLine();
        pedido.venderProduto(codigo, quantidadeEstoque);
    }

    private void cadastrarCliente() {
        System.out.print("codigo: ");
        int id = tec.nextInt();
        System.out.print("Nome: ");
        tec.nextLine();
        String nomecliente = tec.nextLine();
        System.out.print("email: ");
        String email = tec.nextLine();
        System.out.print("vip: ");
        boolean vip = tec.nextBoolean();
        tec.nextLine();

        pedido.cadastrarCliente(id, nomecliente, email, vip);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void listarCliente() {
        List<Cliente> clientes = pedido.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.print("ID " + i + " - ");
                clientes.get(i).exibirInformacoesCliente();
            }
        }
    }

}