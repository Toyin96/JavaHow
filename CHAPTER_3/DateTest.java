import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Date newDate = new Date(12,03, 2020);

        System.out.println("Enter your new day of birth: \n");
        newDate.setDay(scan.nextInt());

        newDate.displayDate(true);

        System.out.print("Enter your new month of birth: \n");
        newDate.setMonth(scan.nextInt());

        System.out.print("Enter your new year of birth: \n");
        newDate.setYear(scan.nextInt());

        newDate.displayDate(true);



    }
}
