package br.com.jdbc.controller;

import br.com.jdbc.dao.CategoriaDAO;
import br.com.jdbc.factory.ConnectionFactory;
import br.com.jdbc.modelo.Categoria;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class CategoriaController {

    private CategoriaDAO categoriaDAO;

    public CategoriaController() {
        Connection con = new ConnectionFactory().recuperarConexao();
        this.categoriaDAO = new CategoriaDAO(con);
    }

    public List<Categoria> listar() {
        return this.categoriaDAO.listar();
    }
}
