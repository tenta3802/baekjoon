import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		int n = sc.nextInt();
		int money = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int unit = sc.nextInt();
			list.add(unit);
		}
		Collections.sort(list);
		Collections.reverse(list);

		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			int unit = list.get(i);
			if (money >= unit) {
				cnt += money / unit;
				money %= unit;
			}
			if(money == 0) {
				break;
			}
		}
		System.out.println(cnt);
	}
}