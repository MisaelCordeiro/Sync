package src.EncapsulacionModificadores;

public class CuentaBancaria {
    //atributos
    private String titular;
    private Double saldo;

    // constructor
    public CuentaBancaria(String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double cantidad){
        if (saldo > 0){
            this.saldo = saldo;
        }
        else{
            System.out.println("No se puede meter un saldo negativo");
        }
    }

    public void depositar(Double cantidad){
        if (cantidad<0){
            System.out.println("No puede introducir una cantidad negativa");
        }
        else{
            this.saldo = cantidad + saldo;
            System.out.println("Ha introducido " + cantidad + " euros");
        }
    }

    public void retirar (Double cantidad){
        if (saldo < 0 || cantidad > saldo){
            System.out.println("ERROR, no puede retirar la cantidad solicitada");
        }
        else {
            this.saldo = saldo - cantidad;
            System.out.println("Ha retirado " + cantidad +" euros.");
        }
    }

    public static void main (String[] args){
        //creamos cuenta 
        CuentaBancaria cuenta = new CuentaBancaria("Misael", 50.0);

        System.out.println("Cuenta de : " + cuenta.titular + " saldo = " + cuenta.saldo);

        // ingresar cantidad

        cuenta.depositar(250.50);

        System.out.println("Cuenta de : " + cuenta.titular + " saldo = " + cuenta.saldo);

        cuenta.retirar(100.2);

        System.out.println("Cuenta de : " + cuenta.titular + " saldo = " + cuenta.saldo);



    }
}
/* correccion gpt
 * package src.EncapsulacionModificadores;

public class CuentaBancaria {
    private String titular;
    private double saldo; // Se cambia Double a double para evitar posibles null y mejorar rendimiento

    // Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) { 
            this.saldo = saldo;
        } else {
            this.saldo = 0; // Evita saldo negativo en la creación de cuenta
            System.out.println("Saldo inicial inválido, se ha establecido en 0.");
        }
    }

    // Métodos
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() { // Se agrega getter para titular
        return titular;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No puede depositar una cantidad negativa o cero.");
        } else {
            saldo += cantidad; // Se simplifica la operación
            System.out.println("Ha depositado " + cantidad + " euros. Saldo actual: " + saldo);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No puede retirar una cantidad negativa o cero.");
        } else if (cantidad > saldo) {
            System.out.println("ERROR, saldo insuficiente. Su saldo es de " + saldo + " euros.");
        } else {
            saldo -= cantidad; // Se simplifica la operación
            System.out.println("Ha retirado " + cantidad + " euros. Saldo actual: " + saldo);
        }
    }

    public static void main(String[] args) {
        // Crear cuenta
        CuentaBancaria cuenta = new CuentaBancaria("Misael", 50.0);

        System.out.println("Cuenta de: " + cuenta.getTitular() + " | Saldo: " + cuenta.getSaldo());

        // Depositar cantidad
        cuenta.depositar(250.50);
        System.out.println("Cuenta de: " + cuenta.getTitular() + " | Saldo: " + cuenta.getSaldo());

        // Retirar cantidad
        cuenta.retirar(100.2);
        System.out.println("Cuenta de: " + cuenta.getTitular() + " | Saldo: " + cuenta.getSaldo());
    }
}

 * 
 */
