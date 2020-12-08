import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double sum = 0;
        double gross = 0;
        double earnings = 0;

        System.out.println("How many item1($239.99) did you sold: ");
        double itemNew1 = item1 * input.nextInt();

        System.out.println("How many item2($129.75) did you sold: ");
        double itemNew2 = item2 * input.nextInt();

        System.out.println("How many item3($99.95) did you sold: ");
        double itemNew3 = item3 * input.nextInt();

        System.out.println("How many item4($350.89) did you sold: ");
        double itemNew4 = item4 * input.nextInt();

        sum = (itemNew1 + itemNew2 + itemNew3 + itemNew4);
        gross = 0.09 * sum;
        earnings = 200 + gross;

        System.out.printf("Well done on your sales strategy! your earnings are: $%.2f",earnings);



    }
}
