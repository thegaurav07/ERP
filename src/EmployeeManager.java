import java.util.ArrayList;

class EmployeeManager {
    ArrayList<Employee> list = new ArrayList<>();

    void addEmployee(Employee e) {
        list.add(e);
        System.out.println("Employee Added");
    }

    void showEmployees() {
        for(Employee e : list) {
            e.display();
        }
    }
}
