package src.Interfaces3;

public class Perro implements Animal{
    public Perro (){};

    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra wof wof wof wof wof");
    }

    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.hacerSonido();
    }
}
