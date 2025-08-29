# 🛒 Avaliação POO - Sistema de Loja em Java

Este repositório contém a implementação da **Avaliação Prática de Programação Orientada a Objetos (POO)** do curso de **Análise e Desenvolvimento de Sistemas - SENAI**.  
O projeto foi desenvolvido aplicando conceitos fundamentais de **POO em Java**.

---

## 📌 Objetivo
Criar um **sistema de gerenciamento de loja**, organizado em pacotes, permitindo:
- Cadastro, listagem, busca, remoção e venda de produtos.  
- Cadastro e listagem de clientes.  
- Controle de estoque.  
- Aplicação prática de conceitos de POO como **encapsulamento, modificadores de acesso, construtores e métodos**.  


- **App** → Classe principal (`LojaApp`) que inicia o sistema.  
- **Model** → Entidades principais (`Cliente` e `Produto`).  
- **Service** → Regras de negócio (`Pedido`).  
- **View** → Interface de interação via console (`PedidoView`).  

---

## ⚙️ Funcionalidades

### Produto
- Cadastrar produto (código, nome, preço, estoque).  
- Listar produtos cadastrados.  
- Buscar produto por ID.  
- Remover produto.  
- Vender produto (atualizando estoque).  

### Cliente
- Cadastrar cliente (id, nome, e-mail, VIP).  
- Listar clientes cadastrados.  

### Regras de Negócio
- Uso correto de modificadores de acesso (`private`, `protected`, `public`, `default`).  
- Construtores sobrecarregados.  
- Encapsulamento aplicado em atributos não públicos.  
- Uso de `ArrayList` para gerenciamento dinâmico. 

