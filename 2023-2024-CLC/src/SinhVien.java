public class SinhVien {
    private int masinhvien;
    private String hosinhvien;
    private String tensinhvien;
    private String ngaysinh;
    private String nganh;
    private double diemtrungbinh;

    public SinhVien(int masinhvien, String hosinhvien, String tensinhvien, String ngaysinh, String nganh, double diemtrungbinh) {
        this.masinhvien = masinhvien;
        this.hosinhvien = hosinhvien;
        this.tensinhvien = tensinhvien;
        this.ngaysinh = ngaysinh;
        this.nganh = nganh;
        this.diemtrungbinh = diemtrungbinh;
    }

    public String getHosinhvien() {
        return hosinhvien;
    }

    public String getTensinhvien() {
        return tensinhvien;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public void xuat() {
        System.out.printf("MSSV: %d, Họ: %s, Tên: %s, Ngày Sinh: %s, Ngành: %s, Điểm TB: %.2f\n",
                masinhvien, hosinhvien, tensinhvien, ngaysinh, nganh, diemtrungbinh);
    }
}