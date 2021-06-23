package bonusExercises;

public class greatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(gcd(15,25));
		System.out.println(gcd(19,25));
	}

	private static int gcd(int p, int q) {
		// TODO Auto-generated method stub
		int maxval = Math.max(p, q);
		
 
		
		for (int k=maxval; k>=1; k--) {
			if (p%k==0 && q%k==0) {
				return k;
			}
		}
		return 1;
	}

}
