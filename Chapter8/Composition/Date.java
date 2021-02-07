package Constructor_Demonstration;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day (" + day + ") value must be between 1-31");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") value must be between 1-12");
        }
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") for the specified month and year");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d",day,month,year);
    }
}
