import java.util.Scanner;
public class Task007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.println("\nHi, \n");
        System.out.println("\t\tYour login ID is :"+userName);
        System.out.println(("And your password is : *********"));
    }
}