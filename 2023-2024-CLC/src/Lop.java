public class Lop {
    private int masolop;
    private DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();

    public Lop(int masolop) {
        this.masolop = masolop;
    }

    public void themSinhVienVaoLop(SinhVien sinhVien) {
        danhSachSinhVien.them1SinhVien(sinhVien);
    }

    public void xuatDanhSach() {
        System.out.println("Lớp " + masolop + ":");
        danhSachSinhVien.xuatDanhSachSinhVien();
    }
}