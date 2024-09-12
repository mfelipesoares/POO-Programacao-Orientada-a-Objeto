import java.util.*;

public class MediaAlunos {
    public static float obterMedia(float n1, float n2, float n3) { return (n1 + n2 + n3) / 3;}

    public static float obterMediaGeral(float[] mediaAlunos, int totalAlunos) {
        float mediaGeral = 0;
        for (int i = 0; i < totalAlunos; i++) {
            mediaGeral += mediaAlunos[i];
        }
        return mediaGeral / totalAlunos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] mediaAlunos = new float[5];
        float n1, n2, n3;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite as três notas do aluno %d: ", i);
            n1 = scanner.nextFloat();
            n2 = scanner.nextFloat();
            n3 = scanner.nextFloat();
            mediaAlunos[i] = obterMedia(n1, n2, n3);
            System.out.printf("A média do aluno %d é %f\n", i, mediaAlunos[i]);
        }
        System.out.printf("A média total da turma é: %f\n", obterMediaGeral(mediaAlunos, 5));
        scanner.close();
    }
}
