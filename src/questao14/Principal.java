package questao14;

import java.util.Scanner;

public class Principal {
    public static double VIP(double valor) {
        return valor * 0.05;
    }

    public static double Funcionario(double valor) {
        return valor * 0.10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Pizzaria:%n1 - Cliente%n2 - Cliente Vip%n3 - Funcionário%nOpção: ");
        int opcao = sc.nextInt();

        System.out.print("Digite o valor da pizza: R$ ");
        double valor = sc.nextDouble();

        double desconto = 0;
        switch (opcao) {
            case 1:
                desconto = 0;
                break;
            case 2:
                desconto = VIP(valor);
                break;
            case 3:
                desconto = Funcionario(valor);
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return;
        }
        System.out.printf("Total a pagar: R$ %.2f%n", valor - desconto);
        sc.close();
    }
}
