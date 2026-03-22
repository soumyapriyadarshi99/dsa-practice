package dsa;

public class MultiplyRecur {
	public static int getMultiplicationValue(int a, int b) {
		if(b>a) {
			return getMultiplicationValue(b,a);
		}
		if(b==1) {
			return a;
		}
		int rans = getMultiplicationValue(a,b-1);
		int ans = a + rans;
		return ans;
	}
	public static void main(String [] args) {
		int multipliedValue = getMultiplicationValue(4,5);
		System.out.print(multipliedValue);
	}
}
