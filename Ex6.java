
public class Ex6 {

	public static void main(String[] args) {

        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < 6; i++) {
            int n = Integer.parseInt(args[i]);

            if (n > max) {
                max = n;
            }
        }

        System.out.println("Le maximum est " + max);

	}

}
