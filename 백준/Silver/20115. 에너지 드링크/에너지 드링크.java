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
			int drink = sc.nextInt();
			list.add(drink);
		}

		Collections.sort(list);
		double sum = 0;

		double init = Collections.max(list);
		for (int i = 0; i < list.size() - 1; i++) {
			double a = (double) list.get(i) / 2;
			init += a;
		}
		int intInit = (int) init;
		if (init > intInit) {
			System.out.println(init);
		} else {
			System.out.println(intInit);
		}
	}
}