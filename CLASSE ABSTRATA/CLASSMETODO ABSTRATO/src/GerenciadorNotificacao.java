import java.util.ArrayList;


public class GerenciadorNotificacao {

    public static void main(String[] args) {
        ArrayList<CanalNotificacao> listaNotificacoes = new ArrayList<>();
        listaNotificacoes.add(new Email("Bem vindo á Fatec - Segue em anexo o calendário de seu semestre...","ana@tech.com","Boas vindas"));
        listaNotificacoes.add(new SMS("Seu código de login é 5542","Carlos",99887766 ));
        listaNotificacoes.add(new Whatsapp("Almoço domingo?","Grupo Família","Visto por último às 10:00"));


        System.out.println("### Iniciando o Envio de Notificações ###");

        for (CanalNotificacao canal : listaNotificacoes) {
            System.out.println("------------------------------------");
            canal.exibirDados();
            canal.enviar();
        }

        System.out.println("------------------------------------");
        System.out.println("Processo concluído com sucesso!");
    }
}