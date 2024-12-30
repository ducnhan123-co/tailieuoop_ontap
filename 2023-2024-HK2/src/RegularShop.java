import java.util.Scanner;

public class RegularShop extends Shop{
    private double hesophuthu;

    public RegularShop(String tenGianHang, double dienTich, double hesophuthu) {
        super(tenGianHang, dienTich);
        this.hesophuthu = hesophuthu;
    }

    public double getHesophuthu() {
        return hesophuthu;
    }

    public void setHesophuthu(double hesophuthu) {
        this.hesophuthu = hesophuthu;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap he so phu thu");
        Scanner sc = new Scanner(System.in);
        this.hesophuthu = sc.nextDouble();
    }

    @Override
    public double tinhTienThue() {
        if (this.getDienTich() > 50) {
            return this.getDienTich() * 5000 + (this.hesophuthu * this.getDienTich() * 5000);
        } else {
            return this.getDienTich() * 3000 + (this.hesophuthu * this.getDienTich() * 3000);
        }

    }
}
