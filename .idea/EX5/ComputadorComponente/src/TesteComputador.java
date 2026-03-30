public class TesteComputador {
    public static void main(String[] args) {
        Computador pc = new Computador(1, "Asus", "AMD Ryzen", "7000 (Zen 4)", 3.5);
        System.out.println(pc);
        pc = null;

        System.out.println("\nComputador foi removido da memória.");
    }
}