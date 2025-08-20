.Criar um vetor com 10 idades e exibir em tela as idades maiores que 18 anos

import java.util.Scanner;

public class idadeteste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[10];

        System.out.println("Digite 10 idades:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        System.out.println("\nIdades maiores que 18 anos:");

        for (int i = 0; i < 10; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i]);
            }
        }
        scanner.close();
    }

}
