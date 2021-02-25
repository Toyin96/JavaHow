package Chapter6.makingADifference;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerAssistedInstructionTest {

    ComputerAssistedInstruction computer;

    @BeforeEach
    void setUp() {
        computer = new ComputerAssistedInstruction();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void twoRandomNumberInstance_canBeGenerated(){
        int rand1 = computer.randomGenerator();
        int rand2 = computer.randomGenerator();
        assertNotEquals(rand1, rand2);
    }

    @Test
    void checkThatTwoQuestionsAreNotTheSame(){
        String question1 = computer.questionGenerator();
        String question2 = computer.questionGenerator();
        assertNotEquals(question1, question2);
    }

    @Test
    void answer_canBeExtractedFromQuestionGenerator(){
        String question1 = computer.questionGenerator();
        System.out.println(question1);
        System.out.println(computer.answerExtractor());
    }

    @Test
    void student_canEnterNegativeOneToEndTheProgram(){
        int num = computer.displayQuestion();
        assertEquals(-1, num);
    }