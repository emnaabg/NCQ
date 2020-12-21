import java.util.Arrays;

public class Algo3 {
	
	public static int solution(int[] A) {
		
		Arrays.sort(A);
		int  N=A.length-1;
		int min=Math.abs(A[N]);

		for(int i=N-1;i>=0;i--) {
			if (min<0) {
				min+=Math.abs(A[i]);
			}
			else {
				min-=Math.abs(A[i]);
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {

		int[] A= {-2,1,2,5};
		int r=solution(A);
		System.out.println(r);
		
	}
}
