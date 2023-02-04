import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<String> list;
		int cnt = 0;
		for(int i=0; i<t; i++) {
			String str = sc.nextLine();
			list = new ArrayList<String>();
			String[] arrs = str.split("");
			
			for(int j=0; j<arrs.length; j++) {
				if(j>0 && arrs[j].equals(arrs[j-1])) {
					continue;
				}
				list.add(arrs[j]);
			}
			for(int j=0; j<list.size(); j++) {	
				int n = Collections.frequency(list, list.get(j));
				if(n > 1) {
					break;
				}
				if(j==list.size()-1) {
					cnt++;
				}
			}
		}		
		System.out.println(cnt);
	}
}