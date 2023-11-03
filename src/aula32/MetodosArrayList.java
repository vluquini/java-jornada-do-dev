package aula32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("marcos");
        names.add("junior");
        names.add("carlos");
        names.add("joao");
        /*
         length --> é usado para arrays.
         size() --> é usado para coleções de objetos (listas, conjuntos, maps...).
         */
        System.out.println(names.size());
    }
}
