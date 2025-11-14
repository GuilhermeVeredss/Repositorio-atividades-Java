import java.util.HashMap;
import java.util.Map;

class Pizza {
    private int preco;
    private Map<String, Integer> ingredientesUsados = new HashMap<>();

    public void adicionarIngrediente(String ingrediente, int qnt) {
        if (ingredientesUsados.containsKey(ingrediente)) {
            ingredientesUsados.put(ingrediente, ingredientesUsados.get(ingrediente) + qnt);
        } else {
            ingredientesUsados.put(ingrediente, qnt);
        }
    }

    public void calcularPreco() {
        int qtdIngredientes = ingredientesUsados.size();
        if (qtdIngredientes <= 2) {
            preco = 15;
        } else if (qtdIngredientes <= 5) {
            preco = 20;
        } else {
            preco = 23;
        }
        System.out.println("Sua pizza contém " + qtdIngredientes + " ingredientes e custa R$" + preco);
    }

    public void mostrarIngredientes() {
        System.out.println("Ingredientes usados na pizza:");
        for (Map.Entry<String, Integer> item : ingredientesUsados.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue() + "x");
        }
    }

    public int getQtdItens() {
        return ingredientesUsados.size();
    }

    public int getPreco() {
        return preco;
    }
}