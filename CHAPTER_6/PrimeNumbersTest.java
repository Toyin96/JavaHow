package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatMethodCanCorrectlyDetermineAPrimeNumber(){
        PrimeNumbers newPrime = new PrimeNumbers();
        boolean result = newPrime.primeNumChecker(5);
        assertEquals(true, result);

    }

}