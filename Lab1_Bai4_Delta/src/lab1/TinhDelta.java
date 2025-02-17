package lab1;

import java.util.Scanner;

public class TinhDelta {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Phương trình bậc 2");
		System.out.print("\nNhập a: ");
		double a = sc.nextDouble();
		
		System.out.print("\nNhập b: ");
		double b = sc.nextDouble();
		
		System.out.print("\nNhập c: ");
		double c = sc.nextDouble();
		
		double delta = (b*b) - 4*(a*c);
		double sqrtdelta = Math.sqrt(delta);
		
		if(delta >=0) {
			System.out.println("Căn bậc hai delta: "+sqrtdelta );
		} else {
			System.out.println("Delta âm, không có giá trị căn bậc 2 delta ");
		}
		

	}

}
