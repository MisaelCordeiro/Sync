package src.HerenciaPoliformismo;

public class Animales {
    // atributos
    private String nombre;
    private int edad;

    //constructor
    public Animales(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // methods
    public void hacerSonido(){
        System.out.println("Sonido generico");
    }

}

// subclase perro
class Perro extends Animales {
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
}

class Gato extends Animales {
    public Gato (String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla");
    }
}
/* 

class Main{
    public static void main(String[] args){
        Perro kimi = new Perro("Kimi", 10);
        Perro duki = new Perro("Duki", 4);

        Gato ghato = new Gato("Tontazo", 2);

        System.out.println("Perro 1 se llama " + kimi.getNombre());
        System.out.println("Perro 2 se llama " + duki.getNombre());

        System.out.println("Gato nombre = " + ghato.getNombre());

        kimi.hacerSonido();
        ghato.hacerSonido();
    }
}
*/