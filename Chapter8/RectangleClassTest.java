package Chapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkThatRectangleCanCalculateItsArea(){
        RectangleClass rectangle = new RectangleClass();
        double result = rectangle.calculateArea(10.0, 5.0);
        assertEquals(50.0, result);
    }

    @Test
    void checkThatRectangleCanCalculateItsPerimeter(){
        RectangleClass rectangle = new RectangleClass();
        double result = rectangle.calculatePerimeter(5, 5);
        assertEquals(20.0, result);
    }

    @Test
    void checkThatRectangleCanValidateValuesBeforeSettingLength(){
        RectangleClass rectangle = new RectangleClass();
        String expectedMessage = "The length should be larger than 0.0 and less than 20.0";
        boolean thrown = false;

        try{
            rectangle.setLength(23.0);
        }catch (IllegalArgumentException e){
            thrown = true;
            System.out.println(e.getMessage());
        }
        assertTrue(thrown);
    }

    @Test
    void checkThatRectangleCanValidateValuesBeforeSettingWidth(){
        RectangleClass rectangle = new RectangleClass();
        rectangle.setWidth(15.0);
        boolean thrown = false;
        try{
            rectangle.setWidth(25.0);
        }catch (IllegalArgumentException e){
            thrown = true;
            System.out.println(e.getMessage());
        }
        assertTrue(thrown);
    }

    @Test
    void checkThatMethodCanSuccessfullySetTheLengthOfTheRectangle(){
        RectangleClass rectangle = new RectangleClass();
        rectangle.setLength(12);
        double expectedResult = rectangle.getLength();
        assertEquals(12, expectedResult);
    }

    @Test
    void checkThatMethodCanSuccessfullySetTheWidthOfTheRectangle(){
        RectangleClass rectangle = new RectangleClass();
        rectangle.setWidth(15);
        double expectedWidth = rectangle.getWidth();
        assertEquals(15, expectedWidth);
    }
}