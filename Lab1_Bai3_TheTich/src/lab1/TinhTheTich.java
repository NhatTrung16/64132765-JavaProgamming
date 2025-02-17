package lab1;

import java.util.Scanner;

public class TinhTheTich {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = sc.nextDouble();
		
		double thetich = Math.pow(canh, 3);
		
		System.out.println("\nThể tích của khối lập phương: "+thetich);
	}

}
