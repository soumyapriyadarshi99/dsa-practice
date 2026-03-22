package dsa;

public class FactRecur {
	public static int getFactorial(int n) {
		if(n<=0) {
			return 1;
		}
		int rans =  getFactorial(n-1);
		int ans = n * rans;
		return ans;
	}
	
	public static void main (String [] args) {
		int val = getFactorial(5);
		System.out.print(val);
	}
}
