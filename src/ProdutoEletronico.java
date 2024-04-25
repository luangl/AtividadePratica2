public class ProdutoEletronico extends Produto {
    private String especificacoes;

    public ProdutoEletronico(String nome, String codigo, double preco, String especificacoes) {
        super(nome, codigo, preco);
        this.especificacoes = especificacoes;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    @Override
    public double calcularPrecoTotal() {
        return getPreco(); 
    }

    @Override
    public String toString() {
        return "ProdutoEletronico{" +
                "nome='" + getNome() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preco=" + getPreco() +
                ", especificacoes='" + especificacoes + '\'' +
                '}';
    }
}