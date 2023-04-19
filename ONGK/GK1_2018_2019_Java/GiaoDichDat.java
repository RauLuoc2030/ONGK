package GK1_2018_2019_Java;

public class GiaoDichDat extends GiaoDich {
    private int loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, int dienTich, int loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public double ThanhTien() {
        if (loaiDat == 1) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 2.0;
        }
    }
}
