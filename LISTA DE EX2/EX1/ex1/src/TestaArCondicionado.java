public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("ABC", "Portátil", 22, true);

        System.out.println(ar);
        ar.ativarModoTurbo();
        System.out.println("\n temperatura TURBO:");
        System.out.println(ar);
    }
}
