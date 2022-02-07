package andersenlab.lesson3;

public class ArrayEmployee {
    public static Employee[] createArrayEmployees() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Harry James Potter", "Engineer", "HarryPoter@hogw.mag",
                "+375297777777", 5000, 35);

        employees[1] = new Employee("Hermione Jean Granger", "QA Automation Engineer",
                "Hermion2000@hogw.mag", "+375295276490", 7000, 33);

        employees[2] = new Employee("Ronald Bilius Weasley", "QA Engineer",
                "BiliDragon@hogw.mag", "+375298492664", 2000, 36);

        employees[3] = new Employee("Ginevra Molly Weasley", "Main architector",
                "BigBoss@hogw.mag", "+375298462018", 15000, 41);

        employees[4] = new Employee("Rubeus Hagrid", "Security guard", "Rubeus77@hogw.mag",
                "+375299072115", 1000, 43);
        return employees;
    }
}
