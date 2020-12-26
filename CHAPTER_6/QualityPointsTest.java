package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;

import static org.junit.jupiter.api.Assertions.*;

class QualityPointsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatMethodCanCorrectlyAccountForStudentsAverage(){
        QualityPoints newQP = new QualityPoints();
        byte result = newQP.getAverage(45);
        assertEquals(2,result);
    }
}