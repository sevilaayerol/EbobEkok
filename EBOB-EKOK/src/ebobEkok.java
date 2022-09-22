import java.util.Scanner;

public class ebobEkok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = input.nextInt();
		System.out.print("Enter n2: ");
		int n2 = input.nextInt();
		int i = 1, eb = 0;
		
	

		while (i <= n1 && i <= n2) {
			if ((n1 % i) == 0 && (n2 % i) == 0) {
				eb = i;
				}
			i++;
		}
		System.out.println("Ebob: " + eb);
		System.out.println("Ekok: " + (n1 * n2 / eb));

	}

}
