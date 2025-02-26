package src.Abstractas2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado (String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalarioFinal() ;

}
