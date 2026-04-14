public class TestaPrograma {
    public static void main(String[] args) {
        EmpresaLogistica empresa  = new EmpresaLogistica("SEDEX");

        Caminhao c1 = new Caminhao("VOLVO", 18.0, 4);
        Caminhao c2 = new Caminhao("VOLKSWAGEN", 29.0, 7);


        Van v1 = new Van("FIAT", 1.5, true);
        Van v2 = new Van("RENAULT", 2.0, false);

        empresa.adicionarVeiculo(c1);
        empresa.adicionarVeiculo(c2);
        empresa.adicionarVeiculo(v1);
        empresa.adicionarVeiculo(v2);

        empresa.gerarRelatorioCustos(300.0);

    }
}
