package carrinho;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Item {

    private String nome;
    private List<Item> itens;

    public Combo(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {

        double total = 0;

        for (Item item : itens) {
            total += item.getPreco();
        }

        return total;
    }

    @Override
    public void exibir(String prefixo) {

        System.out.println(prefixo + nome + " - Total: R$" + getPreco());

        for (Item item : itens) {
            item.exibir(prefixo + "   ");
        }
    }
}