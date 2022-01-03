package StringAndArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class isUniqueTest {

    @Test
    void esUnico(){

        isUnique unique = new isUnique();
        boolean resultado = unique.isUniqueChar("hola");

        Assertions.assertEquals(resultado, true);
    }

    @Test
    void noEsUnico(){
        isUnique unique = new isUnique();
        boolean resultado = unique.isUniqueChar("oso");

        Assertions.assertEquals(resultado, false);
    }

}