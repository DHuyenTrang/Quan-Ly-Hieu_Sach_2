import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class NoteBook extends Product{
    public static Scanner input = new Scanner(System.in);
    private String page, type, color, size, material;
    public void show(){
        System.out.printf("------");
        System.out.println("Ten san pham: " + getName());
        System.out.println("Gia san pham: " + getPrice());
        System.out.println("Thuong hieu: " + getBrand());
        System.out.println("So trang: " + getPage());
        System.out.println("Loai vo: " + getType());
        System.out.println("Mau sac bia " + getColor());
        System.out.println("Chat lieu giay: " + getMaterial());
        System.out.println("Kich thuoc: " + getSize());
    }
    public void showTable() {
        String leftAlignFormat = "| %-15s | %-12s | %-15s | So trang: %-30s | \n";
        System.out.format("+-----------------+-------------+-----------------+--------------------------|\n");
        System.out.format("| Ten san pham    | Gia ban    | Thuong hieu     | Thong tin them          |\n");
        System.out.format(leftAlignFormat, getName(), getPrice(), getBrand(), getPage());
        System.out.printf("|                 |            |                 | Loai vo: %-20s|\n", getType());
        System.out.printf("|                 |            |                 | Mau sac bia: %-16s|\n", getColor());
        System.out.printf("|                 |            |                 | Chat lieu giay: %-13s|\n", getPage());
        System.out.printf("|                 |            |                 | Kich thuoc: %-17s|\n", getSize());
        System.out.format("+-----------------+------------+-----------------+--------------------------\n");
    }
    public void add(ArrayList<Product> products){
        System.out.println("Nhap thong tin vo ghi muon them");
        NoteBook noteBook = new NoteBook();
        String infor;

        System.out.println("Nhap ten san pham: ");
        infor = input.nextLine();
        noteBook.setName(infor);

        System.out.println("Nhap gia ban: ");
        infor = input.nextLine();
        noteBook.setPrice(infor);

        System.out.println("Thuong hieu: ");
        infor = input.nextLine();
        noteBook.setBrand(infor);

        System.out.println("So trang: ");
        infor = input.nextLine();
        noteBook.setPage(infor);

        System.out.println("Loai vo: ");
        infor = input.nextLine();
        noteBook.setType(infor);

        System.out.println("Mau sac bia ");
        infor = input.nextLine();
        noteBook.setColor(infor);

        System.out.println("Chat lieu giay: ");
        infor = input.nextLine();
        noteBook.setMaterial(infor);

        System.out.println("Kich thuoc: ");
        infor = input.nextLine();
        noteBook.setSize(infor);

        products.add(noteBook);
    }
    public void setPage(String page) {
        this.page = page;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPage() {
        return page;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }


}
