import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encryption_objectInstantiates() {
        Encrypt enc = new Encrypt();
        assertEquals(true, enc instanceof Encrypt);
    }
}