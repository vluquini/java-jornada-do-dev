package aula9Projeto01;
/*
Calculadora básica, com parâmetros passados
via terminal.
 */
public class Calculate {

    public static void main(String[] args) {
        if(args[0].equals("sum"))
            sum(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        else if(args[0].equals("sub"))
            sub(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        else if (args[0].equals("multiply"))
            multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        else
            divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    }

    static void sum(int a, int b){
        System.out.println(a+b);
    }

    static void sub(int a, int b){
        System.out.println(a-b);
    }

    static void multiply(int a, int b){
        System.out.println(a*b);
    }

    static void divide(int a, int b){
        System.out.println(a/b);
    }
}


