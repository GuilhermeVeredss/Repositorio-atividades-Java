public class Main {
    public static void main(String[] args) throws Exception {
        Cachorro c1 = new Cachorro("Bob", "Lavrador", 4);
        Cachorro c2 = new Cachorro("Nick", "Pitbull", 2);
        Cachorro c3 = new Cachorro("Teo", "Pincher", 3);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        String latido_principal = c1.latir2();
        System.out.println(latido_principal);
    }
}