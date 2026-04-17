public class SistemaCondominio {
    public static void main(String[] args) {
        Camera cam1 = new Camera("Entrada Principal", true, "1080p");
        Camera cam2 = new Camera("Garagem", true, "4K");

        SensorMovimento sensor1 = new SensorMovimento("Corredor", true, 0.8);
        SensorMovimento sensor2 = new SensorMovimento("Portão", true, 0.9);

        Condominio condominio = new Condominio("Residencial Franca");
        condominio.adicionarDispositivo(cam1);
        condominio.adicionarDispositivo(cam2);
        condominio.adicionarDispositivo(sensor1);
        condominio.adicionarDispositivo(sensor2);

        condominio.testeGeralSeguranca();





    }




}
