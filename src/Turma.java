public class Turma {
    int idTurma;
    String nome;
    String professor;
    int vagas;

    public Turma (int idTurma, String nome, String professor, int vagas) {
        this.idTurma = idTurma;
        this.nome = nome;
        this.professor = professor;
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return """
                Disciplina: %s
                Professor: %s
                Capacidade: %d
                """.formatted(nome, professor, vagas);
    }
}
