import java.util.Scanner;

public class Sistema {
    private static Scanner scanner = new Scanner(System.in);

    public static void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    buscarProduto();
                    break;
                case 3:
                    excluirProduto();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    limparEstoque();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    public static void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Cadastrar produto");
        System.out.println("2. Buscar produto");
        System.out.println("3. Excluir produto");
        System.out.println("4. Listar todos os produtos");
        System.out.println("5. Limpar estoque");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void cadastrarProduto() {
        System.out.println("Informe o tipo de produto (1 - Perecível, 2 - Eletrônico): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Código do produto: ");
        String codigo = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 

        if (tipo == 1) {
            System.out.print("Data de validade (dd/mm/aaaa): ");
            String dataValidade = scanner.nextLine();
            ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(nome, codigo, preco, dataValidade);
            EstoqueManager.adicionarProduto(produtoPerecivel);
        } else if (tipo == 2) {
            System.out.print("Especificações do produto eletrônico: ");
            String especificacoes = scanner.nextLine();
            ProdutoEletronico produtoEletronico = new ProdutoEletronico(nome, codigo, preco, especificacoes);
            EstoqueManager.adicionarProduto(produtoEletronico);
        } else {
            System.out.println("Tipo de produto inválido.");
        }
    }

    public static void buscarProduto() {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        Produto produto = EstoqueManager.buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            System.out.println("Produto encontrado: ");
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void excluirProduto() {
        System.out.print("Digite o código do produto que deseja excluir: ");
        String codigo = scanner.nextLine();
        Produto produto = EstoqueManager.buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            EstoqueManager.removerProduto(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void listarProdutos() {
        EstoqueManager.listarTodosProdutos();
    }

    public static void limparEstoque() {
        EstoqueManager.limparEstoque();
    }
}
