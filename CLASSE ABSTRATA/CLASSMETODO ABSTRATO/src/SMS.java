public class SMS extends CanalNotificacao{
    private int nroTelefone;

    public SMS() {
        super();
    }

    public SMS(String mensagem, String destinatario, int nroTelefone) {
        super(mensagem, destinatario);
        this.nroTelefone = nroTelefone;
    }
    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número " + nroTelefone + ": " + mensagem);
    }


    public int getNroTelefone() {
        return nroTelefone;
    }

    public void setNroTelefone(int nroTelefone) {
        this.nroTelefone = nroTelefone;
    }

    @Override
    public String toString() {
        return "SMS{" +
                "nroTelefone=" + nroTelefone +
                super.toString() +
                '}';
    }
}
