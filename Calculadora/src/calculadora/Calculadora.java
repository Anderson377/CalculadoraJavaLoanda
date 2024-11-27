
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // DECLARAÇÃO DA CLASSE SCANNER
        Scanner sc = new Scanner(System.in);

        // DECLARAÇÃO DAS VARIAVEIS
        int opcao = 0;
        int num1, num2, soma;

        do{
            // IMPRESSÃO DO MENU
            System.out.println("---- CALCULADORA ----");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - DIVISÃO");
            System.out.println("4 - MULTIPLICAÇÃO");
            System.out.println("0 - SAIR");
            opcao = sc.nextInt();

            switch( opcao ){
                // CALCULO DE SOMA
                case 1:
                    System.out.println("---- SOMAR ----");
                    System.out.println("Insira o primeiro número");
                    num1 = sc.nextInt();
                    System.out.println("Insira o segundo número");
                    num2 = sc.nextInt();

                    soma = num1 + num2;

                    System.out.println("A soma é: " + soma);


                    // CHAMADA PARA O MÉTODO SOMAR - Obs para utilizar o método retirar as DUAS BARRAS
                    //somar();
                    break;

                // CALCULO SUBTRAÇÃO
                case 2:

                    break;

                // CALCULO DIVISÃO
                case 3:

                    break;

                // CALCULO MULTIPLICAÇÃO
                case 4:

                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida");
                    break;
            }
           
          // CONDIÇÃO DE PARADA DO BLOCO DO-WHILE
        }while(opcao != 0);

        // FECHAMENTO OBRIGATÓTIO DO MÉTODO SCANNER
        sc.close();
    }

    // MÉTODO SOMAR
    public static void somar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("O resultado é: " + soma);
    }
    
}
