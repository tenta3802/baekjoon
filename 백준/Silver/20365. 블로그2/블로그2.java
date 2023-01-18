import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String color = sc.nextLine();
		String[] arr = color.split("");
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			if(i > 0 && arr[i].equals(arr[i-1])) {
				continue;
			}
			list.add(arr[i]);
		}
		
		int cnt = 1;
		int bbCnt = 1;
		int rrCnt = 1;
		int bCnt = Collections.frequency(list, "B");
		int rCnt = Collections.frequency(list, "R");

		if (bCnt >= rCnt) {
			for (int i = 0; i < list.size(); i++) {
				if (i == list.size() - 1) {
					if (list.get(i).equals("R") && !list.get(i).equals(list.get(i - 1))) {
						cnt++;
						bbCnt++;
						break;
					}
					break;
				}
				if (list.get(i).equals("R") && list.get(i).equals("R") && !list.get(i).equals(list.get(i + 1))) {
					cnt++;
					bbCnt++;
				}
			}
		}
		if (rCnt >= bCnt) {
			for (int i = 0; i < list.size(); i++) {
				if (i == list.size() - 1) {
					if (list.get(i).equals("B") && !list.get(i).equals(list.get(i - 1))) {
						cnt++;
						rrCnt++;
						break;
					}
					break;
				}
				if (list.get(i).equals("B") && list.get(i).equals("B") && !list.get(i).equals(list.get(i + 1))) {
					cnt++;
					rrCnt++;
				}
			}
		}
		if (bCnt == rCnt) {
			if (bbCnt <= rrCnt) {
				cnt = bbCnt;
			}
			if (rrCnt <= bbCnt) {
				cnt = rrCnt;
			}
		}
		System.out.println(cnt);
	}
}