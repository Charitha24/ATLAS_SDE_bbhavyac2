import java.util.Scanner;
public class Task012 {
    public static void main(String[] args){
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Login ID: ");
        String loginId = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        int count = 0;

        while(loginId == "Bhavya" && password == "1234567"){
            System.out.println("You have logged in for: " +count+ " times");
            System.out.println("Enter Your Login Id and password: ");
            loginId = sc.nextLine();
            password = sc.nextLine();
        }
         */
        Scanner sc = new Scanner(System.in);
        String loginId = "Bhavya";
        String password = "1234567";
        int count = 0;
        String choice;
        do{
            System.out.print("Enter Login ID: ");
            String inputLoginID = sc.nextLine();
            System.out.print("Enter Password: ");
            String inputPassword = sc.nextLine();
            if(loginId.equals(inputLoginID) && password.equals(inputPassword)){
                count++;
                System.out.println("You have logged in successfully for: "+count+" times.");
            }
            else{
                System.out.println("Invalid Login Credentials. Please Try again.");
            }
            System.out.print("Want to Continue?: ");
            choice = sc.nextLine().trim().toLowerCase();

        }while(choice.equals("yes"));
    }
}
