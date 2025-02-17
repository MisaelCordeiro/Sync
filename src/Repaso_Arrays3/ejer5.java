package src.Repaso_Arrays3;

import java.util.Scanner;

public class ejer5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero para ver su tabla de multiplicar");
        int num = scanner.nextInt();
        System.out.println("Elige un 1 metodo -> 1 = For, 2 -> Switch");
        int metodo = scanner.nextInt();

        switch (metodo) {
            case 1:
                for (int i = 0; i <= 10; i++){
                    System.out.println(num + " x " + i + " = " + (num*i));
                }
                break;
        
            case 2:
                int i = 1;
                while (i<=10){
                    System.out.println(num + " x " + i + " = " + (num*i));
                    i++;

                }
                break;
            default:
            System.out.println("Metodo no valido");
        }
    }
    
}
