import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompra {
    private List<Pizza> pizzas = new ArrayList<>();

    public void addItens(Pizza p) {
        if (p.getQtdItens() > 0) {
            pizzas.add(p);
            System.out.println("\nPizza Adicionada no seu carrinho");
        } else {
            System.out.println("\nVoce precisa adicionar pelo menos um ingrediente a pizza");
        }
    }

    public int valorTotal() {
        int vtotal = 0;
        for (Pizza p : pizzas) {
            vtotal += p.getPreco();
        }
        return vtotal;
    }

    public void mostrarTudo() {
        System.out.println("\n\nValor total: " + valorTotal());
    }
}