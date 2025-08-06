package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        sc.close();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%nEstado: ", imc);
        if (imc < 18.5) {
            System.out.print( "Magreza");
        } else if (imc < 25.0) {
            System.out.print( "Saudável");
        } else if (imc < 30.0) {
            System.out.print( "Sobrepeso");
        } else if (imc < 35.0) {
            System.out.print( "Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.print( "Obesidade Grau II (Severa)");
        } else {
            System.out.print( "Obesidade Grau III (Mórbida)");
        }
    }

}
