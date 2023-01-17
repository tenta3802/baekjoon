import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> disList = new ArrayList<Integer>();
		List<Integer> oilList = new ArrayList<Integer>();
		List<Integer> subOilList = oilList;

		int n = sc.nextInt();

		for (int i = 0; i < n - 1; i++) {
			int distence = sc.nextInt();
			disList.add(distence);
		}
		for (int i = 0; i < n; i++) {
			int oilPrice = sc.nextInt();
			if (i == n - 1) {
				continue;
			}
			oilList.add(oilPrice);
		}
		int minPrice = Collections.min(subOilList);
		subOilList = subOilList.subList(0, minPrice);
		int sum = 0;
		for (int i = 0; i < subOilList.size(); i++) {
			int point = subOilList.get(i);
			for (int j = i+1; j < subOilList.size(); j++) {
				if (point > subOilList.get(j)) {
					sum += point * caculateDisSum(disList, j);
				}
			}
		}
		int index = oilList.indexOf(minPrice);
		int disSum = 0;
		for(int i=index; i<disList.size(); i++) {
			disSum += disList.get(i);
		}
		sum += minPrice * disSum;
		System.out.println(sum);
	}
	public static int caculateDisSum(List<Integer> disList, int j) {
		int sum = 0;
		for(int i=0; i<=j-1; i++) {
			sum += disList.get(i);
		}
		return sum;
	}
}