import java.util.Scanner;

public class XeBuyt extends  Xe{
    public int sotuyenxebuyt;
    public int dodailotrinh;


    public XeBuyt() {
    }

    public XeBuyt(String biensoxe, String mauxe, String nhanhieu, int sotuyenxebuyt, int dodailotrinh) {
        super(biensoxe, mauxe, nhanhieu);
        this.sotuyenxebuyt = sotuyenxebuyt;
        this.dodailotrinh = dodailotrinh;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập số tuyến xe buýt");
        Scanner sc = new Scanner(System.in);
        this.sotuyenxebuyt=sc.nextInt();
        System.out.println("Nhập độ dài lộ trình ");
        this.dodailotrinh=sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số tuyến của xe buýt là : "+ this.sotuyenxebuyt);
        System.out.println("Độ dài lộ trình là : "+ this.dodailotrinh);
    }

    @Override
    public double tinhSoTienQuaTram() {
        if (this.dodailotrinh>20)
        {
            return 10000;
        } else {
            return  5000;
        }
    }
}
