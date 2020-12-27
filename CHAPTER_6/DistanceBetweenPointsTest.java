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
        double result = newD.getDistance(2,3,6, 6);
        assertEquals(5,result);
    }
}