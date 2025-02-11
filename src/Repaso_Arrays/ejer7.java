package src.Repaso_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

// eliminar elemento de un arraylist
public class ejer7 {
    public static void main (String[] args){

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        System.out.println("Lista original: " + lista);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero a eliminar");
        int numBorrar = scan.nextInt();
        System.out.println("Usted va a borrar el numero: " + numBorrar);

        if (!lista.contains(numBorrar)){
            System.out.println("El numero : " + numBorrar + " no se encuentra en la lista");
            return;
        }

        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i) == numBorrar){
                lista.remove(i);
            }
        }

        System.out.println("Lista actualizada: " + lista);
    }
}
