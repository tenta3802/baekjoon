import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10000; i++) {
			String ii = "";
			ii += i;
			String[] arr = ii.split("");
			int sum = i;
			for (int j = 0; j < arr.length; j++) {
				sum += Integer.parseInt(arr[j]);
			}
			list.add(sum);
		}
		Collections.sort(list);
		for (int i = 1; i <= 10000; i++) {
			if(list.contains(i)) {
				continue;
			}
			System.out.println(i);
		}
	}
}