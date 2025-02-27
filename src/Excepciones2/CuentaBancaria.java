package src.Excepciones2;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(){
        this.saldo = 0;
    }

    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Deposito exitoso. Saldo actual : " + saldo);
        }
        else{
            System.out.println("Error : Cantidad debe ser positiva");;
        }
    }

    public void retirar (double cantidad) throws SaldoInsuficienteException{
        if (cantidad > saldo ){
            throw new SaldoInsuficienteException("Saldo insuficiente, saldo disponible : " + saldo);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso, saldo restante: " + saldo);
    }

    public double getSaldo(){
        return saldo;
    }
}
