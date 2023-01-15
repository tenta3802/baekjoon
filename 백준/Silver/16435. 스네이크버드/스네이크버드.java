import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int init = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			int fruit = sc.nextInt();
			list.add(fruit);
		}
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)<=init) {
				init++;
			}
		}
		System.out.println(init);
	}
}