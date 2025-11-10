public class Main {
    public static void main(String[] args) throws Exception {
        

        Gato g1 = new Gato("Garfield", 4);
        Gato g2 = new Gato("Gato de Botas", 2);
        Gato g3 = new Gato("Tom", 8);


        g1.ver();
        System.out.println("\n");

        g2.ver();
        System.out.println("\n");

        g3.ver();
        System.out.println("\n");

        Gato.verNumeroGatos();

        System.out.println("Quantidade de gatos: " + Gato.quantidade_de_gatos);

        Double media = calcularMedia(4.0, 8.0);

        System.out.println("Valor da média: " + media);

    }

    public static Double calcularMedia(Double a, Double b){

        return (a+b)/2;
    }
}