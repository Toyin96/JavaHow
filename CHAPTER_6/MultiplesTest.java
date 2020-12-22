package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatMethodCanCorrectlyDetermineIfAPairOfIntegersAreMultiplesOrNot(){
        boolean ans = Multiples.isMultiples(2,100);
        System.out.println(ans);
        assertTrue(ans);
    }

}