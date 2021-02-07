package Constructor_Demonstration;

public class EmployeeTest {

    public static void main(String[] args) {
        Date birth = new Date(13,12,1996);
        Date hire = new Date(19, 8, 2021);
        Employee employee = new Employee("Toyin", "Onagoruwa", hire, birth);
        
        System.out.println(employee);
    }
}
