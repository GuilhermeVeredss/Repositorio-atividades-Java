public class Gato {
    public static int quantidade_de_gatos=0; 
    public String nome;
    public int idade;

    public Gato(String nom, int idad) {
        nome = nom;
        idade = idad;

        quantidade_de_gatos++;
    }

    public static void verNumeroGatos(){
        System.out.println("Quantidade de gatos: " + quantidade_de_gatos);
    }

    public void ver(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }

}