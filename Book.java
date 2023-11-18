import java.util.ArrayList;
import java.util.Scanner;

public class Book extends Product{
    public static Scanner input = new Scanner(System.in);
    private String author, type, year, language;
    public void add(ArrayList<Product> products){
        Book book = new Book();
        String infor;
        System.out.println("Nhap thong tin sach muon them");

        System.out.println("Nhap ten sach: ");
        infor = input.nextLine();
        book.setName(infor);

        System.out.println("Nhap gia ban: ");
        infor = input.nextLine();
        book.setPrice(infor);

        System.out.println("Nhap ten the loai: ");
        infor = input.nextLine();
        book.setType(infor);

        System.out.println("Nhap ten tac gia: ");
        infor = input.nextLine();
        book.setAuthor(infor);

        System.out.println("Nhap nha xuat ban: ");
        infor = input.nextLine();
        book.setBrand(infor);

        System.out.println("Nhap nam xuat ban: ");
        infor = input.nextLine();
        book.setYear(infor);

        System.out.println("Nhap ngon ngu: ");
        infor = input.nextLine();
        book.setLanguage(infor);

        products.add(book);
    }

    void show(){
        System.out.printf("------");
        System.out.println("Ten san pham: " + getName());
        System.out.println("Gia san pham: " + getPrice());
        System.out.println("Ten tac gia: " + getAuthor());
        System.out.println("Nha xuat ban: " + getBrand());
        System.out.println("Nam xuat ban: " + getYear());
        System.out.println("Ngon ngu: " + getLanguage());
    }
    public void showTable() {
        String leftAlignFormat = "| %-15s | %-12s | %-15s | The loai: %-30s | \n";
        System.out.format("+-----------------+-------------+-----------------+--------------------------|\n");
        System.out.format("| Ten san pham    | Gia ban    | Nha xuat ban    | Thong tin them          |\n");
        System.out.format(leftAlignFormat, getName(), getPrice(), getBrand(), getType());
        System.out.printf("|                 |            |                 | Tac gia: %-20s|\n", getAuthor());
        System.out.printf("|                 |            |                 | Nam xuat ban: %-15s|\n", getYear());
        System.out.printf("|                 |            |                 | Ngon ngu: %-19s|\n", getLanguage());
        System.out.format("+-----------------+------------+-----------------+--------------------------\n");
    }
    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public String getYear() {
        return year;
    }

    public String getLanguage() {
        return language;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
