import java.util.Arrays;

public class EjerFunciones1 {
    public static void main (String[] args){
        int[] numeros = {10,30,50,70,100};
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        
        System.out.println("Array: " + Arrays.toString(numeros));
        System.out.println("Suma total: " + suma);
    }
}