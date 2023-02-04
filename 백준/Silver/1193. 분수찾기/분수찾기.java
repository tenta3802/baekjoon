import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.parseInt(br.readLine());

		int i = 1;
		int sum = 0;
		int num = 0;
		while (true) {
			sum += i;
			if (sum >= x) {
				num = i;
				break;
			}
			i++;
		}
		int n = sum % x + 1;
		int nn = num - (n - 1);

		if (num % 2 == 0) {
			int temp = n;
			n = nn;
			nn = temp;
		}
		bw.write(String.valueOf(n + "/" + nn));
		bw.flush();
	}
}