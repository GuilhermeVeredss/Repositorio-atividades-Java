public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public Cachorro (String n, String r, int i){
        nome = n;
        raca = r;
        idade = i;
    }

    //métosdos
    public void latir(){
        System.out.println("au au");
    }

    public String latir2(){
        return "eu conheci um cara androgino no colegio";
    }

    public void carac(){
        System.out.println("Nome: " + nome + "\nRaca: " + raca + "\nIdade: " + idade);
    }

    public void imprimir(){
        carac();
        latir();
    }
    
}