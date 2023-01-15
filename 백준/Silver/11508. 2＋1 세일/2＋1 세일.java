import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int price = sc.nextInt();
			list.add(price);
		}
		Collections.sort(list);
		Collections.reverse(list);

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (i == 2 + (i / 3) * 3) {
				continue;
			}
			sum += list.get(i);
		}
		System.out.println(sum);
	}
}