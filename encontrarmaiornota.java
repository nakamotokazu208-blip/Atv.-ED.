import java.util.Scanner;

public class encontrarmaiornota {

    public static void main(String[] args) {
        double[] notas = new double[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas dos 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        scanner.close();

        double maiorNota = notas[0]; 
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i]; 
            }
        }

        System.out.println("A maior nota entre os 10 alunos é: " + maiorNota);
    }
}