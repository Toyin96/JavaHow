public class HeartRates {

    String firstName;
    String lastName;
    Date dateofBirth;
    private int day;
    private int month;
    private int year;
    private double maximumHeartRate;
    private double targetHeartRate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void displayDate(boolean display) {
        if (display == true) {
            System.out.printf("%d/%d/%d", day, month, year);
        } else {
            System.out.println("Nothing to display");
        }
    }

    public int getYear() {
        year = 2020 - year;
        return year;
    }

    public double maximumHeartRate() {
        double maxHeartRate = 220 - year;
        this.maximumHeartRate = maxHeartRate;
        return this.maximumHeartRate;
    }

    public double getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public double targetHeartRate() {
        double targetHeartRate = (0.5 * (maximumHeartRate));
        this.targetHeartRate = targetHeartRate;
        return this.targetHeartRate;
    }

    public double getTargetHeartRate() {
        return targetHeartRate;
    }
}
