import java.util.Arrays;

public class DanhSachSinhVien {
    private SinhVien[] dssv = new SinhVien[0];
    private int n = 0;

    public void them1SinhVien(SinhVien sv) {
        dssv = Arrays.copyOf(dssv, dssv.length + 1);
        dssv[n++] = sv;
        System.out.println("Đã thêm sinh viên: " + sv.getTensinhvien());
    }

    public SinhVien timKiem1SinhVienTheoHo(String ho) {
        for (SinhVien sv : dssv) {
            if (sv.getHosinhvien().equalsIgnoreCase(ho)) {
                return sv;
            }
        }
        return null;
    }

    public void xuatDanhSachSinhVien() {
        for (SinhVien sv : dssv) {
            sv.xuat();
        }
    }
}
