package Chapter4;

import javax.swing.*;
import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {


    public String numEncrypter() {

        Scanner scan = new Scanner(System.in);

        String number = JOptionPane.showInputDialog("Enter any four-digit integer: ");
        int num = Integer.parseInt(number);

        if (num < 10000) {

            char num1 = number.charAt(0);
            int numberOne = 7 + Integer.parseInt(String.valueOf(num1));
            numberOne %= 10;

            char num2 = number.charAt(1);
            int numberTwo = 7 + Integer.parseInt(String.valueOf(num2));
            numberTwo %= 10;

            char num3 = number.charAt(2);
            int numberThree = 7 + Integer.parseInt(String.valueOf(num3));
            numberThree %= 10;

            char num4 = number.charAt(3);
            int numberFour = 7 + Integer.parseInt(String.valueOf(num4));
            numberFour %= 10;

            String number1 = Integer.toString(numberOne);
            String number2 = Integer.toString(numberTwo);
            String number3 = Integer.toString(numberThree);
            String number4 = Integer.toString(numberFour);

            String finalNum = number3 + number4 + number1 + number2;

            return finalNum;
        } else {
            return "You did not enter a four-digit integer";
        }
    }
}