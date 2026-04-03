public class Aviao extends Veiculo {
        private float altitudeMax;

    public Aviao(float velocidade, String modelo, String marca, float altitudeMax) {
        super(velocidade, modelo, marca);
        this.altitudeMax = altitudeMax;
    }
    @Override
    public void mover(){
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeMax + " metros.");
    }
    @Override
    public void abastecendo(){
        System.out.println(" Abastecendo com querosene de aviação...");
    }

}
