import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String A = "AAAA";
		final String B = "BB";
		final String dat = ".";
		String answer = "";

		String board = sc.nextLine();

		String[] arr = board.split("");
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, arr);

		StringBuffer sb = new StringBuffer(answer);

		int cnt = 0;
		int bCnt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("X")) {
				bCnt++;
				cnt++;
			}
			if (list.get(i).equals(dat)) {
				if (cnt != 0) {
					System.out.println(-1);
					break;
				}
				bCnt = 0;
				cnt = 0;
				sb.append(dat);
			}
			if (cnt == 2) {
				cnt = 0;
				if (bCnt == 4) {
					bCnt = 0;
					sb.delete(sb.length() - 2, sb.length());
					sb.append(A);
				} else {
					sb.append(B);
				}
			}
			if (i == list.size() - 1) {
				if (cnt != 0) {
					System.out.println(-1);
				} else {
					System.out.println(sb.toString());
				}
			}
		}
	}
}