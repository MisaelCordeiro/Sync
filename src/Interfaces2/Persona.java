package src.Interfaces2;

public class Persona implements Imprimible {
    //atributos
    private String nombre;
    private int edad;

    // constructor
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Misael", 26);
        p1.imprimir();
    }
}
