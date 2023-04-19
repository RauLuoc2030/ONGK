package GK1_2018_2019_Java;

public abstract class GiaoDich {
    protected String MaGiaoDich;
    protected String ngayGiaoDich;
    protected double donGia;
    protected int dienTich;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, int dienTich) {
        MaGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public GiaoDich() {
    }

    public abstract double ThanhTien();
}
