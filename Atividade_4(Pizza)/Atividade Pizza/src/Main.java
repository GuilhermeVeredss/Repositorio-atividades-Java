public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        p1.adicionarIngrediente("Queijo", 1);
        p1.adicionarIngrediente("Frango", 1);
        p1.calcularPreco();
        p1.mostrarIngredientes();
        carrinho.addItens(p1);
        System.out.println("\n\n");

        p2.adicionarIngrediente("Peperoni", 1);
        p2.adicionarIngrediente("Carne desfiada", 1);
        p2.adicionarIngrediente("Salsinha", 1);
        p2.calcularPreco();
        p2.mostrarIngredientes();
        carrinho.addItens(p2);
        System.out.println("\n\n");

        p3.adicionarIngrediente("Camarao", 1);
        p3.adicionarIngrediente("Atum", 1);
        p3.calcularPreco();
        p3.mostrarIngredientes();
        carrinho.addItens(p3);
        System.out.println("\n\n");

        carrinho.mostrarTudo();
    }
}