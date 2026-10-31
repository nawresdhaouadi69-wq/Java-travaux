
public class Ex9 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat = resultat * x;
        }

        System.out.println(x + "^" + n + " = " + resultat);

	}

}
