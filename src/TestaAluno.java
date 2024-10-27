public class TestaAluno {
    public static void main(String[] args) {

        Aluno mari = new Aluno();
        mari.setNome("Marileia");
        mari.setIdade(38);
        mari.setN1(8);
        mari.setN2(8);
        mari.setN3(9);
        mari.setN4(9);


        System.out.println(mari);
        mari.imprimirSituacao();

        System.out.println();


        Aluno ana = new Aluno();
        ana.setNome("Ana");
        ana.setIdade(19);
        ana.setN1(9);
        ana.setN2(9);
        ana.setN3(8);
        ana.setN4(8);


        System.out.println(ana);
        ana.imprimirSituacao();
    }
}
