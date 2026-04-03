
public class Veiculo {
    protected String marca, modelo;
    protected float velocidade;

    public Veiculo(float velocidade, String modelo, String marca) {
        this.velocidade = velocidade;
        this.modelo = modelo;
        this.marca = marca;
    }
    public void mover(){
        System.out.println("O véiculo esta se movendo...");
    }

    public void abastecendo(){
        System.out.println(" véiculo reabastecendo...");
    }


}