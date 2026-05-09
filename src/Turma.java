public class Turma {
    private String nomeDisciplina;
    private String professor;
    private int vagas;

    public Turma (String nomeDisciplina, String professor, int vagas) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return """
                Disciplina: %s
                Professor: %s
                Capacidade: %d
                """.formatted(nomeDisciplina, professor, vagas);
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
}
