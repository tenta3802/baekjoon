import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list;
		int n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			int candy = sc.nextInt();
			int box = sc.nextInt();
			int sum = 0;
			int cnt = 0;
			int answer = 0;
			list = new ArrayList<Integer>();
			for (int i = 0; i < box; i++) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				int size = h*w;
				list.add(size);
			}
			Collections.sort(list);
			Collections.reverse(list);
			for(int k=0; k<list.size(); k++) {
				sum += list.get(k);
				cnt++;
				if(candy - sum <= 0) {
					if(answer > 0) {
						continue;
					}
					answer = cnt;
				}
			}
			System.out.println(answer);
		}
	}
}