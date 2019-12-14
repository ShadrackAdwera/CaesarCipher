import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encryptDecrypt_savesMessage_String() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals("hello", testVal.getTextMessage());
    }

    @Test
    public void encryptDecrypt_savesShiftValue_Integer() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals(3, testVal.getShiftBy());
    }

    @Test
    public void encryptDecrypt_ShiftsTextForward_StringBuilder() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals("khoor", testVal.encryption());
    }

    @Test
    public void encryptDecrypt_objectInstantiates() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals(true, testVal instanceof EncryptDecrypt);

    }
}