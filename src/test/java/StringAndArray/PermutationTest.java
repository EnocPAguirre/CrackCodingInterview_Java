package StringAndArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationTest {

    @Test
    void esPermutacion(){
        Permutation permutation = new Permutation();
        boolean resultado = permutation.isPermutation("hola", "aloh");

        Assertions.assertEquals(resultado, true);
    }

    @Test
    void diferenteLongitud(){
        Permutation permutation = new Permutation();
        boolean resultado = permutation.isPermutation("hola", "hola perro");

        Assertions.assertEquals(resultado, false);
    }
}