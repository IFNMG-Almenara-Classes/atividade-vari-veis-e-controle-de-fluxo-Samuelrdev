package questao11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.print("Pares de 0 até " + numero + ": ");
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }
        sc.close();
    }
}
