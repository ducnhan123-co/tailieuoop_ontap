import java.util.Arrays;

public class DanhSachLopHoc {
    private Lop[] dslh = new Lop[0];
    private int n = 0;

    public void them1LopHoc(Lop lop) {
        dslh = Arrays.copyOf(dslh, dslh.length + 1);
        dslh[n++] = lop;
    }

    public void xuatDanhSachLopHoc() {
        for (Lop lop : dslh) {
            lop.xuatDanhSach();

        }
    }
}