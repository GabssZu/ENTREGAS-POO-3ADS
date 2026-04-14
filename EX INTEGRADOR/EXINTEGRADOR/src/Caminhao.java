public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao() {
        super();
    }

    public Caminhao(String marca, double capacidadeCarga, int quantidadeEixos) {
        super(marca, capacidadeCarga);
        this.quantidadeEixos = quantidadeEixos;
    }


    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 5.00) + (quantidadeEixos * 50.00);
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "quantidadeEixos=" + quantidadeEixos +
                super.toString()  +
                '}';
    }
}
