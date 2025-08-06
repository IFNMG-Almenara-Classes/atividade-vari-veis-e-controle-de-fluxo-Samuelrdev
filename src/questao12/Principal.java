package questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        int quantidade = 0;
        int pares = 0;
        System.out.printf("Digite números:%n0 - Sair %n");
        while (true) {
            numero = sc.nextInt();
            if (numero == 0) break;
            soma += numero;
            quantidade++;
            if (numero % 2 == 0) {
                pares++;
            }
        }
        if (quantidade == 0) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            double media = (double) soma / quantidade;
            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Média dos números digitados: " + media);
        }
        sc.close();
    }
}
