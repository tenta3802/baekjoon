import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int book = sc.nextInt();
		int maxWeight = sc.nextInt();

		for (int i = 0; i < book; i++) {
			int weight = sc.nextInt();
			list.add(weight);
		}
		int sum = 0;
		int cnt = 0;
		for (int j = 0; j < list.size(); j++) {
			sum += list.get(j);
			if (sum < maxWeight) {
				if(j == list.size() -1) {
					cnt++;
					break;
				}
			}
			if (sum == maxWeight) {
				cnt++;
				sum = 0;
			}
			if (sum > maxWeight) {
				if (j == list.size() - 1) {
					cnt += 2;
					continue;
				}
				cnt++;
				sum = 0;
				j--;
			}
		}
		System.out.println(cnt);
	}
}