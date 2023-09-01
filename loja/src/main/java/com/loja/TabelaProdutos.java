package com.loja;

import ch.qos.logback.core.util.DatePatternToRegexUtil;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos() {
        Produto caneta = new Produto(1,"Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca","Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis Faber Castel","Lapis Faber Castel comum", 2.99);
        Produto apontador = new Produto(4, "Apontador","Apontador comum com reservatorio", 7.99);
        Produto caderno = new Produto(5, "Caderno espiral","Caderno espiral de 96 folhas", 15.99);
        Produto pasta  = new Produto(6,"Pasta comum","Pasta comum com 50 plasticos", 29.99);
        Produto livro = new Produto(7,"livro", "Livros diversos", 12.99);
        Produto folhas = new Produto(8,"Folha sulfite", "Folhas sulfites brancas", 14.99);
        Produto estojo = new Produto(9,"Estojo", "Estojos diversos com varias divisorias e personagens", 10.99);
        Produto mochila = new Produto(10,"Mochila escolar", "Mochilas escolares diversas", 99.99);



                this.produtos.add(caneta);
                this.produtos.add(borracha);
                this.produtos.add(lapis);
                this.produtos.add(apontador);
                this.produtos.add(caderno);
                this.produtos.add(pasta);
                this.produtos.add(livro);
                this.produtos.add(folhas);
                this.produtos.add(estojo);
                this.produtos.add(mochila);


    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Produto> buscarTodosOsProdutos(){
        return this.getProdutos();
    }

    public Produto buscarProdutoPeloId(int produtoId){
        Produto produtoProcurado = null;
        for (Produto p: this.produtos){
            if (p.getId() == produtoId){
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

    public Produto cadastrarNovoProduto(Produto novoProduto){
        int ultimoIndex = this.produtos.size() - 1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() + 1;

        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;
    }
}
