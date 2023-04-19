package br.com.jdbc.controller;

import br.com.jdbc.dao.ProdutoDAO;
import br.com.jdbc.factory.ConnectionFactory;
import br.com.jdbc.modelo.Produto;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private ProdutoDAO produtoDAO;

    public ProdutoController() {
        Connection con = new ConnectionFactory().recuperarConexao();
        this.produtoDAO = new ProdutoDAO(con);
    }

    public void deletar(Integer id) {
        this.produtoDAO.deletar(id);
    }

    public void salvar(Produto produto) {
        this.produtoDAO.salvar(produto);
    }

    public List<Produto> listar() {
        return this.produtoDAO.listar();
    }

    public void alterar(String nome, String descricao, Integer id) {
        System.out.println("Alterando produto");
    }

}
