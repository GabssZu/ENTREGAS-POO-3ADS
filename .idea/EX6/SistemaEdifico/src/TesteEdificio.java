public class TesteEdificio {
    public static void main(String[] args) {
    Edificio edificio = new Edificio("Franca Garden", "Av. Santa Cruz, 3255");

    edificio.construirApartamento(113, 1);
    edificio.construirApartamento(214, 2);
    edificio.construirApartamento(320, 3);

    System.out.println(edificio);

    edificio = null;

    System.out.println("\nEdifício removido da memória.");
}
}