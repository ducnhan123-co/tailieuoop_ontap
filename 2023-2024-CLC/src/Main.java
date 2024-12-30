import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(001,"Truong","Duc Nhan","14/08/2005","CNTT",8);
        SinhVien sv2 = new SinhVien(002,"Tran","Duc Nhan","14/08/2005","CNTT",6.5);
        SinhVien sv3 = new SinhVien(003,"Ngo","Duc Nhan","14/08/2005","CNTT",5);
        SinhVien sv4 = new SinhVien(004,"Le","Duc Nhan","14/08/2005","CNTT",9.5);
        SinhVien sv5 = new SinhVien(005,"Nguyen","Duc Nhan","14/08/2005","CNTT",9.5);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        danhSachSinhVien.them1SinhVien(sv1);
        danhSachSinhVien.them1SinhVien(sv2);
        danhSachSinhVien.them1SinhVien(sv3);
        danhSachSinhVien.them1SinhVien(sv4);
        danhSachSinhVien.them1SinhVien(sv5);
        danhSachSinhVien.xuatDanhSachSinhVien();


       Lop lop1= new Lop(111);
      lop1.themSinhVienVaoLop(sv1);
      lop1.themSinhVienVaoLop(sv2);
        Lop lop2= new Lop(112);

        lop2.themSinhVienVaoLop(sv3);
        lop2.themSinhVienVaoLop(sv4);
        DanhSachLopHoc danhSachLopHoc=new DanhSachLopHoc();
        danhSachLopHoc.them1LopHoc(lop1);
        danhSachLopHoc.them1LopHoc(lop2);
        danhSachLopHoc.xuatDanhSachLopHoc();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho sinh vien ");
        String ho = sc.nextLine();
     SinhVien svTim = danhSachSinhVien.timKiem1SinhVienTheoHo(ho);

        if (svTim != null) {
            svTim.xuat();
            System.out.println("Nhập điểm mới:");
            double diemMoi = sc.nextDouble();
            svTim.setDiemtrungbinh(diemMoi);
            System.out.println("Cập nhật thành công:");
            svTim.xuat();
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }
}