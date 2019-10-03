
public class Main5 {

	public static void main(String[] args) {

		int liczba = 12;
		int dzielnik = 2;
		int resultModulo = 0;

		resultModulo = liczba % dzielnik;

		if (resultModulo == 0) {
			System.out.println(liczba + " - parzysta");
		}
				else {
			System.out.println(liczba + " - nieparzysta");
		}
	}
}
