package br.com.productcontrol.service;

import br.com.productcontrol.dao.ProdutoDAO;
import br.com.productcontrol.model.Produto;
import java.util.List;

public class ProdutoService {

    private ProdutoDAO dao;

    public ProdutoService() {
        this.dao = new ProdutoDAO();
    }

    // Adicionar produto com validação
    public boolean adicionarProduto(Produto produto) {
        if (produto.getNome() == null || produto.getNome().isEmpty()) {
            System.out.println("Erro: Produto deve ter um nome.");
            return false;
        }
        if (dao.buscarPorNome(produto.getNome()) != null) {
            System.out.println("Erro: Produto já existe.");
            return false;
        }
        dao.adicionar(produto);
        return true;
    }

    // Listar produtos
    public List<Produto> listarProdutos() {
        return dao.listar();
    }

    // Atualizar produto
    public boolean atualizarProduto(String nome, Produto produtoAtualizado) {
        return dao.atualizar(nome, produtoAtualizado);
    }

    // Remover produto
    public boolean removerProduto(String nome) {
        return dao.remove(nome);
    }
}
