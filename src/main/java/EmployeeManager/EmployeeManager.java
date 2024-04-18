package EmployeeManager;

public class EmployeeManager {

    /**
     * Calcule du salaire de l'employee via son niveau
     * @param employee
     * @return salaire en int
     */
    public int calculateSalary(Employee employee) {
        String niveau = employee.getNiveau();

        switch (niveau) {
            case "Junior":
                return 20000;
            case "Intermédiaire":
                return 40000;
            case "Senior":
                return 60000;
            default:
                return 0;
        }
    }

    /**
     * Calcule de coefficient par le nombre d'année
     * @param anneesExperience
     * @return le coefficient multiplicateur en double
     */
    public double calculateExperienceMultiplier(int anneesExperience)
    {
        double coefficient = 1.00;
        for (int i = 0; i < anneesExperience; i++)
        {
            coefficient += 0.05;
        }

        return coefficient;
    }
}
