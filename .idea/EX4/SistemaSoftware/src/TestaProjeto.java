public class TestaProjeto {
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Meloni", "SQL");
        Programador p2 = new Programador(2, "Kennedy", "Python");
        Programador p3 = new Programador(3, "Henrique", "Java");

        Projeto projeto = new Projeto(1, "Sistema para ONG instituto luz de ló");

        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);
        projeto.adicionarProgramador(p3);

        projeto.listarProgramadores();
    }
}

