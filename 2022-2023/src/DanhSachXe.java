import java.util.Arrays;
import java.util.Scanner;

public class DanhSachXe {
    public Xe [] danhsachxe = new Xe[0];
    public int n;

    public DanhSachXe(int n) {
        this.n = 0; // Khởi đầu không có xe nào
        this.danhsachxe = new Xe[n]; // Mảng có kích thước n
    }

    public void them1XeVaoDanhSach()
    {
        int luachon=0;
        System.out.println("Thêm 1 xe vào danh sách. Chọn 1 để thêm xe buýt , 2 để thêm xe tải");
        Scanner sc = new Scanner(System.in);
        luachon = sc.nextInt();
        if(luachon==1)
        {
            XeBuyt xeBuyt = new XeBuyt();
            xeBuyt.nhap();
            danhsachxe = Arrays.copyOf(danhsachxe,danhsachxe.length+1);
            danhsachxe[n] = xeBuyt;
            n++;
            System.out.println("Đã thêm 1 xe buýt vào danh sách thành công.");
        } else if(luachon==2)
        {
            XeTai xeTai = new XeTai();
            xeTai.nhap();
            danhsachxe = Arrays.copyOf(danhsachxe,danhsachxe.length+1);
            danhsachxe[n] = xeTai; // Gán xe tải vào phần tử cuối
            n++;
            System.out.println("Đã thêm 1 xe tải vào danh sách thành công.");

        } else {
            System.out.println("Lựa chọn không hợp lệ.");
            return;

        }
    }

    public void tongSoTienQuaTram() {
        double tong = 0;
        for (Xe xe : danhsachxe) {
            if (xe != null) { // Kiểm tra xe không null
                tong += xe.tinhSoTienQuaTram();
            }
        }
        System.out.println("Tổng số tiền tất cả các xe trong danh sách là: " + tong);
    }

}
