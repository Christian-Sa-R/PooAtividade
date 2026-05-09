public class Main {
    public static void main() {
        Turma minhaTurma = new Turma("Programação Orientada a Objetos - T01", "Orlando", 42);
        System.out.println(minhaTurma);

        //minhaTurma.professor = "Orlando Ohashi";
        //minhaTurma.setProfessor("Orlando Ohashi");
        System.out.println(minhaTurma.getProfessor());
    }
}
