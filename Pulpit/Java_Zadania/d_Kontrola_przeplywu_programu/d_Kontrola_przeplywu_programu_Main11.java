
public class Main11 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
            {
                if (j <= i){
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.print("\n");
        }
        for (int k = 1; k <= n; k++) {
            for (int l = 5; l >= 1; --l)
            {
                if (k <= l){
                    System.out.print("* ");
                } else {
                    System.out.print(6 - l + " ");
                }
            }
            System.out.print("\n");
        }
    }

}