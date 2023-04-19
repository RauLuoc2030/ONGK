package GK1_2018_2019_Java;

public class GiaoDichNha extends GiaoDich {
    protected int loaiNha;
    protected int heSoViTri;

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, int dienTich, int loaiNha, int heSoViTri) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.heSoViTri = heSoViTri;
    }

    public GiaoDichNha() {
    }

    @Override
    public double ThanhTien() {
        if (loaiNha == 1) {
            return dienTich * donGia * heSoViTri;
        }
        else
        {
            return dienTich * donGia * heSoViTri * 1.5;
        }
    }
}
