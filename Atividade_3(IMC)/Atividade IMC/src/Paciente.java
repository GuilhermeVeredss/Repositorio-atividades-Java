public class Paciente {
    public double peso;
    public double altura;
    public int numero;
    public double IMC;
    public static int contador;

    public Paciente(double alt, double pes){
        altura = alt;
        peso = pes;

        contador++;
        numero = contador;
    }

    public int numeropac(){
        return numero;
    }

    public double calcularIMC(){
        IMC = peso/(altura*altura);

        return IMC;
    }

    public String diagnostico(){
        if(calcularIMC() < 16){
            return "Baixo peso muito grave(IMC abaixo de 16kg/m²)";
        }else if(calcularIMC() >= 16 && calcularIMC() < 17){
            return "Baixo peso grave(IMC maior ou igual a 16 e menor que 17kg/m²)";
        }else if(calcularIMC() >= 17 && calcularIMC() < 18.5){
            return "Baixo peso(IMC maior ou igual a 17 e menor que 18,5kg/m²)";
        }else if(calcularIMC() >= 18.5 && calcularIMC() < 25){
            return "Peso normal(IMC maior ou igual a 18,5 e menor que 25kg/m²)";
        }else if(calcularIMC() >= 25 && calcularIMC() < 30){
            return "Sobrepeso(IMC maior ou igual a 25 e menor que 30kg/m²)";
        }else if(calcularIMC() >= 30 && calcularIMC() < 35){
            return "Obesidade grau I(IMC maior ou igual a 30 e menor que 35kg/m²)";
        }else if(calcularIMC() >= 35 && calcularIMC() < 40){
            return "Obesidade grau II(IMC maior ou igual a 35 e menor que 40kg/m²)";
        } else if(calcularIMC() >= 40){
            return "Obesidade grau III(obesidade mórbida = IMC maior ou igual a 40kg/m²)";
        }
        return "";
    }

public void resultado(){
    System.out.println("Paciente " + numeropac() + "\nIMC: " + calcularIMC() + "\nDiagnóstico: " + diagnostico());
}
}