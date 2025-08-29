package br.com.senai.service;

import br.com.senai.model.Cliente;
import br.com.senai.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public Produto cadastrarProduto(int codigo, String nomeprod, double preco, int quantidadeEstoque) {
        Produto produto = new Produto(codigo, nomeprod, preco, quantidadeEstoque);
        produtos.add(produto);
        return produto;
    }

    public void removerProduto(int id) {
        if (id < 0 || id >= produtos.size()) {
            System.out.println("Produto não encontrado!");
            return;
        }
        produtos.remove(id);
        System.out.println("Produto removido com sucesso!");
    }

    public Produto buscarProduto(int id) {
        if (id < 0 || id >= produtos.size()) {
            System.out.println("Produto não encontrado!");
            return null;
        }
        return produtos.get(id);
    }

    public void venderProduto(int codigo, int quantidadeEstoque) {
        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            produto.vender(quantidadeEstoque);
        }
    }

    public Cliente cadastrarCliente(int id, String nomecliente, String email, boolean vip) {
        Cliente cliente = new Cliente(id, nomecliente, email, vip);
        clientes.add(cliente);
        return cliente;
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

}