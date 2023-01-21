import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] weight = new int[t];
		int[] height = new int[t];
		int[] rank = new int[t];
		for(int i=0; i<t; i++) {
			int w = sc.nextInt();
			weight[i] = w;
			int h = sc.nextInt();
			height[i] = h;
		}
		for(int i=0; i<weight.length; i++) {
			rank[i]++;
			for(int j=0; j<weight.length; j++) {
				if(weight[i] < weight[j] && height[i] < height[j]) {
					rank[i]++;
				}
			}
		}
		for(int i : rank) {
			System.out.println(i);
		}
	}
}