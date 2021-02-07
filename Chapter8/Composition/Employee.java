package Constructor_Demonstration;

public class Employee {

    private String firstName;
    private String lastName;
    private Date hireDate;
    private Date birthDate;

    public Employee(String firstName, String lastName, Date hireDate, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                ", birthDate=" + birthDate +
                '}';
    }
}
