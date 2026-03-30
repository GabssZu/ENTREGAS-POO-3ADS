
public class ArCondicionado {
  private int temperatura;
    private String marca;
    private String modelo;
    private boolean ligado;

    public ArCondicionado() {
    }
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;}


    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println(" TEMPERATURA FORA DA FAIXA! ");
        }
    }

    public void setMarca(String m) {
        if (m!= null && m.length() >= 3){
            this.marca = m;
        }
    }

    public void ativarModoTurbo (){
        if (verificarCompressor()){
            setTemperatura(16);
            System.out.println ("Modo turbo ativado");
        } else {
            System.out.println ("ERRO - Não foi possivel ativar!");
        }
    }
    private boolean  verificarCompressor() {
        int numero = (int) (Math.random() * 5);
        if (numero > 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "\n marca='" + marca + '\'' +
                "\n, modelo='" + modelo + '\'' +
                "\n, ligado=" + ligado +
                "\n, temperatura=" + temperatura +

                '}';
    }
}