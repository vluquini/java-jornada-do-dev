package aula38emdiante;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("001", "123", "Carlos");
        Account a2 = new Account("002", "124", "Alberto de souza filho silva");

//        System.out.println(a1.getNome());
//        System.out.println(a2.getNome());

        Account a3 = new Account("003", "125", "Junior");
        a3.depositar(300);

        System.out.println(a3.getValor());

        a3.sacar(350);
        System.out.println(a3.getValor());
    }
}
