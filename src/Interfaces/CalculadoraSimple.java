package src.Interfaces;

public class CalculadoraSimple implements Calculadora {
    @Override
    public int sumar(int a, int b){
        return a+b;
    }

    @Override
    public int restar(int a, int b){
        return a-b;
    }

    @Override
    public int multiplicar(int a, int b){
        return a*b;
    }

    @Override
    public double dividir(int a, int b){
        if (b == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        CalculadoraSimple calcu = new CalculadoraSimple();

        System.out.println("Resultado = " + calcu.sumar(5, 4));

    }
}


