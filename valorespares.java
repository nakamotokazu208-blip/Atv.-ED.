import java.util.Random;

public class valorespares {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50) + 1; 
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Números pares no vetor:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}