public class Carro {
    public int potencia;
    public int velocidade;
    public String nome;
    public int velocidademaxima;


    public void acelerar(){
        velocidade += potencia;

        if(velocidade >= velocidademaxima){
            velocidade = velocidademaxima;
        }
    }

    public void frear(){
        velocidade = velocidade/2;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void imprimir(){
        System.out.println("O carro " + nome + " está a velocidade de " + getVelocidade() + "km/h");
    }
}
