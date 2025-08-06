package questao06;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um primeiro numero: ");
        int numero_1 = sc.nextInt();
        System.out.print("Digite um segundo numero: ");
        int numero_2 = sc.nextInt();
        System.out.print("Digite um terceiro numero: ");
        int numero_3 = sc.nextInt();

        int maior = Math.max(numero_1, Math.max(numero_2, numero_3));

        System.out.printf("Maior = %d", maior);
        sc.close();
    }
}
