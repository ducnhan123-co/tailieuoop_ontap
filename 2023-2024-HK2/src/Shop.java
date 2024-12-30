import java.util.Scanner;

public abstract class Shop {
    protected String tenGianHang;
    protected double dienTich;

    public Shop() {
    }

    public Shop(String tenGianHang, double dienTich) {
        this.tenGianHang = tenGianHang;
        this.dienTich = dienTich;
    }

    public String getTenGianHang() {
        return tenGianHang;
    }

    public void setTenGianHang(String tenGianHang) {
        this.tenGianHang = tenGianHang;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin : ");
        System.out.println("Nhap ten gian hang : ");
        this.tenGianHang = sc.nextLine();
        System.out.println("Nhap dien tich : ");
        this.dienTich = sc.nextDouble();

    }

    public abstract double tinhTienThue();
}
