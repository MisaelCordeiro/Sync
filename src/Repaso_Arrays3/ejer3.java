package src.Repaso_Arrays3;

import java.util.Scanner;

public class ejer3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena : ");
        String texto = scanner.nextLine().toLowerCase();
        int contadorVocales = 0;

        for (char c : texto.toCharArray()){
            if ("aeiou".indexOf(c) != -1){
                contadorVocales++;
            }
        }

        System.out.println("Numero de vocales: " + contadorVocales);
        scanner.close();
    }
}
