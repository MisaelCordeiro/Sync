package src.Interfaces3;

public class Gato implements Animal {
    public Gato(){};

    @Override
    public void hacerSonido(){
        System.out.println("El gato hace meoooooooowwwwwwww");
    }

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();
    }
}
