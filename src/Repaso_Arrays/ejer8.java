package src.Repaso_Arrays;

import java.util.ArrayList;

// concatenar 2 arraylist
public class ejer8 {
    public static void main (String[] args){
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> listaCombinada = new ArrayList<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);

        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);

        listaCombinada.addAll(lista1);
        listaCombinada.addAll(lista2);

        System.out.println("Lista 1 : " + lista1);
        System.out.println("Lista 2 : " + lista2);
        System.out.println("Lista combinada: " + listaCombinada);
    }
    
}
