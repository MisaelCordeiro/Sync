package src.EncapsulacionModificadores;

public class Producto {
    // atributos
    private String nombre;
    private double precio;

    // constructor
    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // metodos
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        if (precio<=0){
            System.out.println("No puedes introducir un precio negativo");
        }
        else{
            this.precio = precio;
            System.out.println("Ha puesto un precio de : " + precio + " euros");
        }
    }

    public void mostrarProducto(){
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: " + precio + " euros");
    }

    public static void main (String[] args){
        // creamos producto
        Producto p = new Producto("Mando xbox", 25.50);
        p.mostrarProducto();

        System.out.println("Vamos a cambiar el nombre");
        p.setNombre("Mando PS5");
        p.setPrecio(300.2);
        p.mostrarProducto();

        p.setPrecio(-2);
        
    }


}
