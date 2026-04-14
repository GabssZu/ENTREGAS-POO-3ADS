public class Van extends Veiculo{

    private boolean refrigerada;

    public Van() {
        super();
    }

    public Van(String placa, double capacidadeCarga, boolean refrigerada) {
        super(placa, capacidadeCarga);
        this.refrigerada = refrigerada;


    }


    @Override
    public double calcularCustoViagem(double distancia) {
        double custo = distancia * 3.00;
        if (refrigerada) {
            custo += 100.00;
        }
        return custo;
    }

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }

    @Override
    public String toString() {
        return "Van{" +
                "refrigerada=" + refrigerada +
                super.toString()  +
                '}';
    }
}
