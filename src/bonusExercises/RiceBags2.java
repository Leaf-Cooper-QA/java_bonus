package bonusExercises;

public class RiceBags2 {
	public static void main(String[] args) {
		System.out.println(ricebags2(23,1,12));
	}

	private static int ricebags2(int i, int j, int k) {
		// TODO Auto-generated method stub
		// i = ones, j = fives, k = goal
		if (k%5 > i) {
			return -1;
		}
		if (k > (5*j)+i) {
			return -1;
		}
		return Math.max(k- (5*j),k%5);
	}

}
