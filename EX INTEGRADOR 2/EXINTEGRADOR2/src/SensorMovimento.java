public class SensorMovimento extends DispositivoSeguranca implements DispositivoConectado{
    private double sensibilidade;


    public SensorMovimento() {
        super();
    }

    public SensorMovimento(String localizacao, boolean ativo, double sensibilidade) {
        super(localizacao, ativo);
        this.sensibilidade = sensibilidade;
    }

    @Override
    public void dispararAlerta(){
        System.out.println("    ==  Movimento detectado em " + localizacao + " Acionando luzes de emergência ==   ");
    };



    @Override
    public void conectarWitone() {
        System.out.println("    ==  Sensor conectado via rádio frequência 433MHz  ");

    }

    @Override
    public void realizarAutodiagnostico() {

    }



    public double getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(double sensibilidade) {
        this.sensibilidade = sensibilidade;
    }

    @Override
    public String toString() {
        return "SensorMovimento{" +
                "sensibilidade=" + sensibilidade +
                super.toString() +
                '}';
    }
}
