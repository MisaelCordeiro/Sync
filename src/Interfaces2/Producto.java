package src.Interfaces2;

public class Producto implements Imprimible {
    private String nombre;
    private int precio;

    public Producto (String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio : " + precio);
    }

    public static void main(String[] args) {
        Producto pro = new Producto("Mando", 15);
        pro.imprimir();
    }
}
