package src.Repaso_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args){
        int[] array = {2, 4, 6, 8, 10};
        Scanner scan = new Scanner(System.in);

        System.out.println("Array original: " + Arrays.toString(array));

        System.out.print("Ingrese la primera posición: ");
        int num1 = scan.nextInt();

        System.out.print("Ingrese la segunda posición: ");
        int num2 = scan.nextInt();

        // validar entrada
        if (num1 < 0 || num1 >= array.length || num2 < 0 || num2 >= array.length) {
            System.out.println("Error: Las posiciones deben estar entre 0 y " + (array.length - 1));
            return;
        }

        // intercambiar posiciones
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

        System.out.println("Array modificado : " + Arrays.toString(array));
        scan.close();



        


        

    }
}
