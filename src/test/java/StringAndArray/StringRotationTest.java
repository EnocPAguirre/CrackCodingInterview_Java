package StringAndArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationTest {

    @Test
    void isRotation(){
        StringRotation stringRotation = new StringRotation();
        boolean resultado = stringRotation.isRotation("java", "avaj");
        Assertions.assertEquals(resultado,true );
    }

}