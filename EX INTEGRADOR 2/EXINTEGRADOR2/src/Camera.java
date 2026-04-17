public class Camera extends DispositivoSeguranca implements DispositivoConectado{

    private String resolucao;


    public Camera() {
        super();
    }

    public Camera(String resolucao) {
        this.resolucao = resolucao;
    }

    public Camera(String localizacao, boolean ativo, String resolucao) {
        super(localizacao, ativo);
        this.resolucao = resolucao;
    }

    @Override
    public void dispararAlerta(){
        System.out.println("Gravando imagens em " + resolucao +
                " de " + localizacao + " e enviando para a central");
    };


    @Override
    public void conectarWitone() {
        System.out.println("    ==  Câmera conectada via protocolo seguro SSL ==   ");

    }

    @Override
    public void realizarAutodiagnostico() {

    }



    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "resolucao='" + resolucao + '\'' +
                super.toString() +
                '}';
    }


}
