public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Arthur", 19, "11122233344");
        Pessoa p2 = new Pessoa();

        p2.alterarDados("Rodrigo", 30, "55566677788");

        System.out.println(p1);
        System.out.println(p2);
    }
}