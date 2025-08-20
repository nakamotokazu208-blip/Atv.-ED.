. Acrescente seu nome na posição 3 do vetor e exiba-o em tela

import java.util.Arrays; 

public class arrayexercicio {

    public static void main(String[] args) {
     
        String[] nomes = {"Pessoa1", "Pessoa2", "Pessoa3", "Pessoa4"};
        System.out.println("Array original: " + Arrays.toString(nomes));

        String meuNome = "Kazunori"; 
        int posicao = 3;

        String[] novoArray = new String[nomes.length + 1];

        for (int i = 0, j = 0; i < novoArray.length; i++) {
            if (i == posicao) {
                novoArray[i] = meuNome;
            } else {
                novoArray[i] = nomes[j];
                j++;
            }
        }

        System.out.println("Array com nome: " + Arrays.toString(novoArray));
    }

}
