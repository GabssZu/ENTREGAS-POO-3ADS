

public abstract class CanalNotificacao {
  protected String mensagem, destinatario;

    public CanalNotificacao() {
    }

    public CanalNotificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public void exibirDados (){
        System.out.println("    DESTINATARIO:   " + destinatario);
        System.out.println("    MENSAGEM:   " + mensagem);


    }
    public abstract void enviar();


    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "CanalNotificacao{" +
                "mensagem='" + mensagem + '\'' +
                ", destinatario='" + destinatario + '\'' +
                '}';
    }
}