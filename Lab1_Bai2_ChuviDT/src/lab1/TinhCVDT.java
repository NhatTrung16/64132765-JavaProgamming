package lab1;

import java.util.Scanner;

public class TinhCVDT {

	public static void main(String[] args) {
		System.out.print("");
		
		
		//Ready for input
		Scanner banPhim = new Scanner(System.in);
		
		//Input
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
		double a= banPhim.nextDouble();
		
		System.out.print("Nhập chiều rộng của hình chữ nhật: ");
		double b= banPhim.nextDouble();
		
		
		
		double chuvi = 2 * (a+b);
		double dtich = a*b;
		double canhnho = Math.min(a, b);
		
		//Output
		System.out.println("Chu vi hình chữ nhật: "+ chuvi);
		System.out.println("Diện tích hình chữ nhật: "+ dtich);
		System.out.println("Cạnh nhỏ của hình chữ nhật: "+ canhnho);
	}

}
