package bonusExercises;

public class riceBags {
	public static void main(String[] args) {
		System.out.println(ricebags(20,1,12));
	}

	private static boolean ricebags(int i, int j, int k) {
		// i = ones, j = fives, k = goal
		if (k%5 > i) {
			return false;
		}
		if (k < (5*j)+i) {
			return true;
		} else {
			return false;
		}
	}

}
