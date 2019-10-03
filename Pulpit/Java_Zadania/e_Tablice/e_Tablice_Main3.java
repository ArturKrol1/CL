
public class Main3 {

	public static void main(String[] args) {

		int[] numbers = {3, 5, 4, 8, 2, 1, 12, 33, 21, 54};
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

			System.out.println("Suma elementów tablicy to: " + sum);

	}

}
