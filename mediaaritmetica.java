.Criar um vetor com 4 notas e exibir em tela a média aritmética das nota

public class mediaaritmetica {

    public static void main(String[] args) {

        double[] notas = {8.2, 7.5, 9.1, 6.9};

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i]; 
        }

        double media = soma / notas.length;

        System.out.println("A média das notas é: " + media);

    }

}
