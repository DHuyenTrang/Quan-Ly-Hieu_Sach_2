import java.util.Scanner;
public class Login {
    String account;
    Login(Scanner input){
        System.out.println("Welcome to my bookstore");
        System.out.println("Please login your account: ");
        this.account = input.nextLine();
        if(account.equals("admin")){
            System.out.println("Your password: ");
            String pass = input.nextLine();
            System.out.println("Hello Admin");
        }
        else{
            System.out.println("Hello Guest");
        }
    }
}
