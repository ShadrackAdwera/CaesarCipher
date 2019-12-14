import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encryption_objectInstantiates() {
        EncryptDecrypt enc = new EncryptDecrypt("hello",3);
        assertEquals(true, enc instanceof EncryptDecrypt);
    }
}