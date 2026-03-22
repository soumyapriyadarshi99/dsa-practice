package recursion;

import java.util.Scanner;

public class ClimbingStairLeetcode70 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of stares: ");
		int stare = sc.nextInt();
		System.out.println(findStep(stare));
	}
	
	public static int findStep(int n) {
		if(n<=1) {
			return 1;
		}
		int step1=findStep(n-1);
		int step2=findStep(n-2);
		return step1+step2;
	}

}
