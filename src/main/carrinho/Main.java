package carrinho;

public class Main {

    public static void main(String[] args) {

        Produto mouse = new Produto("Mouse Gamer", 150);
        Produto teclado = new Produto("Teclado Mecânico", 300);
        Produto headset = new Produto("Headset RGB", 250);

        Combo comboGamer = new Combo("Combo Gamer");

        comboGamer.adicionarItem(mouse);
        comboGamer.adicionarItem(teclado);
        comboGamer.adicionarItem(headset);

        Produto monitor = new Produto("Monitor 144Hz", 1200);

        Combo setupCompleto = new Combo("Setup Completo");

        setupCompleto.adicionarItem(comboGamer);
        setupCompleto.adicionarItem(monitor);

        setupCompleto.exibir("");

        System.out.println("\nValor total: R$" + setupCompleto.getPreco());
    }
}