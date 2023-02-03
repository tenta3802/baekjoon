import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = { "dz=", "c=", "c-", "lj", "nj", "s=", "z=", "d-" };

		StringBuilder sb = new StringBuilder(str);
		int cnt = 0;
		int zeroCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			str = sb.toString();
			if (str.contains(arr[i])) {
				int index = str.indexOf(arr[i]);
				if (i == 0) {
					sb.replace(index, index + 3, "0");
					zeroCnt++;
					cnt++;
					i = -1;
				} else {
					sb.replace(index, index + 2, "0");
					cnt++;
					zeroCnt++;
					i = -1;
				}
			}
		}
		cnt += sb.length() - zeroCnt;
		System.out.println(cnt);
	}
}