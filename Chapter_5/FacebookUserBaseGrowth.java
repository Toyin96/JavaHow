package Chapter5;

public class FacebookUserBaseGrowth {

    public static void main(String[] args) {

        calculatePower();

    }


    public static double calculatePower() {

        int month = 1;
        double amount = 1_000_000_000;

        System.out.printf("%s%17s%n","Month", "Amount");

        while (amount <= 1_500_000_000) {

            amount = 1000000000 * Math.pow(1 + 0.04, month);

            System.out.printf("%d%25.2f%n",month, amount);

            month++;
        }
        month = month - 1;
        System.out.println();
        System.out.printf("On the %dth month, Facebook reached and surpassed: %.2f", month, amount);
        return amount;
    }
}
