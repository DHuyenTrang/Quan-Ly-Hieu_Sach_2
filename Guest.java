import java.util.ArrayList;
import java.util.Scanner;

public class Guest {
    public static Scanner input = new Scanner(System.in);
    public int choice;
    Guest (Scanner input){
        System.out.println("Your menu: ");
        System.out.println("1. Tim kiem san pham");
        System.out.println("2. Xem danh sach san pham");
        System.out.println("Press any key to exit");
        System.out.println("Lua chon: ");
        choice = input.nextByte();
        input.nextLine();
    }
    public void findBook(ArrayList<Product> products) {
        System.out.println("Nhap thong tin muon tim kiem: ");
        String find = input.nextLine();
        System.out.println("Chon che do hien thi: ");
        System.out.println("1. Dang bang");
        System.out.println("2. Dang danh sach");
        int luaChon = input.nextByte();
        for(Product product: products) {
            if (product instanceof Book) {
                Book book = (Book) product;
                if (book.getBrand().contains(find) || book.getYear().contains(find) || book.getName().contains(find) || book.getLanguage().contains(find) || book.getType().contains(find) || book.getAuthor().contains(find) || book.getPrice().contains(find)) {
                    if(luaChon == 2) book.show();
                    else book.showTable();
                }
            } else if (product instanceof NoteBook) {
                NoteBook noteBook = (NoteBook) product;
                if (noteBook.getSize().contains(find) || noteBook.getColor().contains(find) || noteBook.getMaterial().contains(find) || noteBook.getPage().contains(find) || noteBook.getType().contains(find) || noteBook.getBrand().contains(find) || noteBook.getPrice().contains(find) || noteBook.getName().contains(find)) {
                    if(luaChon == 2) noteBook.show();
                    else noteBook.showTable();
                }
            } else if (product instanceof Pencil) {
                Pencil pencil = (Pencil) product;
                if (pencil.getHardness().contains(find) || pencil.getMaterial().contains(find) || pencil.getColor().contains(find) || pencil.getName().contains(find) || pencil.getBrand().contains(find) || pencil.getPrice().contains(find)) {
                    if(luaChon == 2) pencil.show();
                    else pencil.showTable();
                }
            } else {
                Pen pen = (Pen) product;
                if (pen.getSmooth().contains(find) || pen.getInk().contains(find) || pen.getName().contains(find) || pen.getBrand().contains(find) || pen.getPrice().contains(find) || pen.getInk().contains(find)) {
                    if(luaChon == 2) pen.show();
                    else pen.showTable();
                }
            }
        }
    }
    public void showProduct(ArrayList<Product> products){
        System.out.println("Danh sach sach hien tai:");
        for(Product product: products){
            if(product instanceof Book) ((Book) product).show();
            else if (product instanceof NoteBook) ((NoteBook) product).show();
            else if (product instanceof Pencil) ((Pencil) product).show();
            else ((Pen) product).show();
        }
    }
}
