package carrinho;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTest {

    @Test
    void deveCalcularPrecoProdutoIndividual() {

        Produto mouse = new Produto("Mouse", 100);

        assertEquals(100, mouse.getPreco());
    }

    @Test
    void deveCalcularPrecoCombo() {

        Produto mouse = new Produto("Mouse", 100);
        Produto teclado = new Produto("Teclado", 200);

        Combo combo = new Combo("Combo");

        combo.adicionarItem(mouse);
        combo.adicionarItem(teclado);

        assertEquals(300, combo.getPreco());
    }

    @Test
    void deveCalcularPrecoComboComOutroCombo() {

        Produto mouse = new Produto("Mouse", 100);
        Produto teclado = new Produto("Teclado", 200);

        Combo comboGamer = new Combo("Combo Gamer");
        comboGamer.adicionarItem(mouse);
        comboGamer.adicionarItem(teclado);

        Produto monitor = new Produto("Monitor", 1000);

        Combo setup = new Combo("Setup");
        setup.adicionarItem(comboGamer);
        setup.adicionarItem(monitor);

        assertEquals(1300, setup.getPreco());
    }

    @Test
    void deveExibirEstruturaCompleta() {

        Produto mouse = new Produto("Mouse", 100);

        Combo combo = new Combo("Combo");
        combo.adicionarItem(mouse);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        combo.exibir("");

        String output = out.toString();

        assertTrue(output.contains("Combo"));
        assertTrue(output.contains("Mouse"));
    }

    @Test
    void devePermitirComboVazio() {

        Combo combo = new Combo("Combo Vazio");

        assertEquals(0, combo.getPreco());
    }
}