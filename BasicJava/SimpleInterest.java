package BasicJava;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  p");
		int p=sc.nextInt();
		System.out.println("Enter T");
		int T=sc.nextInt();
		System.out.println("Enter R");
		int R=sc.nextInt();
				
				int s=p*T*R/100;
		System.out.println("Simple Interest"+s);

	}

}
