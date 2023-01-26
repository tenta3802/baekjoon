import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String nm = br.readLine();
		String nums = br.readLine();
		List<Integer> list = new ArrayList<Integer>();
		String[] nmarr = nm.split(" ");
		String[] numarr = nums.split(" ");
		
		int m = Integer.parseInt(nmarr[1]);
		int sum = 0;
		for(int i=0; i < numarr.length-2; i++) {
			for(int j=i+1; j<numarr.length-1; j++) {
				for(int k=j+1; k<numarr.length; k++) {
					sum = Integer.parseInt(numarr[i]) + Integer.parseInt(numarr[j]) + Integer.parseInt(numarr[k]);
					if(sum <= m) {
						list.add(sum);
					}
				}
			}
		}
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list.get(0));
	}
}