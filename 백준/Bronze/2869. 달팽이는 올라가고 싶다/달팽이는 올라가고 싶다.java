import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		String[] arr = s.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int v = Integer.parseInt(arr[2]);
		
		int height = v - a;
		int minu = a - b;
		int day = 1;
		int result = height / minu + day;
		if(height % minu > 0) {
			result += 1;
		}
		bw.write(String.valueOf(result));
		bw.flush();
	}
}