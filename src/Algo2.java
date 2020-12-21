
public class Algo2 {

	public static int[] solution(int[] A, int[] B) {
		
		int[] R=new int[A.length];
		
		for (int i=0;i<A.length;i++) {
			
			int somme=1;
			int res=A[i];
			int p=1;
			
			while(2*p<A[i]) {
				
				res=res-1;
				somme=somme+res;
				p++;
			}
			
			if(A[i]%2==0) {
				
				R[i]=(somme+1)%(2*B[i]);
			}
			else {
				R[i]=somme%(2*B[i]);
			}
		}
		
		return R;
	}
	
	public static void main(String[] args) {

		int[] A= {4,4,5,5,1};
		int[] B= {3,2,4,3,1};
		int[] R=solution(A,B);
		
		for (int i=0;i<A.length;i++) {
			System.out.println(R[i]+" ,");
		}
	}
	
}


