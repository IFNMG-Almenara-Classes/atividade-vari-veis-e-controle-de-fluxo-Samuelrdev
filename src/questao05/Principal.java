package questao05;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("PROMOÇÃO! Laranjas R$0.30 Comprando +12%nQuantidade de laranjas: ");
        int quantidade = sc.nextInt();

        if (quantidade < 12) {
            System.out.printf("Valor total: R$%.2f", (quantidade*0.50));

        } else {
            System.out.printf("Valor total: R$%.2f", (quantidade*0.30));
        }
        sc.close();
    }
}
