package src.ClassAndObjects;

public class Coche {
    // atributos
    private String marca;
    private String modelo;
    private Integer anio;

    // constructor
    public Coche (String marca, String modelo, Integer anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // metodos
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Año de fabricación: " + anio);
    }

    public boolean esAntiguo(){
        if (2025 - anio >= 20){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Coche coche1 = new Coche("Peugeot", "307", 2004);
        Coche coche2 = new Coche("Ford", "Focus", 2006);
        Coche coche3 = new Coche("Dacia", "Sandero", 2016);

        coche1.mostrarInfo();
        coche2.mostrarInfo();
        coche3.mostrarInfo();

        if(coche1.esAntiguo()){
            System.out.println("El " + coche1.marca + " es antiguo");
        }
    }
}
