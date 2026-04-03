public class Teste {
    public static void main(String[] args) {
    Aviao aviao = new Aviao(900,"Boeng 747-400","Boeng",30000);
    CarroEletrico carro = new CarroEletrico(120,"Yuan Pro","BYD", 400 );
        Veiculo generic;

        System.out.println("Chama o método anulado em Aviao");
        generic = aviao;
        generic.mover();
        generic.abastecendo();

        System.out.println("\n// Chama o método anulado em CarroEletrico");
        generic = carro;
        generic.mover();
        generic.abastecendo();
    }}