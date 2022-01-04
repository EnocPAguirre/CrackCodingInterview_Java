package StringAndArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UrlTest {
    @Test
    void isUrilify(){
        Url urilify = new Url();

        String str = "Hola Mundo Funciona   ";
        char[] palabra = str.toCharArray();
        System.out.println(palabra);

        String expect = "Hola%20Mundo%20Funciona";
        char[] resultado = expect.toCharArray();

        urilify.replaceSpaces(palabra, 19);

        Assertions.assertArrayEquals(palabra, resultado);

    }
}