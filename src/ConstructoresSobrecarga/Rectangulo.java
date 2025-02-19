package src.ConstructoresSobrecarga;

public class Rectangulo {
    // atributos
    private double base;
    private double altura;

    // constructor
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo (){
        this.base = 1;
        this.altura = 1;
    }

    // metodos - getters / setters
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea(){
        return base*altura;
    }

    public boolean esCuadrado(){
        return base==altura;
    }

    public static void main (String[] args){
        Rectangulo r1 = new Rectangulo(20.5,10.5);
        System.out.println("Rectangulo de base: " + r1.getBase());
        System.out.println("Rectangulo de altura: " + r1.getAltura());

        System.out.println("Area:" + r1.getArea());
        
        System.out.println("Es cuadrado: " + (r1.esCuadrado() ? "Si" : "No"));

        Rectangulo r2 = new Rectangulo();
        System.out.println("Rectangulo de base: " + r2.getBase());
        System.out.println("Rectangulo de altura: " + r2.getAltura());
        System.out.println("Es cuadrado: " + (r2.esCuadrado() ? "Si" : "No"));
        r2.getArea();


    }


}
