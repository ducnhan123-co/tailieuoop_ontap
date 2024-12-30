import java.util.Scanner;

public class XeTai extends Xe{
    public int tan;
    public XeTai(){}

    public XeTai(String biensoxe, String mauxe, String nhanhieu, int tan) {
        super(biensoxe, mauxe, nhanhieu);
        this.tan = tan;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap trong tai cua xe: ");
        Scanner sc = new Scanner(System.in);
        this.tan = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Trọng tải của xe là : "+ this.tan);
    }

    @Override
    public double tinhSoTienQuaTram() {
        if (this.tan<3){
            return 15000;
        } else {
            return 30000;
        }
    }
}
