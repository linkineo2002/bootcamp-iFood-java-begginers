// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num, pos = -1;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        System.out.println("Digite numero de uma posicao: ");
        num = leitor.nextInt();

        pos = posicao(num, elementos);

        if (pos == -1) {
            System.out.println("Numero " + num + " nao encontrado!");
        } else {
            System.out.println("Achei " + num + " na posicao " + pos);
        }
    }
    //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    static int posicao(int num, int[] elementos) {
        int pos = -1;
        for (int i = 0; i < elementos.length; i++) {
            if (num == elementos[i]) {
                pos = i;
            }
        }

        return pos;
    }
}
