public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico(float velocidade, String modelo, String marca, int autonomiaBateria) {
        super(velocidade, modelo, marca);
        this.autonomiaBateria = autonomiaBateria;

    }

    @Override
    public void mover(){
        System.out.println(" Carro elétrico movendo-se silenciosamente ");
    }
    @Override
    public void abastecendo(){
        System.out.println( "Recarregando bateria em posto de carga rápida...");
    }

}




