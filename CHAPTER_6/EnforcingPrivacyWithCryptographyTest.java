package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnforcingPrivacyWithCryptographyTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatMethodCanCorrectlyEncryptNumber(){
        EnforcingPrivacyWithCryptography newEnforce = new EnforcingPrivacyWithCryptography();
        String result = newEnforce.numEncrypter();
        assertEquals("9898", result);
    }

    @Test
    void checkThatMethodCanScreenOutNumberThatExceedsFourDigitIntegers(){
        EnforcingPrivacyWithCryptography newEnforce = new EnforcingPrivacyWithCryptography();
        String result = newEnforce.numEncrypter();
        assertEquals("You did not enter a four-digit integer", result);
    }
}