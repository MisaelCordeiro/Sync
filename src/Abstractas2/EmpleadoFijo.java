package src.Abstractas2;

public class EmpleadoFijo extends Empleado {
    private int horas;

    public EmpleadoFijo(String nombre, double salarioBase, int horas){
        super(nombre, salarioBase);
        this.horas = horas;
    }

    @Override
    double calcularSalarioFinal(){
        return salarioBase*horas*1.5;
    }
}
