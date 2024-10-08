public class Notas {
    private Aluno aluno;
    private double media;

    public Notas(Aluno aluno) {
        this.aluno = aluno;
        this.media = aluno.calcularMedia();
    }

    public void verificarSituacao() {
        aluno.mostrarNotas();
        System.out.printf("Média do aluno: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else if (media < 4.0) {
            System.out.println("Situação: REPROVADO");
        } else {
            System.out.println("Situação: FINAL");
        }
    }
}
