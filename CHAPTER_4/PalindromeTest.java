package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatReverseMethodIsActuallyReversingTheGivenNumber(){
        Palindrome.reverseNum(12321);
        assertEquals(12321,Palindrome.reverseNum(12321));
    }

    @Test
    void checkThatIsPalindromeMethodActuallyDeterminesIfANumberIsAPalindromeOrNot(){
        Palindrome.isPalindrome(234);
        assertFalse(false, Palindrome.isPalindrome(234));
    }
}