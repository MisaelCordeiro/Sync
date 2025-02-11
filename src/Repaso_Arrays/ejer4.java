package src.Repaso_Arrays;
// Ejercicio 4: Verificar si un Array está Ordenado


public class ejer4 {
    public static void main (String[] args){
        int[] array = { 1, 3, 5, 7, 9 };

        boolean ordenado = true;

        for (int i = 0; i < array.length - 1; i++ ){
            if ( array[i] > array[i+1] ){
                ordenado = false;
                break;
            }
            
        }

        if (ordenado){
            System.out.println("El array está ordenado");
        }
        else{
            System.out.println("El array no está ordenado");
        }
    }
}
