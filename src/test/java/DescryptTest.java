import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    @Test
    public void runDecrypt_instantiates(){
        Descrypt testDecrypt = new Descrypt("!obnf", 1);
        assertEquals(true, testDecrypt instanceof Descrypt);
    }

    @Test
    public void runDecrypt_ifInputIsString() {
        Descrypt testDecrypt = new Descrypt("obnf", 1);
        assertEquals("obnf", testDecrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Descrypt testDecrypt = new Descrypt("obnf",1);
        assertEquals(1, testDecrypt.getmShift());
    }
    @Test
    public void runDecrypt_ifDecryptsVariousInputs() {
        Descrypt testDecrypt = new Descrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 3);
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", Descrypt.decrypt(testDecrypt));
    }
}
