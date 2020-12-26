package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenPointsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatMethodCanCorrectlyCalculateTheDistanceBetweenTwoPoints(){
        DistanceBetweenPoints newD = new DistanceBetweenPoints();
        double result = newD.getDistance(12.1, 2.4,19.4, 5.7);
        assertEquals(8.011242100947891,result);
    }
}