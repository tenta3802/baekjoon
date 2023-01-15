import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			int weight = sc.nextInt();
			list.add(weight);
		}
		Collections.sort(list);
		List<Integer> compareList = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			int leng = list.size();
			int a = list.get(i) * (leng - i);
			compareList.add(a);			
		}
		int answer = Collections.max(compareList);
		System.out.println(answer);
		
	}
}