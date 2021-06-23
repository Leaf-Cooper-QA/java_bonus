package bonusExercises;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		System.out.println(lpf(126));
		System.out.println(lpf(455));
		
	}

	private static int lpf(int i) {
		// Not efficient but it'll do
		int j = i-1;
		while(j>=2) {
			if (i%j == 0 && checkifprime(j)) {
				return j;
			}
			j--;
		}
		return 2;
	}
	
	
	private static boolean checkifprime(int i) {
		double upperlimit = i/2;
		int iter = 2;
		while (iter <= upperlimit) {
			if (i%iter == 0) {
				return false;
			}
			iter++;
		}
		return true;
	}



}
