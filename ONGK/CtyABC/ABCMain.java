package CtyABC;

import java.util.ArrayList;

public class ABCMain 
{
	public static void main(String arg[]) 
	{
		ArrayList<Nhanvien> alnv = new ArrayList<Nhanvien>();
		for(int i = 0; i < 2; i++)
		{

			NhanvienGT nvgt = new NhanvienGT();  
			nvgt.NhapTT();
			nvgt.NhapCC();
			alnv.add(i,nvgt);   
			NhanvienTT nvtt = new NhanvienTT();
			nvtt.NhapTT();
			nvtt.NhapCC();
			alnv.add(i,nvtt);
		} 
		for(Nhanvien obj:alnv)
			obj.Xuat(); 
	}
}
