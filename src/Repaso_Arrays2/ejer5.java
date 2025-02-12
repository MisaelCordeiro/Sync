package src.Repaso_Arrays2;

import java.util.Arrays;

public class ejer5 {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Array: " + Arrays.toString(array));

        int sumaMaxima = Integer.MIN_VALUE;
        int maxActual = 0;
        int inicio = 0, fin = 0, inicioTemp = 0;

        for (int i = 0; i < array.length; i++) {
            maxActual += array[i];

            if (maxActual > sumaMaxima) {
                sumaMaxima = maxActual;
                inicio = inicioTemp;
                fin = i;
            }

            if (maxActual < 0) {
                maxActual = 0;
                inicioTemp = i + 1;  // Reiniciamos el inicio del subarray
            }
        }

        int[] subarrayMaximo = Arrays.copyOfRange(array, inicio, fin + 1);

        System.out.println("Subarray con la suma máxima: " + Arrays.toString(subarrayMaximo));
        System.out.println("Suma máxima: " + sumaMaxima);
    }
}
