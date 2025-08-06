package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um primeiro número: ");
        int num1 = sc.nextInt();

        System.out.printf("Digite um segundo número: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.printf("Maior = %d", Math.max(num1, num2));
    }
}