import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        if(!login.authenticate()) {
            System.out.println("Invalid Login");
            return;
        }

        EmployeeManager em = new EmployeeManager();
        InventoryManager im = new InventoryManager();

        while(true) {
            System.out.println("\n1.Add Employee\n2.View Employees\n3.Add Product\n4.View Products\n5.Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();
                    em.addEmployee(new Employee(id, name, sal));
                    break;

                case 2:
                    em.showEmployees();
                    break;

                case 3:
                    System.out.print("Product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Product Name: ");
                    String pname = sc.next();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    im.addProduct(new Product(pid, pname, qty));
                    break;

                case 4:
                    im.showProducts();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
