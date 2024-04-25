import java.util.ArrayList;

public class EstoqueControle {
    private static ArrayList<Produto> estoque = new ArrayList<>();

    public static void adicionarProduto(Produto produto) {
        estoque.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static Produto buscarProdutoPorCodigo(String codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    public static void removerProduto(Produto produto) {
        estoque.remove(produto);
        System.out.println("Produto removido com sucesso!");
    }

    public static void listarTodosProdutos() {
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }

    public static void limparEstoque() {
        estoque.clear();
        System.out.println("Estoque limpo com sucesso!");
    }
}