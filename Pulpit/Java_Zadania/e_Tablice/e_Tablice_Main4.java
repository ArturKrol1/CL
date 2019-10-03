
public class Main4 {

	public static void main(String[] args) {

		int[] numbers = {3, 5, 4, 8, 2, 1, 12, 19, 9, 24};
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}

			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % 2 == 1) {
					sumOdd += numbers[j];


				}
			}

		System.out.println("Suma liczb nieparzystych to: " + sumOdd);

	}

}
