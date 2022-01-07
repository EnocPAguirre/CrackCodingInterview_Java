package StringAndArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class oneWayTest {

    @Test
    void onewWayTest() {
        oneWay oneWay = new oneWay();
        boolean resultado = oneWay.oneEditWay("pale", "ple");
        Assertions.assertEquals(resultado, true);
    }
}