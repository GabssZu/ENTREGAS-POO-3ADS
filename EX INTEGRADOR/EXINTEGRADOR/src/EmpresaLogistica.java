import java.util.ArrayList;

public class EmpresaLogistica {
    private String nomeEmpresa;
    private ArrayList<Veiculo> frota;

    public EmpresaLogistica(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void gerarRelatorioCustos(double distancia) {
        System.out.println("=== Relatório de Custos - " + nomeEmpresa + " ===");
        System.out.println("Distância considerada: " + distancia + " km\n");

        for (Veiculo v : frota) {
            v.exibirDados();
            double custo = v.calcularCustoViagem(distancia);
            System.out.printf("Custo Estimado da Viagem: R$ %.2f%n", custo);
            System.out.println("--------------------------------------");
        }
    }
}