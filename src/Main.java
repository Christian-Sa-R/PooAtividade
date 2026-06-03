public class Main {
    public static void main() {
        Disciplina POO = new Disciplina("POO", 60);
        System.out.println(POO);

        Turma POO01 = new Turma(POO, "Christian", 45);
        System.out.println(POO01);
    }
}
