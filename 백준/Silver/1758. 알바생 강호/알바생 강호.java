import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<Long>();
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			long tip = sc.nextInt();
			list.add(tip);
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		long sum = 0;
		for(int i=0; i<list.size(); i++) {
			long money = list.get(i) - i;
			if(money < 0) {
				continue;
			}
			sum+=money;
		}
		System.out.println(sum);
	}
}