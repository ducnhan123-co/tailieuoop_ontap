public class Diem implements TinhDiemTrungBinh{
    public SinhVien sinhVien;

    public Diem(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public void capNhatDiemTrungBinh(SinhVien sv, double diemMoi) {
        sv.setDiemtrungbinh(diemMoi);
        System.out.println("Cập nhật điểm mới cho sinh viên: " + sv.getTensinhvien());
    }
}
