package br.com.senai.model;

public class Cliente {
    private int id;
    protected String nomecliente;
    String email;
    public boolean vip;

    public Cliente() {
    }

    public Cliente(int id, String nomecliente, String email, boolean vip) {
        this.id = id;
        this.nomecliente = nomecliente;
        this.email = email;
        this.vip = vip;
    }

    public void exibirInformacoesCliente() {
        System.out.println("id: " + this.id);
        System.out.println("nome: " + this.nomecliente);
        System.out.println("email: " + this.email);
        System.out.println("vip: " + this.vip);
    }
}
