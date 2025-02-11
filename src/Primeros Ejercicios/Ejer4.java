public class Ejer4 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        // Mostrar el array original
        System.out.println("Array original: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Invertir Array
        for (int i = 0, j = numeros.length - 1; i < j; i++, j--) { // <- CORREGIDO
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }

        // Mostrar array invertido
        System.out.print("Array invertido: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
