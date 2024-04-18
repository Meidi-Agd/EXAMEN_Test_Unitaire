package TestEmployeeManager;


import EmployeeManager.Employee;
import EmployeeManager.EmployeeManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestEmployeeManager {
    private final EmployeeManager employeeManager = new EmployeeManager();

    @Test // Méthode exercice 1 D
    public void testEmployeeNiveauJuniorUnAn() {
        Employee emp = new Employee("Son", "John", 1, "Junior");

        double result = employeeManager.calculateSalary(emp) * employeeManager.calculateExperienceMultiplier(emp.getAnneeExp());
        int intResult = (int) result;
        assertEquals(21000, intResult);
    }

    @Test // Méthode exercice 1 E
    public void testEmployeeNiveauInterCinqAn() {
        Employee emp = new Employee("Son", "John", 5, "Intermédiaire");

        double result = employeeManager.calculateSalary(emp) * employeeManager.calculateExperienceMultiplier(emp.getAnneeExp());
        int intResult = (int) result;
        assertEquals(50000, intResult);
    }

    @Test // Méthode exercice 1 E
    public void testEmployeeNiveauSeniorDixAn() {
        Employee emp = new Employee("Son", "John", 10, "Senior");

        double result = employeeManager.calculateSalary(emp) * employeeManager.calculateExperienceMultiplier(emp.getAnneeExp());
        int intResult = (int) result;
        assertEquals(90000, intResult);
    }

    @Test // Méthode exercice 1 E
    public void testEmployeeNiveauSeniorVingtAn() {
        Employee emp = new Employee("Son", "John", 20, "Senior");

        double result = employeeManager.calculateSalary(emp) * employeeManager.calculateExperienceMultiplier(emp.getAnneeExp());
        int intResult = (int) result;
        assertEquals(120000, intResult);
    }

    @Test // Méthode exercice 1 H
    public void testEmployeeNiveauJuniorQuinzeAn() {
        Employee emp = new Employee("Son", "John", 15, "Junior");

        double result = employeeManager.calculateSalary(emp) * employeeManager.calculateExperienceMultiplier(emp.getAnneeExp());
        int intResult = (int) result;
        assertEquals(35000, intResult);
    }

    @Test // Méthode exercice 1 H
    public void testEmployeeNiveauInterQuinzeAn() {
        Employee emp = new Employee("Son", "John", 15, "Intermédiaire");

        double result = employeeManager.calculateSalary(emp) * employeeManager.calculateExperienceMultiplier(emp.getAnneeExp());
        int intResult = (int) result;
        assertEquals(70000, intResult);
    }
}
