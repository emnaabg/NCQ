
public class Algo1 {

	public static int[] solution(int N, int[] A) {
		
		int[] C=new int[N+1];
		
		for (int i=0;i<A.length;i++) {
			
			if ((A[i]>=1)&&(A[i]<=N)) {
				C[A[i]]++;
			}
			
			else if (A[i]==N+1){
				
				int max=C[1];
				for (int j=2;j<N+1;j++) {
					if (C[j]>max) {
						max=C[j];
					}
				}
				
				for (int k=1;k<N+1;k++) {
					C[k]=max;
				}
			}
			
		}     
		return C;
		}
	
	
	public static void main(String[] args) {
		
		int N=5;
		int[] C= {3,4,4,6,1,4,4};
		int[] R=solution(N,C);
		
		for (int i=1;i<N+1;i++) {
			System.out.println(R[i]+" ,");
		}
	}
	
}
