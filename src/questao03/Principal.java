package questao03;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        sc.close();
        if(numero % 2 == 0)
        {
            System.out.printf("O numero %d é par", numero);
        } else {
            System.out.printf("O numero %d é impar", numero);
        }
    }

}
