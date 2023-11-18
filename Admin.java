import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static Scanner input = new Scanner(System.in);
    public int choice;
    public void menu(){
        System.out.println("Your menu: ");
        System.out.println("1. Them san pham moi");
        System.out.println("2. Cac chuc nang cua khach");
        System.out.println("3. Dang xuat");
        System.out.println("Press any key to exit");
        System.out.print("Lua chon: ");
        choice = input.nextInt();
        input.nextLine();
    }
    public void add(ArrayList<Product> products){
        System.out.println("Chon san pham muon them: ");
        System.out.println("1. Sach");
        System.out.println("2. Vo viet");
        System.out.println("3. But chi");
        System.out.println("4, But muc");
        System.out.print("Lua chon: ");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                Book book = new Book();
                book.add(products);
                break;
            case 2:
                NoteBook noteBook = new NoteBook();
                noteBook.add(products);
                break;
            case 3:
                Pencil pencil = new Pencil();
                pencil.add(products);
                break;
            case 4:
                Pen pen = new Pen();
                pen.add(products);
                break;
            default:
                System.out.println("Khong hop le!!");
                break;
        }
        System.out.println("San pham da duoc them");
    }


    public void testGuest(ArrayList<Product> products){
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
    public void exit(){
        System.out.println("Goodbye admin");
        return;
    }

}
