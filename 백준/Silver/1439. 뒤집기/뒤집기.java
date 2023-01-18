import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] arr = s.split("");
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(i>0 && arr[i].equals(arr[i-1])) {
				continue;
			}
			list.add(Integer.parseInt(arr[i]));
		}
		
		int ocnt = Collections.frequency(list, 0);
		int lcnt = Collections.frequency(list, 1);
		
		if(ocnt <= lcnt) {
			System.out.print(ocnt);
		}
		else if(lcnt <= ocnt) {
			System.out.println(lcnt);
		}
 	}
}