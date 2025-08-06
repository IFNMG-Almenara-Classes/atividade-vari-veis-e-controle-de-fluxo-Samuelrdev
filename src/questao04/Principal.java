package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        final String PASS = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.printf("Login: admin %nSenha: ");
        String senha = sc.nextLine();

        if (senha.equals(PASS)) {
            System.out.print("ACESSO PERMITIDO");
        } else {
            System.out.print("ACESSO NEGADO");
        }

        sc.close();
    }
}
