package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMinimumTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatMethodCanCorrectlyDetermineTheMinimumNumberFromTheGivenNumbers(){
        double result = FindTheMinimum.minimum3(12.33, 24.11, 87.56);
        assertEquals(12.33, result);
    }
}