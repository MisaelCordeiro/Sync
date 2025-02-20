package src.HerenciaPoliformismo;

public class Vehiculos {
    //atributos
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;

    //constructor
    public Vehiculos(String marca, String modelo, int anioFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    // getters and setters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    //metodos
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + anioFabricacion);
    }
    
}
// clase hija coche
class Coche extends Vehiculos {
    private int numPuertas;
    public Coche(String marca, String modelo, int anioFabricacion, int numPuertas){
        super(marca, modelo, anioFabricacion);
        this.numPuertas = numPuertas;

    }

    public int getNumPuertas() {
        return numPuertas;
    }
    
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + anioFabricacion);
        System.out.println("Numero de puertas: " + numPuertas);
    }
}

// clase hija moto

class Moto extends Vehiculos {
    private int cilindrada;
    public Moto(String marca, String modelo, int anioFabricacion, int cilindrada){
        super(marca, modelo, anioFabricacion);
        this.cilindrada = cilindrada;

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + anioFabricacion);
        System.out.println("Numero de puertas: " + cilindrada);
    }
}

class Main {
    public static void main(String[] args){
        Coche fiero = new Coche("Peugeot", "307", 2004, 5);
        Moto moto = new Moto("Kawasaki", "Ultra", 2015,125);

        fiero.mostrarInfo();
        moto.mostrarInfo();
    }
}
