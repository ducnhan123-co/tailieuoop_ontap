package Cau2;

import java.util.Arrays;
import java.util.Scanner;

public class MemberList {
    public Member[] dstv = new Member[0];
    public int n;

    public MemberList() {
        this.n = 0;
        this.dstv = new Member[n];
    }

    public void them1ThanhVienVaoDanhSach() {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        while (true) {
            System.out.println("Nhập lựa chọn:");
            System.out.println("1. Thêm StandardMember");
            System.out.println("2. Thêm SeniorMember");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            luachon = sc.nextInt();

            if (luachon == 1) {
                StandardMember standardMember = new StandardMember("", 0, "");
                standardMember.nhapThongTin();
                dstv = Arrays.copyOf(dstv, dstv.length + 1);
                dstv[n++] = standardMember;
                System.out.println("Đã thêm StandardMember vào danh sách.");
            } else if (luachon == 2) {
                SeniorMember seniorMember = new SeniorMember("", 0, "");
                seniorMember.nhapThongTin();
                dstv = Arrays.copyOf(dstv, dstv.length + 1);
                dstv[n++] = seniorMember;
                System.out.println("Đã thêm SeniorMember vào danh sách.");
            } else {
                break;
            }
        }
    }

    public void tinhTongTienTatCa() {
        double tong = 0;
        for (Member member : dstv) {
            tong += member.tinhPhiThanhVien();
        }
        System.out.println("Tổng phí tất cả thành viên trong danh sách là: " + tong);
    }

    public void hienThiDanhSach() {
        System.out.println("Danh sách thành viên:");
        for (Member member : dstv) {
            System.out.println("Tên: " + member.getTen() + ", Loại: " + member.getLoai() + ", Địa chỉ: " + member.getDiachi() + ", Phí: " + member.tinhPhiThanhVien());
        }
    }
}
