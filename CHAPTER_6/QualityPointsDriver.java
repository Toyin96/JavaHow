package Chapter6;

import java.util.Scanner;

public class QualityPointsDriver {

    public static void main(String[] args) {

        QualityPoints newQP = new QualityPoints();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your average: ");
        byte number = scan.nextByte();

        System.out.println(newQP.getAverage(number));
    }
}
