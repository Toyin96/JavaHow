package Chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacebookUserBaseGrowthTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatMethodCanCorrectlyCalculateThePowerOfANumber(){
        FacebookUserBaseGrowth newFbGrowth = new FacebookUserBaseGrowth();
        double amount = newFbGrowth.calculatePower();
        assertEquals(1.5394540563150783E9, amount);
    }

    @Test
    void testThatMethodIsNotNullAfterBeingCalled(){
        FacebookUserBaseGrowth newFB = new FacebookUserBaseGrowth();
        double overallSum = newFB.calculatePower();
        assertNotNull(overallSum);
    }
}