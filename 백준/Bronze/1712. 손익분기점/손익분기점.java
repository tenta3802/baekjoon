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
		String[] list = s.split(" ");
		
		int fix = Integer.parseInt(list[0]);
		int change = Integer.parseInt(list[1]);
		int price = Integer.parseInt(list[2]);
		int cha = price - change;
		while(true) {
			if(change >= price) {
				bw.write(String.valueOf(-1));
				break;
			}
			int result = fix / cha + 1;
			if(result > 0) {
				bw.write(String.valueOf(result));
				break;
			}
		}
		bw.flush();
	}
}