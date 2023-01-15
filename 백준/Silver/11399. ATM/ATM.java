import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int time = sc.nextInt();
			list.add(time);
		}
		Collections.sort(list);
		
		int oneSum = 0;
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<=i; j++) {
				oneSum += list.get(j);
			}
			sum += oneSum;
			oneSum = 0;
		}
		System.out.println(sum);
	}
}