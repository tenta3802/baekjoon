import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String A = "(";
		final String Z = ")";
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
			String s = sc.nextLine();
			String[] arr = s.split("");
			
			if (arr[0].equals(Z)) {
				b = false;
				System.out.println("NO");
				continue;
			}
			
			int sum = 1;
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1].equals(Z) && arr[j].equals(A)) {
					if (sum < 0) {
						System.out.println("NO");
						break;
					}
				}
				if (arr[j].equals(A)) {
					sum++;
				}
				if (arr[j].equals(Z)) {
					sum--;
				}
				if (j == arr.length - 1) {
					if(sum == 0) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		}
	}
}