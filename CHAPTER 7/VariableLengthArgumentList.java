package Chapter7;

import java.util.Scanner;

public class VariableLengthArgumentList {

    public static void main(String[] args) {

        int score1 = 12;
        int score2 = 10;
        int score3 = 8;
        int score4 = 6;
        int score5 = 4;
        int score6 = 2;

        Scanner scan = new Scanner(System.in);

        System.out.println(product(score1,score2,score3,score4,score5,score6));
    }


    public static int product(int...scores){
        int product = 1;
        for (int score : scores) {
            product *= score;
        }
        return product;
    }

}