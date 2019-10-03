
public class Main5 {

	public static void main(String[] args) {

		int[] numbers = new int[] {5, 9, 16, 33, 52, 64, 44, 21, 131, 2};
		int max = numbers[0];

		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		System.out.println(max);

	}

}



