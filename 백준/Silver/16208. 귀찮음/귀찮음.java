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
			int num = sc.nextInt();
			list.add(num);
		}
		Collections.sort(list);
		Collections.reverse(list);
		int answer = 0;
		if(n == 1) {
			answer = list.get(0);
		}
		if (n > 1) {
			int sum = list.get(0);
			answer = list.get(0) * list.get(1);
			for (int i = 1; i < list.size(); i++) {
				if (i > 1) {
					answer += sum * list.get(i);
				}
				sum += list.get(i);
			}
		}
		System.out.println(answer);
	}
}