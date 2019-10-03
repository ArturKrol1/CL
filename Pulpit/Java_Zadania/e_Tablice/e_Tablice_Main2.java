
public class Main2 {

	public static void main(String[] args) {

		String[] fruits = new String[4];

		fruits[0] = "truskawka";
		fruits[1] = "malina";
		fruits[2] = "borówka";
		fruits[3] = "gruszka";

			System.out.println("Pierwszy owoc to " + fruits[0]);
			System.out.println("Ostatni owoc to " + fruits[fruits.length - 1]);

		System.out.println("Wszystkie owoce to: ");
			for (int i = 0; i < fruits.length; i++) {
				System.out.println(fruits[i]);

			}
	}

}
