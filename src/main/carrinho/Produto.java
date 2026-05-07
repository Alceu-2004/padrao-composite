package carrinho;

public class Produto implements Item {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + nome + " - R$" + preco);
    }
}