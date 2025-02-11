package src.Repaso_Arrays;

import java.util.Collections;
import java.util.LinkedList;

public class ejer9 {
    public static void main (String[] args){
        LinkedList<String> listaO = new LinkedList<>();
        LinkedList<String> listaI = new LinkedList<>();

        listaO.add("A");
        listaO.add("B");
        listaO.add("C");
        listaO.add("D");
        listaO.add("E");

        System.out.println("Lista original : " + listaO);

        Collections.reverse(listaI);
        System.out.println("Lista invertida : " + listaI);

    }
}
