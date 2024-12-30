package Cau2;

public class SeniorMember extends Member {
    public SeniorMember(String ten, int loai, String diachi) {
        super(ten, loai, diachi);
    }

    @Override
    public double tinhPhiThanhVien() {
        if (this.loai <= 2) {
            return 200000;
        } else {
            return 400000;
        }
    }
}
