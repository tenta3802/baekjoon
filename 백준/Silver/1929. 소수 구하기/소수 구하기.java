import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] num = br.readLine().split(" ");
		int startNum = Integer.parseInt(num[0]);
		int endNum = Integer.parseInt(num[1]);

		int[] arr = new int[endNum + 1];

		for (int i = 0; i <= endNum; i++) {
			arr[i] = i;
		}
        arr[0] = 0;
		arr[1] = 0;
		for (int i = 2; i <= endNum; i++) {
			if (arr[i] == 0) {
				continue;
			}
			for (int j = 2; i*j <= endNum; j++) {
				arr[i * j] = 0;
			}
		}
		for (int i = startNum; i <= endNum; i++) {
			if (arr[i] != 0) {
				bw.write(arr[i]+"\n");
			}
			bw.flush();
		}
	}
}