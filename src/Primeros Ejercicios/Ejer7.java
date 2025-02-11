import java.util.Arrays;
import java.util.Scanner;

public class Ejer7 {
    public static void main (String[] args){
        int[] array = {14, 3, 4, 66 , 44 ,33 , 24, 35, 98, 82};
        System.out.println("Array: " + Arrays.toString(array));
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = scan.nextInt();
        boolean encontrado = false;
        for (int i = 0; i<array.length;i++){
            if (array[i] == numero){
                System.out.println("El numero " + numero + " está en la posición " + i );
                encontrado = true;
                break;
            }

        }

        if (!encontrado){
            System.out.println("No encontrado");
        }
        scan.close();
    }
}
