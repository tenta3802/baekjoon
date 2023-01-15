import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		StringBuilder sb = new StringBuilder(n);
		List<Integer> list = new ArrayList<Integer>();

		String num = "";
		String[] arr = n.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("+")) {
				list.add(Integer.parseInt(num));
				num = "";
				continue;
			}
			if (arr[i].equals("-")) {
				list.add(Integer.parseInt(num));
				num = "-";
				continue;
			}
			num += arr[i];
			if (i == arr.length - 1) {
				list.add(Integer.parseInt(num));
				break;
			}
		}
		int minuNum = 0;
		int sum = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i - 1) < 0) {
				if (list.get(i) > 0) {
					minuNum = list.get(i) * -1;
					list.set(i, minuNum);
				} else {
					minuNum = list.get(i);
				}
			}
			if (i!=1 && list.get(i - 1) == 0) {
				if (i>2 && list.get(i - 2) < 0) {
					if (list.get(i) > 0) {
						minuNum = list.get(i) * -1;
						list.set(i, minuNum);
					} else {
						minuNum = list.get(i);
					}
				}
			} else {
				minuNum = list.get(i);
			}
			sum += minuNum;
		}
		System.out.println(sum);
	}
}