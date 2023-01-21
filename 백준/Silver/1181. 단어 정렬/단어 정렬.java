import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<t; i++) {
			String s = br.readLine();
			set.add(s);
		}
		
		String[] sarr = new String[set.size()];
		int[] arr = new int[set.size()];
		int k = 0;
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			sarr[k] = s;
			int leng = s.length();
			arr[k] = leng;
			k++;
		}
		
		int temp = 0;
		String temps = "";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
	
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					temps = sarr[i];
					sarr[i] = sarr[j];
					sarr[j] = temps;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j] && sarr[i].compareTo(sarr[j]) > 0) {
					temps = sarr[i];
					sarr[i] = sarr[j];
					sarr[j] = temps;
				}
			}
		}
		for(int i=0; i<sarr.length; i++) {
			bw.write(sarr[i]+"\n");
			bw.flush();
		}
	}
}