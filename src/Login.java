import java.util.Scanner;

class Login {
    public boolean authenticate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String user = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();

        return user.equals("admin") && pass.equals("admin123");
    }
}
