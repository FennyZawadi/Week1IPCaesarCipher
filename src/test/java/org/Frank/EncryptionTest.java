package org.Frank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {

    @Test
    public void testEncryptWithShift1() {
        assertEquals("IFMMP", Encryption.encrypt("HELLO", 1));
    }

    @Test
    public void testEncryptWithShift0() {
        assertEquals("HELLO", Encryption.encrypt("HELLO", 0));
    }

    @Test
    public void testEncryptWithNegativeShift() {
        assertEquals("UVJKU", Encryption.encrypt("HELLO", -2));
    }

    @Test
    public void testEncryptWithNonAlphabetCharacters() {
        assertEquals("1234", Encryption.encrypt("1234", 5));
    }

    @Test
    public void testDecryptWithShift3() {
        assertEquals("HELLO", Encryption.decrypt("IFMMP", 1));
    }

    @Test
    public void testDecryptWithShift0() {
        assertEquals("HELLO", Encryption.decrypt("HELLO", 0));
    }

    @Test
    public void testDecryptWithNegativeShift() {
        assertEquals("HELLO", Encryption.decrypt("JGNNQ", -2));
    }

    @Test
    public void testDecryptWithNonAlphabetCharacters() {
        assertEquals("1234", Encryption.decrypt("1234", 5));
    }
    @Test
    public void testDecryptWithSpecialCharacters(){
        assertEquals("*", Encryption.decrypt("*", 5));
    }
    @Test
    public void testDecryptWithUpperCaseLowerCase() {
        assertEquals("QrSt", Encryption.decrypt("VwXy", 5));
    }
}
