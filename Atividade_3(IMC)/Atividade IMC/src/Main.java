public class Main {
    public static void main(String[] args) throws Exception {
        Paciente p1 = new Paciente(1.90, 87.0);
        Paciente p2 = new Paciente(1.62, 77.0);
        Paciente p3 = new Paciente(1.70, 150.0);

        p1.resultado();
        System.out.println("\n\n");

        p2.resultado();
        System.out.println("\n\n");

        p3.resultado();
        System.out.println("\n\n");
    }
}