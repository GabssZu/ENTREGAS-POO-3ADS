public class Email extends CanalNotificacao {
    private String assunto;

    public Email() {
        super();
    }

    public Email(String mensagem, String destinatario, String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }


    @Override
    public void enviar(){
        System.out.println("Enviando E-mail para " + destinatario +
                " com o assunto [" + assunto + "]: " + mensagem);
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Email{" +
                "assunto='" + assunto + '\'' +
                super.toString() +
                '}';
    }
}