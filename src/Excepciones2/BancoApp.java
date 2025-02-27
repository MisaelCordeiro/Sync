package src.Excepciones2;

public class BancoApp {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.depositar(500);

        try {
            cuenta.retirar(200);
            cuenta.retirar(400);
        } catch (SaldoInsuficienteException e){
            System.out.println("Error al retirar dinero: " + e.getMessage());
        }


        System.out.println("Saldo final : " + cuenta.getSaldo());
    }
}
