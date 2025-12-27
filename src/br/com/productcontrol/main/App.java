package br.com.productcontrol.main;

import br.com.productcontrol.model.Produto;
import br.com.productcontrol.service.ProdutoService;
import br.com.productcontrol.util.InputUtil;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        int opcao;

        System.out.println("=== Sistema de Controle de Produtos ===");

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");

            opcao = InputUtil.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    String nome = InputUtil.lerString("Nome do produto: ");
                    double preco = InputUtil.lerDouble("Preço: ");
                    int quantidade = InputUtil.lerInt("Quantidade: ");

                    Produto p = new Produto(nome, preco, quantidade);
                    if (service.adicionarProduto(p)) {
                        System.out.println("Produto adicionado com sucesso!");
                    }
                    break;

                case 2:
                    List<Produto> produtos = service.listarProdutos();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Produtos cadastrados:");
                        for (Produto produto : produtos) {
                            System.out.printf("Nome: %s | Preço: %.2f | Quantidade: %d%n",
                                    produto.getNome(), produto.getPreco(), produto.getQuantidade());
                        }
                    }
                    break;

                case 3:
                    String nomeAtual = InputUtil.lerString("Nome do produto a atualizar: ");
                    String novoNome = InputUtil.lerString("Novo nome: ");
                    double novoPreco = InputUtil.lerDouble("Novo preço: ");
                    int novaQuantidade = InputUtil.lerInt("Nova quantidade: ");

                    Produto atualizado = new Produto(novoNome, novoPreco, novaQuantidade);
                    if (service.atualizarProduto(nomeAtual, atualizado)) {
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    String nomeRemover = InputUtil.lerString("Nome do produto a remover: ");
                    if (service.removerProduto(nomeRemover)) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
