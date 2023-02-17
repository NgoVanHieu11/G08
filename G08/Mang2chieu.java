package Main;

import java.util.Scanner;

public class Mang2chieu {
	public static void main(String[] args) {
		nhapmatrix();
        xuatmatrix();
        System.out.println("Tong hai ma tran la: "+ CongMaTran());
	}
    static float m1,m2,matrix[][];
    public static void nhapmatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang: ");
        m1=sc.nextInt();
        System.out.println("nhap so cot: ");
        m2=sc.nextInt();
        matrix=new float[(int)m1][(int) m2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print("  a["+i+","+j+"]=");
                matrix[i][j]=sc.nextFloat();
            }
            System.out.println();
        }
    }
    public static void xuatmatrix(){
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
            System.out.print(matrix[i][j] +"  ");
        }
        System.out.println("");
        }
    }
    public static float CongMaTran() {
		float s = 0;
		for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {

			s += matrix[i][j];
            }
		}
		return s;
    }
}
