public class Main {
    public static void main() {
        /*Turma minhaTurma = new Turma("Programação Orientada a Objetos - T01", "Orlando", 42);
        System.out.println(minhaTurma);

        minhaTurma.professor = "Orlando Ohashi";
        minhaTurma.setProfessor("Orlando Ohashi");
        System.out.println(minhaTurma.getProfessor());
         */
        Turma[] turmas = new Turma[5];
        turmas[0] = new Turma("Estrutura de Dados", "Fulano Primeiro", 40);
        turmas[1] = new Turma("Programação Orientada a Objetos", "Fulano Segundo", 60);
        turmas[2] = new Turma("Redes de Computadores", "Fulano Terceiro", 50);
        turmas[3] = new Turma("Sistemas Multimídia", "Fulano Quarto", 40);
        turmas[4] = new Turma("Teoria Geral dos Sistemas", "Fulano Quinto", 55);

        for (Turma turma:turmas){
            System.out.println(turma);
        }
    }
}
