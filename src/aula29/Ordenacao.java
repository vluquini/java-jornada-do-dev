package aula29;

import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {

        int[] numbers = new int[] {10,5,2,11,21,22,23};
        Arrays.sort(numbers);

        System.out.println(numbers); // imprime o hashcode do objeto
        System.out.print(Arrays.toString(numbers));

    }
}
