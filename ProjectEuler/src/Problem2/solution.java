/*
 * 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
 */
package Problem2;

public class solution {
	private long 기준값;
	
	public solution(long 기준값) {
		this.기준값 = 기준값; 
	}

	public long result(){
		
		long 이전값 = 1;
		long temp;
		long sum = 0;
		
		for(long i = 1; i<기준값 ;){
			
			temp = i;
			i = 이전값 + i;
			이전값 = temp;
			
			if ( i%2 == 0){
				sum = sum + i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] arg){
		solution solution = new solution(4000000);
		System.out.println(solution.result());
	}
}
