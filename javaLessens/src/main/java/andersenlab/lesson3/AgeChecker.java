package andersenlab.lesson3;

public class AgeChecker {
    public static void checkAgeEmployee(Employee[] employees) {
        for (Employee checkedEmployee : employees) {
            if (checkedEmployee.getAge() >= 40) {
                checkedEmployee.info();
            }
        }
    }
}
