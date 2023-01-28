import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ab = new int[2];
		ab[0] = sc.nextInt();
		ab[1] = sc.nextInt();
		Arrays.sort(ab);
		
		int max = 0;
		for(int i=1; i<=ab[1]; i++) {
			if(ab[1]%i==0 && ab[0]%i==0) {
				max = i;
			}
		}
		int n = ab[0]/max;
		int m = ab[1]/max;
		int min = n*m*max;
		System.out.println(max);
		System.out.println(min);
	}
}