// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

//Desafio: Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
//Entrada: A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda
//Saída: A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.


//Exemplo 1:    Entrada A: 5  |   Entrada N: 20   |   Saída: 50
//Exemplo 2:    Entrada A: 3  |   Entrada N: 18   |   Saída: 63

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, n;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        a = input.nextInt();
        System.out.println("Digite o número limite: ");
        n = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        for(int i = 1; i <= n; i++){
            if(i % a == 0){
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
