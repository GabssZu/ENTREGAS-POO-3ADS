import java.time.LocalDateTime;

public class TesteEmprestimo {
    public static void main(String[] args) {

        Leitor leitor = new Leitor(1, "Gabriel");
        Livro livro = new Livro(3, "Watchmen", "Alan Moore");

        LocalDateTime dataEmprestimo = LocalDateTime.now();
        LocalDateTime dataDevolucao = dataEmprestimo.plusDays(7);

        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, leitor, livro);

        System.out.println(emprestimo);
    }
}