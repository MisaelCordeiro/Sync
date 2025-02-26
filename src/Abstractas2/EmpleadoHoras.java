package src.Abstractas2;

public class EmpleadoHoras extends Empleado {
    private int horas;

    public EmpleadoHoras (String nombre, double salarioBase, int horas){
        super(nombre, salarioBase);
        this.horas = horas;
    }

    @Override
    double calcularSalarioFinal(){
        return salarioBase*horas*3;
    }
}
