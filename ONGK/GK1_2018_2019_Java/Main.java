package GK1_2018_2019_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<>();

        while (true) {
            System.out.println("Nhap ma giao dich: ");
            String maGD = sc.next();
            if (maGD.equals("")) {
                break;
            }

            System.out.println("Nhap ngay giao dich: ");
            String ngayGD = sc.next();

            System.out.println("Nhap don gia: ");
            double donGia = sc.nextDouble();

            System.out.println("Nhap dien tich: ");
            int dienTich = sc.nextInt();

            System.out.println("Nhap loai giao dich: ");
            System.out.println("Nhap 1 la Giao dich Dat || Nhap 2 la Giao dich Nha");
            int loaiGiaoDich = sc.nextInt();
            if (loaiGiaoDich == 1) {
                System.out.println("Nhap loai dat \n Nhap 1 la loai A \n Nhap 2 la loai B");
                int loaiDat = sc.nextInt();
                GiaoDich giaoDichDat = new GiaoDichDat(maGD, ngayGD, donGia, dienTich, loaiDat);
                danhSachGiaoDich.add(giaoDichDat);
            } else {
                System.out.println("Nhap loai nha \n Nhap 1 la loai cao cap \n Nhap 2 la loai biet thu");
                int loaiNha = sc.nextInt();
                System.out.println("Nhap he so vi tri: ");
                int heSoViTri = sc.nextInt();
                GiaoDich giaoDichNha = new GiaoDichNha(maGD, ngayGD, donGia, dienTich, loaiNha, heSoViTri);
                danhSachGiaoDich.add(giaoDichNha);
            }
        }
    }
}
