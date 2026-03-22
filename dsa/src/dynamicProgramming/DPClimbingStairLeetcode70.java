package dynamicProgramming;

import java.util.Scanner;

public class DPClimbingStairLeetcode70 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of stares: ");
		int stare = sc.nextInt();
		int[] memo = new int [stare+1];
		System.out.println(findStep(stare,memo));
	}
	
	public static int findStep(int n, int[] memo) {
		if(n<=1) {
			return 1;
		}
		if(memo[n] !=0) {
			return memo[n];
		}
		int step1=findStep(n-1,memo);
		int step2=findStep(n-2,memo);
		memo[n] = step1+step2;
		return memo[n];
	}

}
