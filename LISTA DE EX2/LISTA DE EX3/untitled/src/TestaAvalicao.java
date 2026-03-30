public class TestaAvalicao {public static void main(String[] args) {
    Aluno a1 = new Aluno(1, "GABRIEL", "14409567", "ADS");
    Aluno a2 = new Aluno(2, "PAULO", "1330222028", "ADS");

    Disciplina d = new Disciplina(1, "Programação Orientada a Objetos", "Prof. Daniel");

    d.matricularAluno(a1);
    d.matricularAluno(a2);

    d.criarAvaliacao(1, "Prova Semestral");

    Avaliacao av = d.getUltimaAvaliacao();

    av.adicionarQuestao(1, "O que é POO?", 2.0f);
    av.adicionarQuestao(2, "Explique o que é encapsulamento:", 3.0f);
    av.adicionarQuestao(3, "Diferencie entre agregação e composição?", 5.0f);

    System.out.println(d);
}
}