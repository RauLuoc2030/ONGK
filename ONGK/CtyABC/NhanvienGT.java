package CtyABC;

import java.util.ArrayList;

public class NhanvienGT extends Nhanvien {  
	protected double hsdi = 0.9;
	protected double hsnld = 0.45;
	protected double hsnkld = 0;  
	ArrayList<Integer> hsngay = new ArrayList<Integer>();
	public void NhapTT()
	{
		System.out.println("Nhập mã nhân viên gián tiếp: ");
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
		for(int i = 0; i < n; i++) 
			hsngay.add(rand.nextInt(2)+ 1); 
	}
	@Override
	public double luongngay(Integer hsngay1)
	{  
			 if(hsngay1 == 1) return Luong * hsdi; 
			 else if(hsngay1 == 2) return hsnld * Luong;
			 else if(hsngay1 == 3) return hsnkld * Luong;
			 return 0; 
	} 
	public double luongthang() {
		double tong = 0;
		for(Integer hsngay1:hsngay) 
			tong += luongngay(hsngay1); 
		return tong;
	} 
	public void Tinh_nlv_nnp_nnkp()
	{
		for(Integer hsngay1:hsngay)
		{
			 if(hsngay1 == 1) tong_nlv++; 
			 else if(hsngay1 == 2) tong_nnp++;
			 else if(hsngay1 == 3) tong_nnkp++;
		}
	}
	public void Xuat()
	{
		super.return0();
		Tinh_nlv_nnp_nnkp();
		System.out.println("MaNVGT: " + MaNV + " TenNV: " + TenNV +  " Tong ngay lam viec: " + tong_nlv + " Tong ngay nghi phep: " + tong_nnp + " Tong ngay nghi ko phep: " + tong_nnkp + " Luong thang: " + luongthang());
	}
}
