import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int kk = 1;
		for(int i=k; i>0; i--) {
			if(k==0) {
				kk = 1;
				break;
			}
			kk *= i;
		}
		
		int nn = 1;
		for(int i=n; i>0; i--) {
			nn *= i;
		}
		
		int nk = n-k;
		int nnkk = 1;
		for(int i=nk; i>0; i--) {
			if(nk==0) {
				nnkk = 1;
				break;
			}
			nnkk *= i;
		}

		int m = nnkk*kk;
		System.out.println(nn/m);
	}
}