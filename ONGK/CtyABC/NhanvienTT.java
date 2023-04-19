package CtyABC;

import java.util.ArrayList;

public class NhanvienTT extends Nhanvien {
	protected double hsdc1 = 1;
	protected double hsdc2 = 1.5;
	protected double hsnld = 0.5;
	protected double hsnkld = 0;
	ArrayList<Integer> hsngay = new ArrayList<Integer>();

	public NhanvienTT() {
	}

	public NhanvienTT(long manv, String tennv, String tendv, double luong) {
		super(manv, tennv, tendv, luong);
	}

	public void NhapTT() {
		System.out.println("Nhập mã nhân viên trực tiếp: ");
		MaNV = sc.nextLong();
		System.out.println("Nhập tên đơn vị: ");
		TenDV = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhập tên nhân viên: ");
		TenNV = sc.nextLine();
		System.out.println("Nhập lương nhân viên: ");
		Luong = sc.nextDouble();
	}

	public void NhapCC() {
		int n = rand.nextInt(29) + 1;
		for (int i = 0; i < n; i++)
			hsngay.add(rand.nextInt(3) + 1);
	}

	@Override
	public double luongngay(Integer hsngay1) {
		if (hsngay1 == 1)
			return Luong * hsdc1;
		else if (hsngay1 == 2)
			return hsdc2 * Luong;
		else if (hsngay1 == 3)
			return hsnld * Luong;
		else if (hsngay1 == 4)
			return hsnkld * Luong;
		return 0;
	}

	public double luongthang() {
		double tong = 0;
		for (Integer hsngay1 : hsngay)
			tong += luongngay(hsngay1);
		return tong;
	}

	public void Tinh_nlv_nnp_nnkp() {
		for (Integer hsngay1 : hsngay) {
			if (hsngay1 == 1 || hsngay1 == 2)
				tong_nlv++;
			else if (hsngay1 == 3)
				tong_nnp++;
			else if (hsngay1 == 4)
				tong_nnkp++;
		}
	}

	public void Xuat() {
		super.return0();
		Tinh_nlv_nnp_nnkp();
		System.out.println(
				"MaNVTT: " + MaNV + " TenNV: " + TenNV + " Tong ngay lam viec: " + tong_nlv + " Tong ngay nghi phep: "
						+ tong_nnp + " Tong ngay nghi ko phep: " + tong_nnkp + " Luong thang: " + luongthang());
	}
}
