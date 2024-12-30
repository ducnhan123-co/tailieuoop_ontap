package Cau2;

public class StandardMember extends Member {
    public StandardMember(String ten, int loai, String diachi) {
        super(ten, loai, diachi);
    }

    @Override
    public double tinhPhiThanhVien() {
        return 100000;
    }
}
