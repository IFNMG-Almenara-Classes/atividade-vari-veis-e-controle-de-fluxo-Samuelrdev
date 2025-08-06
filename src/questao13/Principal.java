package questao13;

import java.util.Scanner;

public class Principal {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static int dividir (int a, int b){
        return a / b;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 2 numeros inteiros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("Deseja:%n1 - Somar%n2 - Subtrair%n3 - Multiplicar%n4 - Divir%n5 - Sair%nOpção: ");
        int opcao = sc.nextInt();
        System.out.print("Resultado = ");
        switch (opcao) {
            case 1:
                System.out.printf("%d", somar(num1, num2));
                break;
            case 2:
                System.out.printf("%d", subtrair(num1, num2));
                break;
            case 3:
                System.out.printf("%d", multiplicar(num1, num2));
                break;
            case 4:
                System.out.printf("%d", dividir(num1, num2));
                break;
            case 5:
                break;

            default:
                System.out.print("Solicite uma opção valida");
                break;
        }
        sc.close();
    }
}
