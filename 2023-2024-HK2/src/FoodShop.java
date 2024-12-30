public class FoodShop extends Shop{
    private double chiphiantoanTP = 2000.0;

    public FoodShop(String tenGianHang, double dienTich, double chiphiantoanTP) {
        super(tenGianHang, dienTich);
        this.chiphiantoanTP = chiphiantoanTP;
    }

    @Override
    public double tinhTienThue() {
        if (this.getDienTich() > 30) {
            return this.getDienTich() * 8000 + this.chiphiantoanTP;
        } else {
            return this.getDienTich() * 6000 + this.chiphiantoanTP;
        }

    }
}
