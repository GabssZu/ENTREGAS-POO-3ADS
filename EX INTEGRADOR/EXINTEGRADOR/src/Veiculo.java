
public abstract class Veiculo {
    protected String marca;
    double capacidadeCarga;


    public Veiculo() {
    }

    public Veiculo(String marca, double capacidadeCarga) {
        this.marca = marca;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void exibirDados (){
        System.out.println ("MARCA DO VEICULO === " + marca);
        System.out.println ("CAPACIDADE DO VEICULO === " + capacidadeCarga);


    }


    public abstract double calcularCustoViagem(double distancia);


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", capacidadeCarga=" + capacidadeCarga +
                '}';
    }
}