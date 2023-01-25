import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] as = new int[t];
		
		for(int i=0; i<as.length; i++) {
			as[i] = sc.nextInt();
		}
		Arrays.sort(as);
		
		int tt = sc.nextInt();
		int[] bs = new int[tt];

		for(int i=0; i<bs.length; i++) {
			bs[i] = sc.nextInt();
		}
		
		for (int i = 0; i < bs.length; i++) {
			int answer = search(bs, as, i);
			System.out.println(answer);
		}
	}
	public static int search(int[] bs, int[] as, int i) {
		int mid;
		int low = 0;
		int high = as.length - 1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (bs[i] == as[mid]) {
				return 1;
			} else if (bs[i] < as[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return 0;
	}
}