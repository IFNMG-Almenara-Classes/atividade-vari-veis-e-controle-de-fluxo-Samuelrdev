package questao10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int i = 1;
        do{

            if (i == 50) {
                System.out.printf("%d.", i);
            } else {
                System.out.printf("%d, ", i);
            }
            i++;
        }while(i <= 50);
    }
}
