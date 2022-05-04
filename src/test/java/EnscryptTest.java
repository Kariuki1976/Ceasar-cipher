

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
    public void runEncrypt_instantiates(){
        Enscrypt testEncrypt = new Enscrypt("abc",2);
        assertEquals(true, testEncrypt instanceof Enscrypt);
    }

    @Test
    public void runEncrypt_ifInputIsString() {
        Enscrypt testEncrypt = new Enscrypt("abc",3);
        assertEquals("abc", testEncrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Enscrypt testEncrypt = new Enscrypt("abc",2);
        assertEquals(2, testEncrypt.getmShift());
    }
    @Test
    public void runEncrypt_ifEncryptsVariousInputs() {
        Enscrypt testEncrypt = new Enscrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 3);
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",Enscrypt.encrypt(testEncrypt));
    }
}
