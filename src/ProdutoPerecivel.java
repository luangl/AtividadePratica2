public class ProdutoPerecivel extends Produto {

    private String dataValidade;

    public ProdutoPerecivel(String nome, String codigo, double preco, String dataValidade) {
        super(nome, codigo, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularPrecoTotal() {
        return getPreco();
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "nome='" + getNome() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preco=" + getPreco() +
                ", dataValidade='" + dataValidade + '\'' +
                '}';
    }
}