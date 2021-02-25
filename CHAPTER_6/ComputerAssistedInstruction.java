package Chapter6.makingADifference;

import javax.swing.*;
import java.security.SecureRandom;

public class ComputerAssistedInstruction {
    private static int random1;
    private static int random2;

    SecureRandom random = new SecureRandom();

    public static int getRandom1() {
        return random1;
    }

    public static int getRandom2() {
        return random2;
    }

    public int randomGenerator() {
        return 1 + random.nextInt(9);
    }

    public String questionGenerator() {
        random1 = randomGenerator();
        random2 = randomGenerator();
        return String.format("what is %d times %d? enter -1 to end program", random1, random2);
    }

    public int answerExtractor() {
        return getRandom1() * getRandom2();
    }

    public int displayQuestion() {
        int userReply;
        int answerExtracted;
        String question = questionGenerator();
        loopQuestion(question);
        return -1;
    }
int loopQuestion(String question) {
        int userReply = 0;
        int answerExtracted;
        while(true){
            String answer = JOptionPane.showInputDialog(null, question);
            userReply = Integer.parseInt(answer);
            answerExtracted = answerExtractor();

            if (userReply == -1){
                return -1;
            }

            if (userReply != answerExtracted) {
                JOptionPane.showMessageDialog(null, "Wrong!");
            }

            if (userReply == answerExtracted) {
                JOptionPane.showMessageDialog(null, "Correct!");
                question = questionGenerator();
            }
        }
    }
}
