package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatFahrenheitCanBeConvertedToCelsius(){
        double result = TemperatureConversions.celsius(72.32);
        System.out.println(result);
        assertEquals(22.4, result);
    }

    @Test
    void testThatCelsiusCanBeConvertedToFahrenheit(){
        double result = TemperatureConversions.fahrenheit(22.4);
        System.out.println(result);
        assertEquals(72.32, result);
    }
}