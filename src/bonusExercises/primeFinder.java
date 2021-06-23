package bonusExercises;

public class primeFinder {
	public static void main(String[] args) {
		System.out.println(checkifprime(997));
		System.out.println(checkifprime(1001));
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
