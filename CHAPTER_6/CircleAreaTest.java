package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.CharacterIterator;

import static org.junit.jupiter.api.Assertions.*;

class CircleAreaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatMethodCanCalculateCircleAreaCorrectly(){
        double result = CircleArea.circleArea(3);
        assertNotNull(result);
        System.out.println(result);
        assertEquals(28.274333882308138, result);
    }

}