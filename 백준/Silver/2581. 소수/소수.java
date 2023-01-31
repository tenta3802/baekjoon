import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<Integer>();
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		for (int i = start; i <= end; i++) {
			if (i == 2) {
				list.add(i);
				continue;
			}
			int num = cal(i);
			list.add(num);
		}
		int sum = 0;
		int min = 0;
		for (int i : list) {
			sum += i;
		}
		for (int i : list) {
			if (i != 0) {
				min = i;
				break;
			}
		}

		if (sum == 0) {
			bw.write(String.valueOf(-1));
		} else {
			bw.write(String.valueOf(sum) + "\n");
			bw.write(String.valueOf(min));
		}

		bw.flush();
	}

	public static int cal(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			}
			if (i == num - 1) {
				return num;
			}
		}
		return 0;
	}
}