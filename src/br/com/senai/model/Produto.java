package br.com.senai.model;

public class Produto {
    private int codigo;
    public String nomeprod;
    protected double preco;
    int quantidadeEstoque;

    public Produto() {
    }

    public Produto(int codigo, String nomeprod, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nomeprod = nomeprod;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public void exibirInformacoesProduto() {
        System.out.println("codigo: " + this.codigo);
        System.out.println("nome: " + this.nomeprod);
        System.out.println("preço: " + this.preco);
        System.out.println("Quantidade no estoque: " + this.quantidadeEstoque);
    }

    public void vender(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente!!!");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        }
    }
}
