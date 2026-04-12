public class Whatsapp extends CanalNotificacao{
    private String statusLeitura;

    public Whatsapp() {
        super();
    }

    public Whatsapp(String mensagem, String destinatario, String statusLeitura) {
        super(mensagem, destinatario);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + destinatario +
                "... Mensagem: " + mensagem + " (Status: " + statusLeitura + ")");
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "statusLeitura='" + statusLeitura + '\'' +
                super.toString() +
                '}';
    }
}
