package questao08;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        for(int i = 1; i <= 50; i++){
            if(i == 50) {
                System.out.printf("%d.", i);
            } else {
                System.out.printf("%d, ", i);
            }
        }
    }
}
