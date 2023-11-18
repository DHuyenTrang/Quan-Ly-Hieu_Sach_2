import java.util.ArrayList;
import java.util.Scanner;

public class Pencil extends Product{
    public static Scanner input = new Scanner(System.in);
    private String color, material, hardness;
    public void show(){
        System.out.printf("------");
        System.out.println("Ten san pham: " + getName());
        System.out.println("Gia san pham: " + getPrice());
        System.out.println("Thuong hieu: " + getBrand());
        System.out.println("Mau sac: " + getColor());
        System.out.println("Chat lieu: " + getMaterial());
        System.out.println("Do cung: " + getHardness());
    }
    public void showTable() {
        String leftAlignFormat = "| %-15s | %-12s | %-15s | Mau sac: %-30s | \n";
        System.out.format("+-----------------+-------------+-----------------+--------------------------|\n");
        System.out.format("| Ten san pham    | Gia ban     | Thuong hieu     | Thong tin them          |\n");
        System.out.format(leftAlignFormat, getName(), getPrice(), getBrand(), getColor());
        System.out.printf("|                 |             |                 | Chat lieu: %-18s|\n", getMaterial());
        System.out.printf("|                 |             |                 | Do cung: %-20s|\n", getHardness());
        System.out.format("+-----------------+-------------+-----------------+--------------------------\n");
    }
    public void add(ArrayList<Product> products){
        System.out.println("Nhap thong tin san pham muon them");
        Pencil pencil = new Pencil();
        String infor;

        System.out.println("Nhap ten san pham: ");
        infor = input.nextLine();
        pencil.setName(infor);

        System.out.println("Gia san pham: ");
        infor = input.nextLine();
        pencil.setPrice(infor);

        System.out.println("Thuong hieu: ");
        infor = input.nextLine();
        pencil.setBrand(infor);

        System.out.println("Chat lieu: ");
        infor = input.nextLine();
        pencil.setMaterial(infor);

        System.out.println("Do cung: ");
        infor = input.nextLine();
        pencil.setHardness(infor);

        products.add(pencil);
    }
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getHardness() {
        return hardness;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }
}
