package src.Abstractas1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(10, 5));
        figuras.add(new Circulo(20.5));
        figuras.add(new Rectangulo(20, 40));

        for (Figura figura : figuras){
            System.out.println("Area : " + figura.calcularArea());
            System.out.println("Perimetro : " + figura.calcularPerimetro());
        }
    }
}
