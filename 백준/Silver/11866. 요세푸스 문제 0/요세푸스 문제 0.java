import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 1;
		while (true) {
			if(list.size()==n) {
				break;
			}
			for (int i = 1; i <= n; i++) {
				if (list.contains(i)) {
					continue;
				}
				if (cnt == k) {
					list.add(i);
					cnt = 0;
				}
				cnt++;
			}
		}
		System.out.print("<");
		for(int i=0; i<list.size(); i++) {
			if(i==list.size()-1) {
				System.out.print(list.get(i));
				break;
			}
			System.out.print(list.get(i)+", ");
		}
		System.out.println(">");
	}
}