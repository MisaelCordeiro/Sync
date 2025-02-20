package src.SuperOverride;

public class Empleado {
    protected String nombre;
    protected double salario;

    // constructor
    public Empleado (String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    //getters and setter
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // methods
    public void calcularSueldo(){
        System.out.println("El salario es: " + salario);
    }

}
// clase hija gerente
class Gerente extends Empleado{
    private String departamento;

    public Gerente (String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void calcularSueldo(){
        if (departamento == "Direccion"){
            
            System.out.println("El salario es: " + salario*1.5);
        }
        else{
            System.out.println("El salario es :" + salario);
        }

    }
}
// clase hija tecnico
class Tecnico extends Empleado {
    private String especialidad;

    public Tecnico(String nombre, double salario, String especialidad){
        super(nombre, salario);
        this.especialidad = especialidad;
    }

    @Override
    public void calcularSueldo(){
        if (especialidad == "Pro"){
            
            System.out.println("El salario es: " + salario*2);
        }
        else{
            System.out.println("El salario es :" + salario);
        }

    }
}

class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Empleadin", 100);
        Gerente g1 = new Gerente("Gerentin", 200, "Direccion");
        Gerente g2 = new Gerente("Gerentino", 200, "Investigacion");
        Tecnico t1 = new Tecnico("Tecnicin", 500, "Pro");
        Tecnico t2 = new Tecnico("tecnu", 500, "Medium");

        e1.calcularSueldo();
        g1.calcularSueldo();
        g2.calcularSueldo();
        t1.calcularSueldo();
        t2.calcularSueldo();
    }
}
