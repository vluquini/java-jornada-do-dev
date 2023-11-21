package aula20;

public class ManipulandoStrings {

    public static void main(String[] args) {
        String s1 = "   Conhecendo alguns métodos da linguagem Java.      ";
        // O método 'trim' remove espaços descenessários no início/fim de uma String.
        System.out.println(s1.trim());

        String s2 = "Ola João!";
        System.out.println(s2.contains("Ola"));
        String s3 = "Ole João!";
        System.out.println(s3.contains("Ola"));

    }

}


