import java.util.ArrayList;
import java.util.Scanner;

public class Pen extends Product{
    public static Scanner input = new Scanner(System.in);
    private String color, material, ink, smooth;
    public void add(ArrayList<Product> products){
        System.out.println("Nhap thong tin san pham muon them");
        Pen pen = new Pen();
        String infor;

        System.out.println("Nhap ten san pham: ");
        infor = input.nextLine();
        pen.setName(infor);

        System.out.println("Gia san pham: ");
        infor = input.nextLine();
        pen.setPrice(infor);

        System.out.println("Thuong hieu: ");
        infor = input.nextLine();
        pen.setBrand(infor);

        System.out.println("Loai muc: ");
        infor = input.nextLine();
        pen.setInk(infor);

        System.out.println("Mau: ");
        infor = input.nextLine();
        pen.setColor(infor);

        System.out.println("Chat lieu: ");
        infor = input.nextLine();
        pen.setMaterial(infor);

        System.out.println("Do min: ");
        infor = input.nextLine();
        pen.setSmooth(infor);

        products.add(pen);
    }
    public void show(){
        System.out.printf("------");
        System.out.println("Ten san pham: " + getName());
        System.out.println("Gia san pham: " + getPrice());
        System.out.println("Thuong hieu: " + getBrand());
        System.out.println("Mau sac: " + getColor());
        System.out.println("Chat lieu: " + getMaterial());
        System.out.println("Loai muc: " + getInk());
        System.out.println("Do min: " + getSmooth());
    }
    public void showTable() {
        String leftAlignFormat = "| %-15s | %-12s | %-15s | Mau sac: %-30s | \n";
        System.out.format("+-----------------+-------------+-----------------+--------------------------|\n");
        System.out.format("| Ten san pham    | Gia ban     | Thuong hieu     | Thong tin them           |\n");
        System.out.format(leftAlignFormat, getName(), getPrice(), getBrand(), getColor());
        System.out.printf("|                 |             |                 | Chat lieu: %-18s|\n", getMaterial());
        System.out.printf("|                 |             |                 | Loai muc: %-19s|\n", getInk());
        System.out.printf("|                 |             |                 | Do min: %-21s|\n", getSmooth());
        System.out.format("+-----------------+-------------+-----------------+--------------------------\n");
    }
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getInk() {
        return ink;
    }

    public String getSmooth() {
        return smooth;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setInk(String ink) {
        this.ink = ink;
    }

    public void setSmooth(String smooth) {
        this.smooth = smooth;
    }
}
