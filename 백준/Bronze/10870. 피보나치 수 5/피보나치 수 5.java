import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int sum = 2;
		int sub = 1;
		for (int i = 1; i < num-2; i++) {
			sum += sub;
			sub = sum - sub;
		}
		if(num==0) {
			sum = 0;
		}
		if(num==1) {
			sum = 1;
		}
		if(num==2) {
			sum = 1;
		}
		bw.write(String.valueOf(sum));
		bw.flush();
	}
}