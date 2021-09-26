package Modul5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double salaryIncrease() {
        salary *= 2;
        return salary;
    }

    void showInfo1() {
        System.out.println("ID: " + id + " " + "Surname: " + surname + " " + "Age: " + age + " " + " " + "Department: " + department + " " + "Salary before increase: " + salary);
    }

    void showInfo2() {
        System.out.println("ID: " + id + " " + "Surname: " + surname + " " + "Age: " + age + " " + " " + "Department: " + department + " " + "Salary after increase: " + salary);
    }

    static class EmployeeData {
        public static void main(String[] args) {
            Employee e1 = new Employee(243, "Ivanov", 32, 150.500, "Sales");
            Employee e2 = new Employee(546, "Gavrilov", 55, 91.500, "Service");
            e1.showInfo1();
            e1.salaryIncrease();
            e1.showInfo2();
            System.out.println();

            e2.showInfo1();
            e2.salaryIncrease();
            e2.showInfo2();
        }
    }
}
