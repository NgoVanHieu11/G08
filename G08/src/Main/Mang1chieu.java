package Main;
import java.util.Scanner;

public class Mang1chieu {

	public static void main(String[] args) {
		float mang[] = {1, 3, 5, 7, 9};
		System.out.println("Tong cua mang la: " + tong(mang));
		System.out.print("Tong SNT cua mang la: " + TongSoNguyenTo(mang));
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		float mang2[] = new float[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhap mang [%d]: ", i);
			mang2[i] = sc.nextFloat();
			c += mang2[i];
		}
		System.out.printf("Tong mang : " + c);
	}
	public static float tong(float[] mang) {
		float s = 0;
		for(int i = 0; i < mang.length; i++) {
			s += mang[i];
		}
		return s;
	}

	public static float TongSoNguyenTo(float[] mang) {
		float s = 0; 
		for(int i = 0; i<mang.length; i++) {
			int n = (int) mang[i];
			if((n == mang[i]) && Menu.songuyento(n)) {
				s +=n;
			}
		}
		return s;
	}
	
	 static float Min(float[] mang) {
		float m = Float.MAX_VALUE;
		for(int i = 0; i<mang.length; i++) {
			if(m > mang[i])
				m = mang[i];
		}
		return m;
	}
	 
	 static float Max(float[] mang) {
			float m = Float.MIN_VALUE;
			for(int i = 0; i<mang.length; i++) {
				if(m < mang[i])
					m = mang[i];
			}
			return m;
	}
	 
	static float Average(float[] mang) {
		float s = tong(mang);
		return s/mang.length;
	}
	/**
	 *  tim min, max, avg
	 *  @param mot mang so thuc
	 *  @return Min, Max, avg cua mang
	 */	
	public static float[] MinMaxAve(float[] mang) {
		float[] rs = new float[3];
		rs[0] = Min(mang);
		rs[1] = Max(mang);
		rs[2] = Average(mang);
		return rs;
	}
	
	/*public static float[][] Nhapmatran(float[][] mang) {
		 
	}
	
	public static void Xuatmatran(float[][] matrix()) {
		
	}
	
	public static void CongMaTran(float[][] m1, float[][] m2){
		
	}*/
	
}
