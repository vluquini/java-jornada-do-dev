package aula31;

import java.util.Arrays;

public class PreenchendoArrays {
    public static void main(String[] args) {

        String[] names = new String[5];

        System.out.println(Arrays.toString(names));
        // preenchendo array com um valor 'padrão'
        Arrays.fill(names, "vazio");

        System.out.println(Arrays.toString(names));
    }
}
