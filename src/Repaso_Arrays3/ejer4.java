package src.Repaso_Arrays3;

public class ejer4 {
    public static void main(String[] args){
        int[] numeros = {23, 5, 78, 12, 45, 89, 1};
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int num : numeros){
            if (num > mayor) mayor = num;
            if (num < mayor) menor = num;
        }

        System.out.println("Numero mayor : " + mayor);
        System.out.println("Numero menor : " + menor);
    }
}
