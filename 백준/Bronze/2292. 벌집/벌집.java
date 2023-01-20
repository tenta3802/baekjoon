import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		int cnt = 1;
		int i = 1;
		int lastNum = 2;
		
		loop1 :
		while(true) {
			if(n==1) {
				System.out.println(1);
				break;
			}
			sum += 6*i;// 7 19 37
			for(int j=lastNum; j<=sum; j++) {
				if(j==n) {
					System.out.println(cnt+1);
					break loop1;
				}
			}
			lastNum = sum + 1;
			cnt++;
			i++;
		}
	}
}