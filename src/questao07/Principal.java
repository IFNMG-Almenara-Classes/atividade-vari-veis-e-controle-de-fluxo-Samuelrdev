package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho dos 3 lados do seu triangulo rs: ");

        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        boolean ehTriangulo = lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1;

        if (!ehTriangulo) {
            System.out.print("Seu triangulo não é um triangulo.");
        } else {
            if(lado1 == lado2 || lado2 == lado3){
                System.out.print("Seu triangulo é isósceles.");
            } else if (lado1 == lado2 && lado2 == lado3) {
                System.out.print("Seu triangulo é equilátero.");
            } else {
                System.out.print("Seu triangulo é escaleno, diferente!");
            }
        }
        sc.close();
    }
}
