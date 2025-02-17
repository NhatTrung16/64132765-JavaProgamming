package lab1;

import java.util.Scanner;

public class DTB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập họ và tên sinh viên: ");
		String hoten = sc.nextLine();
		
		System.out.print("Nhập điểm trung bình: ");
		double dtb = sc.nextDouble();
		
		System.out.println("\nThông tin sinh viên");
		System.out.println("Họ tên sinh viên: "+hoten);
		System.out.println("Điểm trung bình: "+dtb);
	}
}
