package Chapter5;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {

    public static enum gameResponse {
        CORRECT, WRONG;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        gameResponse response;
        int correctAnswer = 0;

        String name;
        int questions = 5;

        System.out.println("========================================================================================================================");

        System.out.println("Welcome to the Global Warming Facts Quiz \uD83D\uDE0A");

        System.out.print("Kindly enter your name here: ");
        name = scan.nextLine();

        System.out.println();

        System.out.println("You have five questions to answer.\n");

                System.out.print("Question 1 (out of 5): Which of the following is NOT a negative effect of global warming?\n1. larger fish population \n2. new infectious diseases \n3. species extinction \n4. loss of coastal areas\n\nYour answer: ");
                int userResponse = scan.nextByte();

                if (userResponse == 1) {
                    response = gameResponse.CORRECT;
                    System.out.println(response);
                    correctAnswer++;
                }

                System.out.print("\nQuestion 2 (out of 5): Which of the following human activities does NOT release carbon dioxide into the atmosphere? \n1. burning fossil fuels \n2. fishing \n3. deforestation \n4. driving\n\nYour answer: ");
                userResponse = scan.nextByte();

                if (userResponse == 2) {
                    response = gameResponse.CORRECT;
                    System.out.println(response);
                    correctAnswer++;
                } else {
                    response = gameResponse.WRONG;
                    System.out.println(response);
                }

                System.out.print("\nQuestion 3 (out of 5): As air pollution continues to be released into the atmosphere, what becomes more depleted, resulting in an increase of ultraviolet radiation on earth? \n1. oceans \n2. rainforests \n3. ozone layer \n4. carbon dioxide\n\nYour answer: ");
                userResponse = scan.nextByte();

                if (userResponse == 3) {
                    response = gameResponse.CORRECT;
                    System.out.println(response);
                    correctAnswer++;
                } else {
                    response = gameResponse.WRONG;
                    System.out.println(response);
                }

                System.out.print("\nQuestion 4 (out of 5): Which of the following is a greenhouse gas that is released by human activities and speeds up global warming? \n1. petroleum \n2. natural gas \n3. carbon dioxide \n4. nuclear power\n\nYour answer: ");
                userResponse = scan.nextByte();

                if (userResponse == 3) {
                    response = gameResponse.CORRECT;
                    System.out.println(response);
                    correctAnswer++;
                } else {
                    response = gameResponse.WRONG;
                    System.out.println(response);
                }

                System.out.print("\nQuestion 5 (out of 5): What country emits the most carbon dioxide? \n1. China \n2. United States \n3. Russia \n4. India\n\nYour answer: ");
                userResponse = scan.nextByte();

                if (userResponse == 1) {
                    response = gameResponse.CORRECT;
                    System.out.println(response);
                    correctAnswer++;
                } else {
                    response = gameResponse.WRONG;
                    System.out.println(response);
                }

        if (correctAnswer == 5) {
            System.out.println("\nCongratulations!!! "+name + "...You scored " +correctAnswer + "/5. Your performance for today's quiz was Excellent \uD83D\uDE0A");
        } else {
            if (correctAnswer == 4) {
                System.out.println("\nYou scored " + correctAnswer + "/5. Your performance for today's quiz was very good... " + name);
            } else {
                System.out.println("\n"+name + "...You had " + correctAnswer + "/5. Time to brush up on your knowledge of global warming!!. \n\nHere are some websites that could be of help: \n1. https://www.infoplease.com/\n2. https://www.nationalgeographic.com/environment/global-warming/global-warming-quiz/\n3. https://www.earthday.org/the-climate-change-quiz/\n");
            }
            System.out.println("==========================================================================================================================================");
        }
    }
}
