import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        while(true){
            Login dangNhap = new Login(input);
            if(dangNhap.account.equals("admin")){
                Admin admin = new Admin();
                while(true) {
                    admin.menu();
                    switch (admin.choice){
                        case 1:
                            admin.add(products);
                            break;
                        case 2:
                            admin.testGuest(products);
                            break;
                        case 3:
                            admin.exit();
                            break;
                    }
                    if(admin.choice == 3) break;
                }
            }
            else if(dangNhap.account.equals("khach")){
                Guest guest = new Guest(input);
                switch (guest.choice){
                    case 1:
                        guest.findBook(products);
                        break;
                    case 2:
                        guest.showProduct(products);
                    default:
                        return;
                }
            }
            System.out.println("Do you want continue login!");
            System.out.println("1 or 0");
            String choose = input.nextLine();
            if(choose.equals("0")){
                System.out.println("Goodbye");
                return;
            }
        }

    }
}