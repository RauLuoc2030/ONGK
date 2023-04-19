package CtyABC;

import java.util.Random;
import java.util.Scanner;

public abstract class Nhanvien {
	protected long MaNV;
	protected String TenNV;
	protected String TenDV;
	protected double Luong;
	protected static int tong_nlv = 0; 
	protected static int tong_nnp = 0;
	protected static int tong_nnkp = 0;
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public Nhanvien()
	{
		MaNV = 0;
		TenNV = "";
		TenDV = "";
		Luong = 0;
	}
	public Nhanvien(long manv, String tennv, String tendv, double luong)
	{
		MaNV = manv;
		TenNV = tennv;
		TenDV = tendv;
		Luong = luong;
	}
	
	public abstract double luongngay(Integer hsngay1); 
	public abstract double luongthang();
	public abstract void Tinh_nlv_nnp_nnkp();
	public abstract void Xuat();
	public abstract void NhapTT();
	public abstract void NhapCC();
	public static void return0()
	{
		 tong_nlv = 0; 
		  tong_nnp = 0;
		  tong_nnkp = 0;
	}
}
