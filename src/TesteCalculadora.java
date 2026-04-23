public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora(10.0, 5.0);

        System.out.println(" construtor parametrizado (10.0, 5.0) ");
        System.out.println("Soma: " + calc1.somar(10.0, 5.0));
        System.out.println("Subtração: " + calc1.subtrair(10.0, 5.0));
        System.out.println("Multiplicação: " + calc1.multiplicar(10.0, 5.0));
        System.out.println("Divisão: " + calc1.dividir(10.0, 5.0));

        Calculadora calc2 = new Calculadora();
        calc2.alterarDados(10.0, 4.0);

        System.out.println("\n construtor default + setValores (20.0, 4.0)");
        System.out.println("Soma: " + calc2.somar(20.0, 4.0));
        System.out.println("Subtração: " + calc2.subtrair(20.0, 4.0));
        System.out.println("Multiplicação: " + calc2.multiplicar(20.0, 4.0));
        System.out.println("Divisão: " + calc2.dividir(20.0, 4.0));
    }
}

