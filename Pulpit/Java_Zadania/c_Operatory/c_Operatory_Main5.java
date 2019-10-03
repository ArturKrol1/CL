
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);
		//Wynik to 2 ponieważ zwiększono wartość zmiennej 'a' o 1, a następnie wyświetlono.
		System.out.println(a++);
		//Wynik to nadal 2 ponieważ wyświetlono wartość zmiennej 'a', a następnie zwiększono o 1 (czyli aktualny wartość to 3)
		System.out.println(a);
		//Wynik to 3 ponieważ jest to aktualna wartość zmiennej 'a'.
		b=a++;
		System.out.println(b);
		//Wynik to 3 ponieważ jest to aktualna wartość zmiennej 'a++'.
		b=++a;
		System.out.println(++a);
		//Wynik 6 składa się ze zmiennej 'b=++a' - wartość 1, zmiennej '++a" - wartość 5.
	}

}
