package Cau2;

import java.util.Scanner;

public abstract class Member {
    protected String ten;
    protected int loai;
    protected String diachi;

    public Member(String ten, int loai, String diachi) {
        this.ten = ten;
        this.loai = loai;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên thành viên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập loại thành viên: ");
        this.loai = sc.nextInt();
        sc.nextLine(); // Clear buffer
        System.out.print("Nhập địa chỉ thành viên: ");
        this.diachi = sc.nextLine();
    }

    public abstract double tinhPhiThanhVien();
}
