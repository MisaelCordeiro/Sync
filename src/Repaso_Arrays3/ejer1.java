package src.Repaso_Arrays3;

import java.util.Scanner;

public class ejer1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scan.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) esPrimo = false;

        else{
            for (int i = 2; i <= Math.sqrt(numero); i++){
                if (numero % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }

        System.out.println(esPrimo ? "El numero es primo" : "El numero no es primo");
        scan.close();
        
    }
}
