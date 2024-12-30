import java.util.Scanner;

public abstract class Xe {
    protected String biensoxe;
    protected String mauxe;
    protected String nhanhieu;

    public Xe() {
    }

    public Xe(String biensoxe, String mauxe, String nhanhieu) {
        this.biensoxe = biensoxe;
        this.mauxe = mauxe;
        this.nhanhieu = nhanhieu;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin xe");
        System.out.println("Nhập biển số xe: ");
        this.biensoxe = sc.nextLine();
        System.out.println("Nhập màu xe: ");
        this.mauxe = sc.nextLine();
        System.out.println("Nhập nhãn hiệu: ");
        this.nhanhieu = sc.nextLine();
    }

    public void xuat()
    {
        System.out.println("Biển số xe: "+ this.biensoxe +", màu xe: "+ this.mauxe + " , nhãn hiệu: "+ this.nhanhieu);
    }
    public abstract double tinhSoTienQuaTram();
}
