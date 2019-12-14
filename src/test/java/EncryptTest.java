import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encryptionDecryption_savesMessage_String() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals("hello", testVal.getTextMessage());
    }

    @Test
    public void encryption_objectInstantiates() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals(true, testVal instanceof EncryptDecrypt);

    }
}