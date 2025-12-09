package br.com.productcontrol.dao;

import br.com.productcontrol.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

	private List<Produto> produtos;
	
	public ProdutoDAO() {
		this.produtos = new ArrayList<>();
	}
	
	// Criar produto
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	// Listar Produtos
	public List<Produto> listar(){
		return produtos;
	}
	
	// Buscar 
	public Produto buscarPorNome(String nome) {
		for (Produto p : produtos) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				return p;
			}
		}
		return null; // Nao encontrou
	}
	
	// Atualizar
	public boolean atualizar(String nome, Produto produtoAtualizado) {
		Produto p = buscarPorNome(nome);
		if (p != null) {
			p.setNome(produtoAtualizado.getNome());
			p.setPreco(produtoAtualizado.getPreco());
			p.setQuantidade(produtoAtualizado.getQuantidade());
			return true;
		}
		return false; // Nao encontrou
	}
	
	// Remover Produto
	public boolean remove(String nome) {
		Produto p = buscarPorNome(nome);
		if (p != null) {
			produtos.remove(p);
			return true;
		}
		return false;
	}
		
}


