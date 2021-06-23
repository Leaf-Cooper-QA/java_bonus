package bonusExercises;

public class BottlesOfBeer {
	public static void main(String[] args) {
		song();
	}

	private static void song() {
		for(int i =99; i>=1; i--) {
			int j = i-1;
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
			System.out.println("Take one down and pass it around, " + j + " bottles of beer on the wall");
		}
		
	}

}
