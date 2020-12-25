package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingDigitsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatMethodCanReverseDigits(){
     ReversingDigits newReverse = new ReversingDigits();
     int result = newReverse.reverseNumGetter(34567);
     assertEquals(76543, result);
    }
}