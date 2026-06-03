public class Turma extends Disciplina {
    private String professor;
    private int vagas;

    public Turma (Disciplina disciplina, String professor, int vagas) {
        super(disciplina.getNomeDisciplina(), disciplina.getCargaHoraria());
        this.professor = professor;
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return """
                Disciplina: %s
                Professor: %s
                Vagas: %d alunos
                Carga horária: %d horas
                """.formatted(getNomeDisciplina(), professor, vagas, getCargaHoraria());
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
