public class Calculadora {
     double a;
     double b;

    public Calculadora() {
    }

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setValores(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return a / b;
    }
    public void alterarDados(Double a, Double b) {
        this.a =a;
        this.b = b;
    }
}

