// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.

        Scanner scan = new Scanner(System.in);

        int num1, num2;

        //System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        //System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Sao iguais! ");
        } else {
            System.out.println("Nao sao iguais! ");
        }


    }
}