import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<Long>();
		List<Long> reverseList = new ArrayList<Long>();
		long n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			long gram = sc.nextLong();
			list.add(gram);
		}
		Collections.sort(list);

		reverseList.addAll(list);
		Collections.reverse(reverseList);

		int leng = list.size();
		long sum = 0;
		if (leng % 2 == 0) {
			long max = 0;
			for (int i = 0; i < leng / 2; i++) {
				sum = list.get(i) + reverseList.get(i);
				if (sum > max) {
					max = sum;
				}
			}
			System.out.println(max);
		}
		if (leng % 2 != 0) {
			long max = Collections.max(list);
			long rmax = Collections.max(reverseList);
			long index = list.indexOf(max);
			list.remove(max);
			long rindex = reverseList.indexOf(rmax);
			reverseList.remove(rmax);

			for (int i = 0; i < list.size(); i++) {
				sum = list.get(i) + reverseList.get(i);
				if (sum > max) {
					max = sum;
				}
			}
			System.out.println(max);
		}
	}
}