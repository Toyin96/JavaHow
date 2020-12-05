import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HeartRates newHeartRates = new HeartRates();

        System.out.println("Kindly enter your first name: ");
        newHeartRates.firstName = scan.nextLine();

        System.out.println("Kindly enter your last name: ");
        newHeartRates.lastName = scan.nextLine();

        System.out.println("Kindly enter your birth year: ");
        int input = scan.nextInt();
        newHeartRates.setYear(input);

        System.out.println("Kindly enter your birth date: ");
        int input1 = scan.nextInt();
        newHeartRates.setDay(input1);

        System.out.println("Kindly enter your birth month: ");
        int input2 = scan.nextInt();
        newHeartRates.setMonth(input2);

        System.out.printf("These are your details: %n%s %s%n%n", newHeartRates.getFirstName(), newHeartRates.getLastName());
        newHeartRates.displayDate(true);

        System.out.printf("%nYour age in years is: %d " + "years%n", newHeartRates.getYear());

        System.out.printf("Your maximum heart rate is: %.1f bpm%n ", newHeartRates.maximumHeartRate());

        System.out.printf("Your target heart rate is: %.1f bpm%n", newHeartRates.targetHeartRate());
    }
}
