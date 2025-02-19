package src.ConstructoresSobrecarga;

public class Circulo {
    // atributo
    private double radio;

    //constructor 
    public Circulo (double radio){
        this.radio = radio;
    }

    public Circulo(){
        this.radio = 1;
    }

    // getters and setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // methods
    public double getArea(){
        return radio*radio;
    }

    public double getCircunferencia (){
        double circunferencia = 2 * Math.PI * radio;
        return circunferencia;
    }

    public static void main (String[] args){
        Circulo c1 = new Circulo(5.5);
        Circulo c2 = new Circulo();

        System.out.println("Circulo 1 tiene un radio = " + c1.radio );
        System.out.println("Su area es = " + c1.getArea());
        System.out.println("Su circunferencia es = " + c1.getCircunferencia());

        System.out.println("Circulo 2 tiene un radio = " + c2.radio );
        System.out.println("Su area es = " + c2.getArea());
        System.out.println("Su circunferencia es = " + c2.getCircunferencia());
    }

}
