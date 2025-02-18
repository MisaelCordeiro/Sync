package src.ClassAndObjects;

public class Persona {
    // atributos
    private String nombre;
    private Integer edad;
    private Double altura;

    // constructor
    public Persona (String nombre, Integer edad, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // metodos
    public void mostrarInfo(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Altura : " + altura);
    }

    public static void main (String[] args){
        Persona persona1 = new Persona("Misael", 26, 1.70);
        Persona persona2 = new Persona("Ariel", 21, 1.65);

        persona1.mostrarInfo();
        persona2.mostrarInfo();
    }


}
