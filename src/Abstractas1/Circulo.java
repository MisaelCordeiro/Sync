package src.Abstractas1;

public class Circulo extends Figura {
    private double radio;

    public Circulo (double radio){
        this.radio = radio;
    }

    
    @Override
    double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
